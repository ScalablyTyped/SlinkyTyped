package typingsSlinky.amcharts.anon

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDataItem extends js.Object {
  var chart: default
   // Always "rollOverSlice".
  var dataItem: typingsSlinky.amcharts.sliceMod.default
  var `type`: String
}

object ChartDataItem {
  @scala.inline
  def apply(chart: default, dataItem: typingsSlinky.amcharts.sliceMod.default, `type`: String): ChartDataItem = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataItem]
  }
}

