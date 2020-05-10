package typingsSlinky.echarts.echarts.EChartOption.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearLabelFormatterParams extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var nameMap: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  var start: js.UndefOr[Double] = js.native
}

object YearLabelFormatterParams {
  @scala.inline
  def apply(): YearLabelFormatterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YearLabelFormatterParams]
  }
  @scala.inline
  implicit class YearLabelFormatterParamsOps[Self <: YearLabelFormatterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
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
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

