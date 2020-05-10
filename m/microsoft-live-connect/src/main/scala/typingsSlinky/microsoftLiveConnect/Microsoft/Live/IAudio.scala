package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Audio object contains info about a user's audio in SkyDrive. The Live
  * Connect REST API supports creating, reading, updating, and deleting Audio
  * objects. Use the wl.skydrive scope to read Audio objects. Use the
  * wl.contacts_skydrive scope to read any audio that other users have shared
  * with the user. Use the wl.skydrive_update scope to create, update, or
  * delete Audio objects.
  */
@js.native
trait IAudio extends js.Object {
  /**
    * The audio's album name.
    */
  var album: String = js.native
  /**
    * The artist name of the audio's album.
    */
  var album_artist: String = js.native
  /**
    * The audio's artist name.
    */
  var artist: String = js.native
  /**
    * The number of comments associated with the audio.
    */
  var comments_count: Double = js.native
  /**
    * A value that indicates whether comments are enabled for the audio. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean = js.native
  /**
    * The time, in ISO 8601 format, at which the audio was created.
    */
  var created_time: String = js.native
  /**
    * A description of the audio, or null if no description is specified.
    */
  var description: String = js.native
  /**
    * The audio's playing time, in milliseconds.
    */
  var duration: Double = js.native
  /**
    * Info about the user who uploaded the audio.
    */
  var from: IUserInfo = js.native
  /**
    * The audio's genre.
    */
  var genre: String = js.native
  /**
    * The Audio object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether this audio can be embedded. If this
    * audio can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  /**
    * A URL to view the item on SkyDrive.
    */
  var link: String = js.native
  /**
    * The name of the audio.
    */
  var name: String = js.native
  /**
    * The id of the folder in which the audio is currently stored.
    */
  var parent_id: String = js.native
  /**
    * A URL to view the audio's picture on SkyDrive.
    */
  var picture: String = js.native
  /**
    * The object that contains permission info.
    */
  var shared_with: ISharedWith = js.native
  /**
    * The size, in bytes, of the audio.
    */
  var size: Double = js.native
  /**
    * The URL to use to download the audio from SkyDrive.
    * Warning
    * This value is not persistent. Use it immediately after making the
    * request, and avoid caching.
    */
  var source: String = js.native
  /**
    * The audio's title.
    */
  var title: String = js.native
  /**
    * The type of object; in this case, "audio".
    */
  var `type`: String = js.native
  /**
    * The time, in ISO 8601 format, at which the audio was last updated.
    */
  var updated_time: String = js.native
  /**
    * The URL to use to upload a new audio to overwrite the existing audio.
    */
  var upload_location: String = js.native
}

object IAudio {
  @scala.inline
  def apply(
    album: String,
    album_artist: String,
    artist: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    duration: Double,
    from: IUserInfo,
    genre: String,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    title: String,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IAudio = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudio]
  }
  @scala.inline
  implicit class IAudioOps[Self <: IAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbum_artist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
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
    def withGenre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
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

