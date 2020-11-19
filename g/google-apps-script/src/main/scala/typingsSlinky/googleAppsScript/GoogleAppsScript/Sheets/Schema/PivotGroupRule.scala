package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGroupRule extends js.Object {
  
  var dateTimeRule: js.UndefOr[DateTimeRule] = js.native
  
  var histogramRule: js.UndefOr[HistogramRule] = js.native
  
  var manualRule: js.UndefOr[ManualRule] = js.native
}
object PivotGroupRule {
  
  @scala.inline
  def apply(): PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupRule]
  }
  
  @scala.inline
  implicit class PivotGroupRuleOps[Self <: PivotGroupRule] (val x: Self) extends AnyVal {
    
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
    def setDateTimeRule(value: DateTimeRule): Self = this.set("dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRule: Self = this.set("dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: HistogramRule): Self = this.set("histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramRule: Self = this.set("histogramRule", js.undefined)
    
    @scala.inline
    def setManualRule(value: ManualRule): Self = this.set("manualRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualRule: Self = this.set("manualRule", js.undefined)
  }
}
