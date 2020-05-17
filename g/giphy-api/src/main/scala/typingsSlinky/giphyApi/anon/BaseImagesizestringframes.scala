package typingsSlinky.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined giphy-api.giphy-api.BaseImage & {  size  :string,   frames  :string,   mp4  :string,   mp4_size  :string,   webp  :string,   webp_size  :string} */
@js.native
trait BaseImagesizestringframes extends js.Object {
  var frames: String = js.native
  var height: String = js.native
  var mp4: String = js.native
  var mp4_size: String = js.native
  var size: String = js.native
  var url: String = js.native
  var webp: String = js.native
  var webp_size: String = js.native
  var width: String = js.native
}

object BaseImagesizestringframes {
  @scala.inline
  def apply(
    frames: String,
    height: String,
    mp4: String,
    mp4_size: String,
    size: String,
    url: String,
    webp: String,
    webp_size: String,
    width: String
  ): BaseImagesizestringframes = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImagesizestringframes]
  }
  @scala.inline
  implicit class BaseImagesizestringframesOps[Self <: BaseImagesizestringframes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp4_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp4_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebp_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webp_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

