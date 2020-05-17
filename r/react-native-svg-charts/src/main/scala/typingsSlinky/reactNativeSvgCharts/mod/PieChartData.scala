package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.reactNativeSvgCharts.anon.CornerRadius
import typingsSlinky.reactNativeSvgCharts.anon.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartData extends js.Object {
  var arc: js.UndefOr[CornerRadius] = js.native
  var key: String | Double = js.native
  var svg: js.UndefOr[PartialPathProps] = js.native
  var value: js.UndefOr[Double] = js.native
}

object PieChartData {
  @scala.inline
  def apply(key: String | Double): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
  @scala.inline
  implicit class PieChartDataOps[Self <: PieChartData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArc(value: CornerRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: PartialPathProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

