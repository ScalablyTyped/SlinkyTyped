package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVbpVolumeDivisionStylesOptions extends js.Object {
  /**
    * (Highstock) Color of negative volume bars.
    */
  var negativeColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) Color of positive volume bars.
    */
  var positiveColor: js.UndefOr[ColorString] = js.native
}

object PlotVbpVolumeDivisionStylesOptions {
  @scala.inline
  def apply(): PlotVbpVolumeDivisionStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionStylesOptions]
  }
  @scala.inline
  implicit class PlotVbpVolumeDivisionStylesOptionsOps[Self <: PlotVbpVolumeDivisionStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNegativeColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveColor")(js.undefined)
        ret
    }
  }
  
}

