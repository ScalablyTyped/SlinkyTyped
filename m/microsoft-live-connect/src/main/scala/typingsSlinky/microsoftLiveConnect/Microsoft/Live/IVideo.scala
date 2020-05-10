package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Video object contains info about a user's videos on SkyDrive. The
  * Live Connect REST API supports creating, reading, updating, and deleting
  * Video objects. Use the wl.photos scope to read Video objects. Use the
  * wl.contacts_photos scope to read albums, photos, and videos that other
  * users have shared with the user. Use the wl.skydrive_update scope to
  * create, update, or delete Video objects.
  */
@js.native
trait IVideo extends js.Object {
  /**
    * The bit rate, in bits per second, of the video.
    */
  var bitrate: Double = js.native
  /**
    * The number of comments that are associated with the video.
    */
  var comments_count: Double = js.native
  /**
    * A value that indicates whether comments are enabled for the video. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean = js.native
  /**
    * The time, in ISO 8601 format, at which the video was created.
    */
  var created_time: String = js.native
  /**
    * A description of the video, or null if no description is specified.
    */
  var description: String = js.native
  /**
    * The duration, in milliseconds, of the video run time.
    */
  var duration: Double = js.native
  /**
    * Info about the user who uploaded the video.
    */
  var from: IUserInfo = js.native
  /**
    * The height, in pixels, of the video.
    */
  var height: Double = js.native
  /**
    * The Video object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether this video can be embedded. If this
    * video can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  /**
    * A URL of the video, hosted in SkyDrive.
    */
  var link: String = js.native
  /**
    * The file name of the video.
    */
  var name: String = js.native
  /**
    * The id of the folder where the item is stored.
    */
  var parent_id: String = js.native
  /**
    * A URL of a picture that represents the video.
    */
  var picture: String = js.native
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith = js.native
  /**
    * The size, in bytes, of the video.
    */
  var size: Double = js.native
  /**
    * The download URL for the video.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: String = js.native
  /**
    * The number of tags on the video.
    */
  var tags_count: Double = js.native
  /**
    * A value that indicates whether tags are enabled for the video. If
    * tags can be set, this value is true; otherwise, it is false.
    */
  var tags_enabled: Boolean = js.native
  /**
    * The type of object; in this case, "video".
    */
  var `type`: String = js.native
  /**
    * The time, in ISO 8601 format, at which the video was last updated.
    */
  var updated_time: String = js.native
  /**
    * The URL to upload video content, hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: String = js.native
  /**
    * The width, in pixels, of the video.
    */
  var width: Double = js.native
}

object IVideo {
  @scala.inline
  def apply(
    bitrate: Double,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    duration: Double,
    from: IUserInfo,
    height: Double,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    tags_count: Double,
    tags_enabled: Boolean,
    `type`: String,
    updated_time: String,
    upload_location: String,
    width: Double
  ): IVideo = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags_count = tags_count.asInstanceOf[js.Any], tags_enabled = tags_enabled.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideo]
  }
  @scala.inline
  implicit class IVideoOps[Self <: IVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: IUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
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
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
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
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags_enabled")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

