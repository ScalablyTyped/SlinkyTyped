package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withClient_updated_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_updated_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: IUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_embeddable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_embeddable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared_with(value: ISharedWith): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_with")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

