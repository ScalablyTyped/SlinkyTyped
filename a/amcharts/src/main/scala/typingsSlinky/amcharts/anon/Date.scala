package typingsSlinky.amcharts.anon

import typingsSlinky.amcharts.stockEventMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
  var chart: this.type = js.native
  
  var date: js.UndefOr[js.Date] = js.native
  
  var endDate: js.UndefOr[js.Date] = js.native
  
  var eventObject: js.UndefOr[default] = js.native
  
  var graph: js.UndefOr[typingsSlinky.amcharts.stockGraphMod.default] = js.native
  
  var panel: js.UndefOr[typingsSlinky.amcharts.stockPanelMod.default] = js.native
  
  var period: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[js.Date] = js.native
  
  var `type`: String = js.native
}
object Date {
  
  @scala.inline
  def apply(chart: Date, `type`: String): Date = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    
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
    def setChart(value: Date): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEventObject(value: default): Self = this.set("eventObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventObject: Self = this.set("eventObject", js.undefined)
    
    @scala.inline
    def setGraph(value: typingsSlinky.amcharts.stockGraphMod.default): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    
    @scala.inline
    def setPanel(value: typingsSlinky.amcharts.stockPanelMod.default): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
