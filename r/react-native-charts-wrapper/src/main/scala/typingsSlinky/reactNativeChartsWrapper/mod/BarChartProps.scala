package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartProps extends BarLineChartBase {
  var data: BarData = js.native
  var drawBarShadow: js.UndefOr[Boolean] = js.native
  var drawValueAboveBar: js.UndefOr[Boolean] = js.native
  var highlightFullBarEnabled: js.UndefOr[Boolean] = js.native
}

object BarChartProps {
  @scala.inline
  def apply(data: BarData): BarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
  @scala.inline
  implicit class BarChartPropsOps[Self <: BarChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: BarData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawBarShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBarShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBarShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBarShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawValueAboveBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawValueAboveBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawValueAboveBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawValueAboveBar")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightFullBarEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFullBarEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightFullBarEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFullBarEnabled")(js.undefined)
        ret
    }
  }
  
}

