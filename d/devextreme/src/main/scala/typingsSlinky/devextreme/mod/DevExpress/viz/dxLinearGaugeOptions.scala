package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxLinearGaugeOptions extends BaseGaugeOptions[dxLinearGauge] {
  /** Specifies the options required to set the geometry of the LinearGauge widget. */
  var geometry: js.UndefOr[Anon0] = js.native
  /** Specifies gauge range container options. */
  @JSName("rangeContainer")
  var rangeContainer_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeRangeContainer] = js.native
  /** Specifies the gauge's scale options. */
  @JSName("scale")
  var scale_dxLinearGaugeOptions: js.UndefOr[dxLinearGaugeScale] = js.native
  /** Specifies the appearance options of subvalue indicators. */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.native
  /** Specifies the appearance options of the value indicator. */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.native
}

object dxLinearGaugeOptions {
  @scala.inline
  def apply(): dxLinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeOptions]
  }
  @scala.inline
  implicit class dxLinearGaugeOptionsOps[Self <: dxLinearGaugeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: Anon0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeContainer(value: dxLinearGaugeRangeContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: dxLinearGaugeScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSubvalueIndicator(value: GaugeIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subvalueIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubvalueIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subvalueIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withValueIndicator(value: GaugeIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIndicator")(js.undefined)
        ret
    }
  }
  
}

