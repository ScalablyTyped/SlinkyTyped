package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurringCharge extends StObject {
  
  /**
    * The monetary amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.native
  
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.native
}
object RecurringCharge {
  
  @scala.inline
  def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  @scala.inline
  implicit class RecurringChargeMutableBuilder[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurringChargeAmount(value: Double): Self = StObject.set(x, "RecurringChargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargeAmountUndefined: Self = StObject.set(x, "RecurringChargeAmount", js.undefined)
    
    @scala.inline
    def setRecurringChargeFrequency(value: String): Self = StObject.set(x, "RecurringChargeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargeFrequencyUndefined: Self = StObject.set(x, "RecurringChargeFrequency", js.undefined)
  }
}
