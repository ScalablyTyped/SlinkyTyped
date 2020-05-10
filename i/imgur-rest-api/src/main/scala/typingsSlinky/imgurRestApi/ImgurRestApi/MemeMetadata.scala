package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemeMetadata extends js.Object {
  var bg_image: String = js.native
  var bottom_text: String = js.native
  var meme_name: String = js.native
  var top_text: String = js.native
}

object MemeMetadata {
  @scala.inline
  def apply(bg_image: String, bottom_text: String, meme_name: String, top_text: String): MemeMetadata = {
    val __obj = js.Dynamic.literal(bg_image = bg_image.asInstanceOf[js.Any], bottom_text = bottom_text.asInstanceOf[js.Any], meme_name = meme_name.asInstanceOf[js.Any], top_text = top_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemeMetadata]
  }
  @scala.inline
  implicit class MemeMetadataOps[Self <: MemeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeme_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meme_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

