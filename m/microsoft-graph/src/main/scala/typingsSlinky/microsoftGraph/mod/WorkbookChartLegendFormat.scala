package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartLegendFormat extends Entity {
  
  // Represents the fill format of an object, which includes background formating information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.native
  
  // Represents the font attributes such as font name, font size, color, etc. of a chart legend. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.native
}
object WorkbookChartLegendFormat {
  
  @scala.inline
  def apply(): WorkbookChartLegendFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLegendFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartLegendFormatOps[Self <: WorkbookChartLegendFormat] (val x: Self) extends AnyVal {
    
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
    def setFill(value: WorkbookChartFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFont(value: WorkbookChartFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
}
