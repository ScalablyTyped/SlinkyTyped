package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedProfileTime extends StObject {
  
  /**
    *  The aggregation period. This indicates the period during which an aggregation profile collects posted agent profiles for a profiling group. Use one of three valid durations that are specified using the ISO 8601 format.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var period: js.UndefOr[AggregationPeriod] = js.native
  
  /**
    *  The time that aggregation of posted agent profiles for a profiling group starts. The aggregation profile contains profiles posted by the agent starting at this time for an aggregation period specified by the period property of the AggregatedProfileTime object.   Specify start using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var start: js.UndefOr[js.Date] = js.native
}
object AggregatedProfileTime {
  
  @scala.inline
  def apply(): AggregatedProfileTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedProfileTime]
  }
  
  @scala.inline
  implicit class AggregatedProfileTimeMutableBuilder[Self <: AggregatedProfileTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriod(value: AggregationPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
