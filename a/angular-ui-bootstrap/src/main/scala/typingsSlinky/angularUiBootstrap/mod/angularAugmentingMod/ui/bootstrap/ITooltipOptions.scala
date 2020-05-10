package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipOptions extends js.Object {
  /**
    * Should the modal fade in and out?
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Should the tooltip be appended to `$body` instead of the parent element?
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.native
  /**
    * Where to place it? Defaults to 'top', but also accepts 'right', 'bottom', or 'left'.
    *
    * @default 'top'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * For how long should the tooltip remain open after the close trigger event?
    *
    * @default 0
    */
  var popupCloseDelay: js.UndefOr[Double] = js.native
  /**
    * Popup delay in milliseconds until it opens.
    *
    * @default 0
    */
  var popupDelay: js.UndefOr[Double] = js.native
  /**
    * What should trigger a show of the tooltip? Supports a space separated list of event names.
    *
    * @default 'mouseenter' for tooltip, 'click' for popover
    */
  var trigger: js.UndefOr[String] = js.native
  /**
    * Should an expression on the scope be used to load the content?
    *
    * @default false
    */
  var useContentExp: js.UndefOr[Boolean] = js.native
}

object ITooltipOptions {
  @scala.inline
  def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  @scala.inline
  implicit class ITooltipOptionsOps[Self <: ITooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContentExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContentExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContentExp")(js.undefined)
        ret
    }
  }
  
}

