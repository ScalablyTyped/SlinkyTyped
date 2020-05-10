package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxButtonTypes extends js.Object {
  var close: String = js.native
  var download: String = js.native
  var fullScreen: String = js.native
  var share: String = js.native
  var slideShow: String = js.native
  var thumbs: String = js.native
  var zoom: String = js.native
}

object FancyBoxButtonTypes {
  @scala.inline
  def apply(
    close: String,
    download: String,
    fullScreen: String,
    share: String,
    slideShow: String,
    thumbs: String,
    zoom: String
  ): FancyBoxButtonTypes = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], slideShow = slideShow.asInstanceOf[js.Any], thumbs = thumbs.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
  @scala.inline
  implicit class FancyBoxButtonTypesOps[Self <: FancyBoxButtonTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

