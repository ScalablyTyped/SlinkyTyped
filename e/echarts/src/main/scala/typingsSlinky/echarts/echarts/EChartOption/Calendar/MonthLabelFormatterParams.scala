package typingsSlinky.echarts.echarts.EChartOption.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthLabelFormatterParams extends js.Object {
  var M: js.UndefOr[Double] = js.native
  var MM: js.UndefOr[Double] = js.native
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  var yy: js.UndefOr[Double] = js.native
  var yyyy: js.UndefOr[Double] = js.native
}

object MonthLabelFormatterParams {
  @scala.inline
  def apply(): MonthLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthLabelFormatterParams]
  }
  @scala.inline
  implicit class MonthLabelFormatterParamsOps[Self <: MonthLabelFormatterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(js.undefined)
        ret
    }
    @scala.inline
    def withMM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(js.undefined)
        ret
    }
    @scala.inline
    def withNameMap(value: String | Double | (js.Array[String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameMap")(js.undefined)
        ret
    }
    @scala.inline
    def withYy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(js.undefined)
        ret
    }
    @scala.inline
    def withYyyy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yyyy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYyyy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yyyy")(js.undefined)
        ret
    }
  }
  
}

