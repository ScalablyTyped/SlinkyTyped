package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderFullscreenOptions extends js.Object {
  /**
    * Fullscreen button at top right. (default: true)
    */
  var buttonFS: js.UndefOr[Boolean] = js.native
  /**
    * Fullscreen functions enabled. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Force keyboard arrows nav in fullscreen. (default: true)
    */
  var keyboardNav: js.UndefOr[Boolean] = js.native
  /**
    * Native browser fullscreen. (default: false)
    */
  var nativeFS: js.UndefOr[Boolean] = js.native
}

object RoyalSliderFullscreenOptions {
  @scala.inline
  def apply(): RoyalSliderFullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderFullscreenOptions]
  }
  @scala.inline
  implicit class RoyalSliderFullscreenOptionsOps[Self <: RoyalSliderFullscreenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonFS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonFS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFS")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNav")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeFS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeFS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeFS")(js.undefined)
        ret
    }
  }
  
}

