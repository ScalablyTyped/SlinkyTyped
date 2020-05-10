package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRevealOptions extends js.Object {
  var animationIn: js.UndefOr[String] = js.native
  var animationOut: js.UndefOr[String] = js.native
  var btmOffsetPct: js.UndefOr[Double] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  var deepLink: js.UndefOr[Boolean] = js.native
  var fullScreen: js.UndefOr[Boolean] = js.native
  var hOffset: js.UndefOr[Double] = js.native
  var hideDelay: js.UndefOr[Double] = js.native
  var multipleOpened: js.UndefOr[Boolean] = js.native
  var overlay: js.UndefOr[Boolean] = js.native
  var resetOnClose: js.UndefOr[Boolean] = js.native
  var showDelay: js.UndefOr[Double] = js.native
  var vOffset: js.UndefOr[Double] = js.native
}

object IRevealOptions {
  @scala.inline
  def apply(): IRevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRevealOptions]
  }
  @scala.inline
  implicit class IRevealOptionsOps[Self <: IRevealOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(js.undefined)
        ret
    }
    @scala.inline
    def withBtmOffsetPct(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btmOffsetPct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtmOffsetPct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btmOffsetPct")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withVOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(js.undefined)
        ret
    }
  }
  
}

