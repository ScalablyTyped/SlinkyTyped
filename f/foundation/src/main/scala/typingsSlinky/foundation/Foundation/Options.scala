package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var abide: js.UndefOr[AbideOptions] = js.native
  var accordion: js.UndefOr[AccordionOptions] = js.native
  var alert: js.UndefOr[AlertOptions] = js.native
  var clearing: js.UndefOr[ClearingOptions] = js.native
  var dropdown: js.UndefOr[DropdownOptions] = js.native
  var equalizer: js.UndefOr[EqualizerOptions] = js.native
  var interchange: js.UndefOr[InterchangeOptions] = js.native
  var joyride: js.UndefOr[JoyrideOptions] = js.native
  var magellan: js.UndefOr[MagellanOptions] = js.native
  var offcanvas: js.UndefOr[OffCanvasOptions] = js.native
  var orbit: js.UndefOr[OrbitOptions] = js.native
  var reveal: js.UndefOr[RevealOptions] = js.native
  var slider: js.UndefOr[SliderOptions] = js.native
  var tab: js.UndefOr[TabOptions] = js.native
  var tooltip: js.UndefOr[TooltipOptions] = js.native
  var topbar: js.UndefOr[TopbarOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbide(value: AbideOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abide")(js.undefined)
        ret
    }
    @scala.inline
    def withAccordion(value: AccordionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
    @scala.inline
    def withAlert(value: AlertOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withClearing(value: ClearingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdown(value: DropdownOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualizer(value: EqualizerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalizer")(js.undefined)
        ret
    }
    @scala.inline
    def withInterchange(value: InterchangeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interchange")(js.undefined)
        ret
    }
    @scala.inline
    def withJoyride(value: JoyrideOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joyride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoyride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joyride")(js.undefined)
        ret
    }
    @scala.inline
    def withMagellan(value: MagellanOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magellan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagellan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magellan")(js.undefined)
        ret
    }
    @scala.inline
    def withOffcanvas(value: OffCanvasOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offcanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffcanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offcanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withOrbit(value: OrbitOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orbit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrbit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orbit")(js.undefined)
        ret
    }
    @scala.inline
    def withReveal(value: RevealOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReveal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: SliderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: TabOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: TooltipOptions): Self = {
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
    def withTopbar(value: TopbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topbar")(js.undefined)
        ret
    }
  }
  
}

