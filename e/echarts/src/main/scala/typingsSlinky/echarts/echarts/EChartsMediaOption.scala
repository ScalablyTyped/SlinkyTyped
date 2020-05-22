package typingsSlinky.echarts.echarts

import typingsSlinky.echarts.anon.AspectRatio
import typingsSlinky.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsMediaOption extends js.Object {
  var option: EChartOption[Series]
  var query: AspectRatio
}

object EChartsMediaOption {
  @scala.inline
  def apply(option: EChartOption[Series], query: AspectRatio): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsMediaOption]
  }
}

