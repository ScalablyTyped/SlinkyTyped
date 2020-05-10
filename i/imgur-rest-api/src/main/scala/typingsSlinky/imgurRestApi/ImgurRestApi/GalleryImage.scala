package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryImage extends GalleryItem {
  var animated: Boolean = js.native
  var bandwidth: Double = js.native
  var deletehash: js.UndefOr[String] = js.native
  var gifv: js.UndefOr[String] = js.native
  var height: Double = js.native
  var looping: js.UndefOr[Boolean] = js.native
  var mp4: js.UndefOr[String] = js.native
  var section: String = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var webm: js.UndefOr[String] = js.native
  var width: Double = js.native
}

object GalleryImage {
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    height: Double,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    section: String,
    size: Double,
    title: String,
    topic: String,
    topic_id: Double,
    `type`: String,
    ups: Double,
    views: Double,
    width: Double
  ): GalleryImage = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryImage]
  }
  @scala.inline
  implicit class GalleryImageOps[Self <: GalleryImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletehash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletehash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletehash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletehash")(js.undefined)
        ret
    }
    @scala.inline
    def withGifv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gifv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGifv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gifv")(js.undefined)
        ret
    }
    @scala.inline
    def withLooping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLooping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(js.undefined)
        ret
    }
    @scala.inline
    def withMp4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMp4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4")(js.undefined)
        ret
    }
    @scala.inline
    def withWebm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(js.undefined)
        ret
    }
  }
  
}

