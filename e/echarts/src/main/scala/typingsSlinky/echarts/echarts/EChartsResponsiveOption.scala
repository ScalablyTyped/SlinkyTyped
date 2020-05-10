package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartsResponsiveOption extends js.Object {
  var baseOption: js.UndefOr[EChartOption[Series]] = js.native
  var media: js.UndefOr[js.Array[EChartsMediaOption]] = js.native
}

object EChartsResponsiveOption {
  @scala.inline
  def apply(): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
  @scala.inline
  implicit class EChartsResponsiveOptionOps[Self <: EChartsResponsiveOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseOption(value: EChartOption[Series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[EChartsMediaOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
  }
  
}

