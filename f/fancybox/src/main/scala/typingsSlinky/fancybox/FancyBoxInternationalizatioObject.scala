package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxInternationalizatioObject extends js.Object {
  var CLOSE: js.UndefOr[String] = js.native
  var DOWNLOAD: js.UndefOr[String] = js.native
  var ERROR: js.UndefOr[String] = js.native
  var FULL_SCREEN: js.UndefOr[String] = js.native
  var NEXT: js.UndefOr[String] = js.native
  var PLAY_START: js.UndefOr[String] = js.native
  var PLAY_STOP: js.UndefOr[String] = js.native
  var PREV: js.UndefOr[String] = js.native
  var SHARE: js.UndefOr[String] = js.native
  var THUMBS: js.UndefOr[String] = js.native
  var ZOOM: js.UndefOr[String] = js.native
}

object FancyBoxInternationalizatioObject {
  @scala.inline
  def apply(): FancyBoxInternationalizatioObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxInternationalizatioObject]
  }
  @scala.inline
  implicit class FancyBoxInternationalizatioObjectOps[Self <: FancyBoxInternationalizatioObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCLOSE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(js.undefined)
        ret
    }
    @scala.inline
    def withDOWNLOAD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWNLOAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDOWNLOAD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOWNLOAD")(js.undefined)
        ret
    }
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutERROR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(js.undefined)
        ret
    }
    @scala.inline
    def withFULL_SCREEN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULL_SCREEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFULL_SCREEN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULL_SCREEN")(js.undefined)
        ret
    }
    @scala.inline
    def withNEXT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNEXT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(js.undefined)
        ret
    }
    @scala.inline
    def withPLAY_START(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLAY_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPLAY_START: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLAY_START")(js.undefined)
        ret
    }
    @scala.inline
    def withPLAY_STOP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLAY_STOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPLAY_STOP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLAY_STOP")(js.undefined)
        ret
    }
    @scala.inline
    def withPREV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PREV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPREV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PREV")(js.undefined)
        ret
    }
    @scala.inline
    def withSHARE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHARE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSHARE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHARE")(js.undefined)
        ret
    }
    @scala.inline
    def withTHUMBS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THUMBS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTHUMBS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THUMBS")(js.undefined)
        ret
    }
    @scala.inline
    def withZOOM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZOOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZOOM")(js.undefined)
        ret
    }
  }
  
}

