package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Folder object contains info about a user's folders in SkyDrive.
  * Folders can contain combinations of photos, videos, audio, and
  * subfolders. The Live Connect REST API supports reading Folder objects.
  * Use the wl.photos scope to read Folder objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user.
  */
@js.native
trait IFolder extends StObject {
  
  /**
    * The time, in ISO 8601 format, that the client machine updated the
    * file last.
    */
  var client_updated_time: String = js.native
  
  /**
    * The total number of items in the folder.
    */
  var count: Double = js.native
  
  /**
    * The time, in ISO 8601 format, at which the folder was created.
    */
  var created_time: String = js.native
  
  /**
    * A description of the folder, or null if no description is specified.
    */
  var description: String = js.native
  
  /**
    * Info about the user who created the folder.
    */
  var from: IUserInfo = js.native
  
  /**
    * The Folder object's ID.
    */
  var id: String = js.native
  
  /**
    * A value that indicates whether this folder can be embedded. If this
    * folder can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  
  /**
    * The URL of the folder, hosted in SkyDrive.
    */
  var link: String = js.native
  
  /**
    * The name of the folder.
    */
  var name: String = js.native
  
  /**
    * The resource ID of the parent.
    */
  var parent_id: String = js.native
  
  /**
    * Permissions info for the folder. Requires the wl.skydrive scope.
    */
  var shared_with: ISharedWith = js.native
  
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: String = js.native
  
  /**
    * The type of object; in this case, "folder".
    */
  var `type`: String = js.native
  
  /**
    * The time, in ISO 8601 format, that the system updated the file last.
    */
  var updated_time: String = js.native
  
  /**
    * The URL to upload items to the folder hosted in SkyDrive. Requires
    * the wl.skydrive scope.
    */
  var upload_location: String = js.native
}
object IFolder {
  
  @scala.inline
  def apply(
    client_updated_time: String,
    count: Double,
    created_time: String,
    description: String,
    from: IUserInfo,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    shared_with: ISharedWith,
    sort_by: String,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IFolder = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], sort_by = sort_by.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolder]
  }
  
  @scala.inline
  implicit class IFolderMutableBuilder[Self <: IFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_updated_time(value: String): Self = StObject.set(x, "client_updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_time(value: String): Self = StObject.set(x, "created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_embeddable(value: Boolean): Self = StObject.set(x, "is_embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with(value: ISharedWith): Self = StObject.set(x, "shared_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_by(value: String): Self = StObject.set(x, "sort_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_location(value: String): Self = StObject.set(x, "upload_location", value.asInstanceOf[js.Any])
  }
}
