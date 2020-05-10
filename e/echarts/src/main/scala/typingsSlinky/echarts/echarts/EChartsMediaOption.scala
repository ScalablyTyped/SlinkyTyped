package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.AnonAspectRatio
import typingsSlinky.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsMediaOption extends js.Object {
  var option: EChartOption[Series] = js.native
  var query: AnonAspectRatio = js.native
}

object EChartsMediaOption {
  @scala.inline
  def apply(option: EChartOption[Series], query: AnonAspectRatio): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsMediaOption]
  }
  @scala.inline
  implicit class EChartsMediaOptionOps[Self <: EChartsMediaOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: EChartOption[Series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: AnonAspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

