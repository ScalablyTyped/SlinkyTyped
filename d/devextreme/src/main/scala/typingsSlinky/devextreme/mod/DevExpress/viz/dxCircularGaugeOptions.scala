package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.EndAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCircularGaugeOptions extends BaseGaugeOptions[dxCircularGauge] {
  /** Specifies the options required to set the geometry of the CircularGauge widget. */
  var geometry: js.UndefOr[EndAngle] = js.native
  /** Specifies gauge range container options. */
  @JSName("rangeContainer")
  var rangeContainer_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeRangeContainer] = js.native
  /** Specifies a gauge's scale options. */
  @JSName("scale")
  var scale_dxCircularGaugeOptions: js.UndefOr[dxCircularGaugeScale] = js.native
  /** Specifies the appearance options of subvalue indicators. */
  var subvalueIndicator: js.UndefOr[GaugeIndicator] = js.native
  /** Specifies the appearance options of the value indicator. */
  var valueIndicator: js.UndefOr[GaugeIndicator] = js.native
}

object dxCircularGaugeOptions {
  @scala.inline
  def apply(): dxCircularGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeOptions]
  }
  @scala.inline
  implicit class dxCircularGaugeOptionsOps[Self <: dxCircularGaugeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: EndAngle): Self = {
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
    def withRangeContainer(value: dxCircularGaugeRangeContainer): Self = {
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
    def withScale(value: dxCircularGaugeScale): Self = {
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

