package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrequencyCap extends StObject {
  
  /** The maximum number of impressions that can be served to a user within the specified time period. */
  var maxImpressions: js.UndefOr[Double] = js.native
  
  /** The amount of time, in the units specified by time_unit_type. Defines the amount of time over which impressions per user are counted and capped. */
  var numTimeUnits: js.UndefOr[Double] = js.native
  
  /** The time unit. Along with num_time_units defines the amount of time over which impressions per user are counted and capped. */
  var timeUnitType: js.UndefOr[String] = js.native
}
object FrequencyCap {
  
  @scala.inline
  def apply(): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyCap]
  }
  
  @scala.inline
  implicit class FrequencyCapMutableBuilder[Self <: FrequencyCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxImpressions(value: Double): Self = StObject.set(x, "maxImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImpressionsUndefined: Self = StObject.set(x, "maxImpressions", js.undefined)
    
    @scala.inline
    def setNumTimeUnits(value: Double): Self = StObject.set(x, "numTimeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTimeUnitsUndefined: Self = StObject.set(x, "numTimeUnits", js.undefined)
    
    @scala.inline
    def setTimeUnitType(value: String): Self = StObject.set(x, "timeUnitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitTypeUndefined: Self = StObject.set(x, "timeUnitType", js.undefined)
  }
}
