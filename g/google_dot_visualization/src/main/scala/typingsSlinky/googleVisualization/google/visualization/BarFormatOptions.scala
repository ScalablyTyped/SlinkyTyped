package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarFormatOptions extends js.Object {
  /**
    * A number that is the base value to compare the cell value against. If the cell value is higher, it will be drawn to the right of the base; if lower, it will be drawn to the left. Default value is 0.
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * A string indicating the negative value section of bars. Possible values are 'red', 'green' and 'blue'; default value is 'red'.
    */
  var colorNegative: js.UndefOr[String] = js.native
  /**
    * A string indicating the color of the positive value section of bars. Possible values are 'red', 'green' and 'blue'. Default is 'blue'.
    */
  var colorPositive: js.UndefOr[String] = js.native
  /**
    * A boolean indicating if to draw a 1 pixel dark base line when negative values are present. The dark line is there to enhance visual scanning of the bars. Default value is 'false'.
    */
  var drawZeroLine: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number value for the bar range. Default value is the highest value in the table.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum number value for the bar range. Default value is the lowest value in the table.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * If true, shows values and bars; if false, shows only bars. Default value is true.
    */
  var showValue: js.UndefOr[Boolean] = js.native
  /**
    * Thickness of each bar, in pixels. Default value is 100.
    */
  var width: js.UndefOr[Double] = js.native
}

object BarFormatOptions {
  @scala.inline
  def apply(): BarFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarFormatOptions]
  }
  @scala.inline
  implicit class BarFormatOptionsOps[Self <: BarFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNegative")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPositive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPositive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPositive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPositive")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawZeroLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawZeroLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawZeroLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawZeroLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

