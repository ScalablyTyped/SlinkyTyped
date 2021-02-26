package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingSchedule extends StObject {
  
  /** Placement cap cost option. */
  var capCostOption: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  /** Whether this placement is flighted. If true, pricing periods will be computed automatically. */
  var flighted: js.UndefOr[Boolean] = js.native
  
  /** Floodlight activity ID associated with this placement. This field should be set when placement pricing type is set to PRICING_TYPE_CPA. */
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  /** Pricing periods for this placement. */
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.native
  
  /** Placement pricing type. This field is required on insertion. */
  var pricingType: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var testingStartDate: js.UndefOr[String] = js.native
}
object PricingSchedule {
  
  @scala.inline
  def apply(): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedule]
  }
  
  @scala.inline
  implicit class PricingScheduleMutableBuilder[Self <: PricingSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapCostOption(value: String): Self = StObject.set(x, "capCostOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapCostOptionUndefined: Self = StObject.set(x, "capCostOption", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFlighted(value: Boolean): Self = StObject.set(x, "flighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightedUndefined: Self = StObject.set(x, "flighted", js.undefined)
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setPricingPeriods(value: js.Array[PricingSchedulePricingPeriod]): Self = StObject.set(x, "pricingPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPeriodsUndefined: Self = StObject.set(x, "pricingPeriods", js.undefined)
    
    @scala.inline
    def setPricingPeriodsVarargs(value: PricingSchedulePricingPeriod*): Self = StObject.set(x, "pricingPeriods", js.Array(value :_*))
    
    @scala.inline
    def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTestingStartDate(value: String): Self = StObject.set(x, "testingStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestingStartDateUndefined: Self = StObject.set(x, "testingStartDate", js.undefined)
  }
}
