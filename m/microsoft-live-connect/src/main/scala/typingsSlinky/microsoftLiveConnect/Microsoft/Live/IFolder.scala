package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Folder object contains info about a user's folders in SkyDrive.
  * Folders can contain combinations of photos, videos, audio, and
  * subfolders. The Live Connect REST API supports reading Folder objects.
  * Use the wl.photos scope to read Folder objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user.
  */
@js.native
trait IFolder extends js.Object {
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
  implicit class IFolderOps[Self <: IFolder] (val x: Self) extends AnyVal {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
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
    def withSort_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_by")(value.asInstanceOf[js.Any])
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

