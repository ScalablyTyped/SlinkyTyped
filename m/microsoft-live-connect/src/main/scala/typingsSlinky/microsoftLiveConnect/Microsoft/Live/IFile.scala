package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The File object contains info about a user's files in SkyDrive. The Live
  * Connect REST API supports creating, reading, updating, and deleting File
  * objects. Use the wl.skydrive scope to read File objects. Use the
  * wl.contacts_skydrive scope to read any files that other users have shared
  * with the user. Use the wl.skydrive_update scope to create, update, or
  * delete File objects.
  */
@js.native
trait IFile extends js.Object {
  
  /**
    * The time, in ISO 8601 format, that the client machine updated the
    * file last.
    */
  var client_updated_time: String = js.native
  
  /**
    * The number of comments that are associated with the file.
    */
  var comments_count: Double = js.native
  
  /**
    * A value that indicates whether comments are enabled for the file. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean = js.native
  
  /**
    * The time, in ISO 8601 format, at which the file was created.
    */
  var created_time: String = js.native
  
  /**
    * A description of the file, or null if no description is specified.
    */
  var description: String = js.native
  
  /**
    * Info about the user who uploaded the file.
    */
  var from: IUserInfo = js.native
  
  /**
    * The File object's ID.
    */
  var id: String = js.native
  
  /**
    * A value that indicates whether this file can be embedded. If this
    * file can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  
  /**
    * A URL to view the item on SkyDrive.
    */
  var link: String = js.native
  
  /**
    * The name of the file.
    */
  var name: String = js.native
  
  /**
    * The ID of the folder the file is currently stored in.
    */
  var parent_id: String = js.native
  
  /**
    * Object that contains permission info.
    */
  var shared_with: ISharedWith = js.native
  
  /**
    * The size, in bytes, of the file.
    */
  var size: Double = js.native
  
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: String = js.native
  
  /**
    * The URL to use to download the file from SkyDrive.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    * Note: This structure is not available if the file is an Office
    * OneNote notebook.
    */
  var source: String = js.native
  
  /**
    * The type of object; in this case, "file".
    * Note: If the file is a Office OneNote notebook, the type structure is
    * set to "notebook".
    */
  var `type`: String = js.native
  
  /**
    * The time, in ISO 8601 format, that the system updated the file last.
    */
  var updated_time: String = js.native
  
  /**
    * The URL to upload file content hosted in SkyDrive.
    * Note: This structure is not available if the file is an Microsoft
    * Office OneNote notebook.
    */
  var upload_location: String = js.native
}
object IFile {
  
  @scala.inline
  def apply(
    client_updated_time: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    from: IUserInfo,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    shared_with: ISharedWith,
    size: Double,
    sort_by: String,
    source: String,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IFile = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sort_by = sort_by.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFile]
  }
  
  @scala.inline
  implicit class IFileOps[Self <: IFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_updated_time(value: String): Self = this.set("client_updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_count(value: Double): Self = this.set("comments_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_enabled(value: Boolean): Self = this.set("comments_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_time(value: String): Self = this.set("created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_embeddable(value: Boolean): Self = this.set("is_embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_id(value: String): Self = this.set("parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with(value: ISharedWith): Self = this.set("shared_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_by(value: String): Self = this.set("sort_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_location(value: String): Self = this.set("upload_location", value.asInstanceOf[js.Any])
  }
}
