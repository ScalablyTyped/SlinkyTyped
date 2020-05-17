package typingsSlinky.gapiYoutube.anon

import typingsSlinky.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdDescription extends js.Object {
  var channelId: String = js.native
  var description: String = js.native
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  var title: String = js.native
}

object ChannelIdDescription {
  @scala.inline
  def apply(
    channelId: String,
    description: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): ChannelIdDescription = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdDescription]
  }
  @scala.inline
  implicit class ChannelIdDescriptionOps[Self <: ChannelIdDescription] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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

