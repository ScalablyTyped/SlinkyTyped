package typingsSlinky.reactJoyride.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactJoyride.AnonArrowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  var beacon: js.UndefOr[CSSProperties] = js.native
  var beaconInner: js.UndefOr[CSSProperties] = js.native
  var beaconOuter: js.UndefOr[CSSProperties] = js.native
  var buttonBack: js.UndefOr[CSSProperties] = js.native
  var buttonClose: js.UndefOr[CSSProperties] = js.native
  var buttonNext: js.UndefOr[CSSProperties] = js.native
  var buttonSkip: js.UndefOr[CSSProperties] = js.native
  var options: js.UndefOr[AnonArrowColor] = js.native
  var overlay: js.UndefOr[CSSProperties] = js.native
  var overlayLegacy: js.UndefOr[CSSProperties] = js.native
  var overlayLegacyCenter: js.UndefOr[CSSProperties] = js.native
  var spotlight: js.UndefOr[CSSProperties] = js.native
  var spotlightLegacy: js.UndefOr[CSSProperties] = js.native
  var tooltip: js.UndefOr[CSSProperties] = js.native
  var tooltipContainer: js.UndefOr[CSSProperties] = js.native
  var tooltipContent: js.UndefOr[CSSProperties] = js.native
  var tooltipFooter: js.UndefOr[CSSProperties] = js.native
  var tooltipFooterSpacer: js.UndefOr[CSSProperties] = js.native
  var tooltipTitle: js.UndefOr[CSSProperties] = js.native
}

object Styles {
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacon(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeacon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacon")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconInner(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconInner")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconOuter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconOuter")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonBack(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBack")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClose(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClose")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonNext(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNext")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonSkip(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonArrowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: CSSProperties): Self = {
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
    def withOverlayLegacy(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayLegacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLegacy")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayLegacyCenter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLegacyCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayLegacyCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLegacyCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlight")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightLegacy(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightLegacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightLegacy")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipContainer(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipContent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFooter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipFooterSpacer(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFooterSpacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFooterSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFooterSpacer")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTitle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTitle")(js.undefined)
        ret
    }
  }
  
}

