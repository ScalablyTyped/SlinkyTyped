package typingsSlinky.reactJoyride.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  var beaconComponent: js.UndefOr[ReactElement] = js.native
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.native
  var disableOverlay: js.UndefOr[Boolean] = js.native
  var disableOverlayClose: js.UndefOr[Boolean] = js.native
  var disableScrollParentFix: js.UndefOr[Boolean] = js.native
  var disableScrolling: js.UndefOr[Boolean] = js.native
  var floaterProps: js.UndefOr[FloaterProps] = js.native
  var hideBackButton: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[Locale] = js.native
  var showProgress: js.UndefOr[Boolean] = js.native
  var showSkipButton: js.UndefOr[Boolean] = js.native
  var spotlightClicks: js.UndefOr[Boolean] = js.native
  var spotlightPadding: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[Styles] = js.native
  var tooltipComponent: js.UndefOr[ReactElement] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeaconComponentFunctionComponent(value: ReactComponentClass[BeaconRenderProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeaconComponentComponentClass(value: ReactComponentClass[BeaconRenderProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeaconComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCloseOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCloseOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCloseOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOverlayClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlayClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOverlayClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOverlayClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScrollParentFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrollParentFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScrollParentFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrollParentFix")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterProps(value: FloaterProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHideBackButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBackButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSkipButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkipButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightClicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightClicks")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: Styles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipComponentFunctionComponent(value: ReactComponentClass[TooltipRenderProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipComponentComponentClass(value: ReactComponentClass[TooltipRenderProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipComponent")(js.undefined)
        ret
    }
  }
  
}

