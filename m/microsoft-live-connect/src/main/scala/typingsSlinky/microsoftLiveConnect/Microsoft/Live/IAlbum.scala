package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Album object contains info about a user's albums in Microsoft
  * SkyDrive. Albums are stored at the root level of a user's SkyDrive
  * directory, and can contain combinations of photos, videos, audio, files,
  * and folders. The Live Connect REST API supports reading Album objects.
  * Use the wl.photos scope to read a user's Album objects. Use the
  * wl.skydrive scope to read a user's files. Use the wl.contacts_photos
  * scope to read any albums, photos, videos, and audio that other users have
  * shared with the user.
  */
@js.native
trait IAlbum extends js.Object {
  /**
    * The time, in ISO 8601 format, that the file was last updated.
    */
  var client_updated_time: String = js.native
  /**
    * The total number of items in the album.
    */
  var count: Double = js.native
  /**
    * The time, in ISO 8601 format, at which the album was created.
    */
  var created_time: String = js.native
  /**
    * A description of the album, or null if no description is specified.
    */
  var description: String = js.native
  /**
    * Info about the user who authored the album.
    */
  var from: IUserInfo = js.native
  /**
    * The Album object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether this album can be embedded. If this
    * album can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  /**
    * A URL of the album, hosted in SkyDrive.
    */
  var link: String = js.native
  /**
    * The name of the album.
    */
  var name: String = js.native
  /**
    * The resource ID of the parent.
    */
  var parent_id: String = js.native
  /**
    * The object that contains permissions info for the album. Requires the
    * wl.skydrive scope.
    */
  var shared_with: ISharedWith = js.native
  /**
    * The type of object; in this case, "album".
    */
  var `type`: String = js.native
  /**
    * The time, in ISO 8601 format, that the system updated the album last.
    */
  var updated_time: String = js.native
  /**
    * The URL to upload items to the album, hosted in SkyDrive. Requires
    * the wl.skydrive scope.
    */
  var upload_location: String = js.native
}

object IAlbum {
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
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IAlbum = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlbum]
  }
  @scala.inline
  implicit class IAlbumOps[Self <: IAlbum] (val x: Self) extends AnyVal {
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

