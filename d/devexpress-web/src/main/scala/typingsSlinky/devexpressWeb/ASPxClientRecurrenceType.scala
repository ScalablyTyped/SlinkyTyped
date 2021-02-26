package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains recurrence types.
  */
@js.native
trait ASPxClientRecurrenceType extends StObject {
  
  /**
    * The recurring appointment occurs on a daily basis.
    */
  var Daily: String = js.native
  
  /**
    * The recurring appointment occurs on an hourly base.
    */
  var Hourly: String = js.native
  
  /**
    * The recurring appointment reoccurs on a monthly basis.
    */
  var Monthly: String = js.native
  
  /**
    * The recurring appointment reoccurs on a weekly basis.
    */
  var Weekly: String = js.native
  
  /**
    * The recurring appointment reoccurs on an yearly basis.
    */
  var Yearly: String = js.native
}
object ASPxClientRecurrenceType {
  
  @scala.inline
  def apply(Daily: String, Hourly: String, Monthly: String, Weekly: String, Yearly: String): ASPxClientRecurrenceType = {
    val __obj = js.Dynamic.literal(Daily = Daily.asInstanceOf[js.Any], Hourly = Hourly.asInstanceOf[js.Any], Monthly = Monthly.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any], Yearly = Yearly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceType]
  }
  
  @scala.inline
  implicit class ASPxClientRecurrenceTypeMutableBuilder[Self <: ASPxClientRecurrenceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaily(value: String): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourly(value: String): Self = StObject.set(x, "Hourly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthly(value: String): Self = StObject.set(x, "Monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekly(value: String): Self = StObject.set(x, "Weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearly(value: String): Self = StObject.set(x, "Yearly", value.asInstanceOf[js.Any])
  }
}
