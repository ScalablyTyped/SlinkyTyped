package typingsSlinky.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvChannelFeedResponseThumbnails extends js.Object {
  var max_thumbnails_per_sprite: Double = js.native
  var rendered_width: Double = js.native
  var sprite_height: Double = js.native
  var sprite_urls: js.Array[String] = js.native
  var sprite_width: Double = js.native
  var thumbnail_duration: String | Double = js.native
  var thumbnail_height: Double = js.native
  var thumbnail_width: Double = js.native
  var thumbnails_per_row: Double = js.native
  var video_length: Double = js.native
}

object IgtvChannelFeedResponseThumbnails {
  @scala.inline
  def apply(
    max_thumbnails_per_sprite: Double,
    rendered_width: Double,
    sprite_height: Double,
    sprite_urls: js.Array[String],
    sprite_width: Double,
    thumbnail_duration: String | Double,
    thumbnail_height: Double,
    thumbnail_width: Double,
    thumbnails_per_row: Double,
    video_length: Double
  ): IgtvChannelFeedResponseThumbnails = {
    val __obj = js.Dynamic.literal(max_thumbnails_per_sprite = max_thumbnails_per_sprite.asInstanceOf[js.Any], rendered_width = rendered_width.asInstanceOf[js.Any], sprite_height = sprite_height.asInstanceOf[js.Any], sprite_urls = sprite_urls.asInstanceOf[js.Any], sprite_width = sprite_width.asInstanceOf[js.Any], thumbnail_duration = thumbnail_duration.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], thumbnails_per_row = thumbnails_per_row.asInstanceOf[js.Any], video_length = video_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseThumbnails]
  }
  @scala.inline
  implicit class IgtvChannelFeedResponseThumbnailsOps[Self <: IgtvChannelFeedResponseThumbnails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_thumbnails_per_sprite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_thumbnails_per_sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSprite_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSprite_urls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSprite_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_duration(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnails_per_row(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails_per_row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

