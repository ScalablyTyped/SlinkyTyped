package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.chart.axis.INumeric
import org.scalablytyped.runtime.StObject
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
  implicit class ITimeAxisMutableBuilder[Self <: ITimeAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: js.Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setFromDate(value: js.Any): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    @scala.inline
    def setStep(value: Array): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setToDate(value: js.Any): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
  }
}
