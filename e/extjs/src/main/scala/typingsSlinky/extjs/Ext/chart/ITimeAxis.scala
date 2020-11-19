package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.chart.axis.INumeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeAxis extends INumeric {
  
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.native
}
object ITimeAxis {
  
  @scala.inline
  def apply(): ITimeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeAxis]
  }
  
  @scala.inline
  implicit class ITimeAxisOps[Self <: ITimeAxis] (val x: Self) extends AnyVal {
    
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
    def setDateFormat(value: js.Any): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setFromDate(value: js.Any): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDate: Self = this.set("fromDate", js.undefined)
    
    @scala.inline
    def setStep(value: Array): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setToDate(value: js.Any): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
  }
}
