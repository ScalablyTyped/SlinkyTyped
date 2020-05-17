package typingsSlinky.gapiYoutube.anon

import typingsSlinky.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
    */
  var channelId: String = js.native
  /**
    * The channel title of the channel that the playlist item belongs to.
    */
  var channelTitle: String = js.native
  /**
    * The items description.
    */
  var description: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist that the playlist item is in.
    */
  var playlistId: String = js.native
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
    */
  var position: Double = js.native
  /**
    * The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String = js.native
  /**
    * The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item.
    */
  var resourceId: Kind = js.native
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  /**
    * The items title.
    */
  var title: String = js.native
}

object ChannelTitle {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    playlistId: String,
    position: Double,
    publishedAt: String,
    resourceId: Kind,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): ChannelTitle = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], playlistId = playlistId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTitle]
  }
  @scala.inline
  implicit class ChannelTitleOps[Self <: ChannelTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylistId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: Kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

