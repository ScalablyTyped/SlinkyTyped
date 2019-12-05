package typingsSlinky.echarts.echarts.EChartOption.Dataset

import typingsSlinky.echarts.echartsStrings.float
import typingsSlinky.echarts.echartsStrings.int
import typingsSlinky.echarts.echartsStrings.number
import typingsSlinky.echarts.echartsStrings.ordinal
import typingsSlinky.echarts.echartsStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#dataset.dimensions
  */
trait DimensionObject extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[number | float | int | ordinal | time] = js.undefined
}

object DimensionObject {
  @scala.inline
  def apply(
    displayName: String = null,
    name: String = null,
    `type`: number | float | int | ordinal | time = null
  ): DimensionObject = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionObject]
  }
}

