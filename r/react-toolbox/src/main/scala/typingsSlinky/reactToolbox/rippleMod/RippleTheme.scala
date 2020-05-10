package typingsSlinky.reactToolbox.rippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleTheme extends js.Object {
  /**
    * Root classname for the ripple.
    */
  var ripple: js.UndefOr[String] = js.native
  /**
    * Applied when the ripple is active.
    */
  var rippleActive: js.UndefOr[String] = js.native
  /**
    * Applied when the ripple is restarting.
    */
  var rippleRestarting: js.UndefOr[String] = js.native
  /**
    * Wrapper class to fit to the parent element.
    */
  var rippleWrapper: js.UndefOr[String] = js.native
}

object RippleTheme {
  @scala.inline
  def apply(): RippleTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleTheme]
  }
  @scala.inline
  implicit class RippleThemeOps[Self <: RippleTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRipple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRipple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ripple")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleActive")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleRestarting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleRestarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleRestarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleRestarting")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleWrapper")(js.undefined)
        ret
    }
  }
  
}

