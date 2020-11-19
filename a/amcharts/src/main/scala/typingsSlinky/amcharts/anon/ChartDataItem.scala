package typingsSlinky.amcharts.anon

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataItem extends js.Object {
  
  var chart: default = js.native
  
   // Always "rollOverSlice".
  var dataItem: typingsSlinky.amcharts.sliceMod.default = js.native
  
  var `type`: String = js.native
}
object ChartDataItem {
  
  @scala.inline
  def apply(chart: default, dataItem: typingsSlinky.amcharts.sliceMod.default, `type`: String): ChartDataItem = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataItem]
  }
  
  @scala.inline
  implicit class ChartDataItemOps[Self <: ChartDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChart(value: default): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItem(value: typingsSlinky.amcharts.sliceMod.default): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
