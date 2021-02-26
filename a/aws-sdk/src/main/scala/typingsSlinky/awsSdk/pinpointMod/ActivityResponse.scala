package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityResponse extends StObject {
  
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the campaign that the activity applies to.
    */
  var CampaignId: string = js.native
  
  /**
    * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
    */
  var End: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the activity.
    */
  var Id: string = js.native
  
  /**
    * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
    */
  var Result: js.UndefOr[string] = js.native
  
  /**
    * The scheduled start time, in ISO 8601 format, for the activity.
    */
  var ScheduledStart: js.UndefOr[string] = js.native
  
  /**
    * The actual start time, in ISO 8601 format, of the activity.
    */
  var Start: js.UndefOr[string] = js.native
  
  /**
    * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
    */
  var State: js.UndefOr[string] = js.native
  
  /**
    * The total number of endpoints that the campaign successfully delivered messages to.
    */
  var SuccessfulEndpointCount: js.UndefOr[integer] = js.native
  
  /**
    * The total number of time zones that were completed.
    */
  var TimezonesCompletedCount: js.UndefOr[integer] = js.native
  
  /**
    * The total number of unique time zones that are in the segment for the campaign.
    */
  var TimezonesTotalCount: js.UndefOr[integer] = js.native
  
  /**
    * The total number of endpoints that the campaign attempted to deliver messages to.
    */
  var TotalEndpointCount: js.UndefOr[integer] = js.native
  
  /**
    * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentId: js.UndefOr[string] = js.native
}
object ActivityResponse {
  
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string, Id: string): ActivityResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityResponse]
  }
  
  @scala.inline
  implicit class ActivityResponseMutableBuilder[Self <: ActivityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: string): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: string): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    @scala.inline
    def setScheduledStart(value: string): Self = StObject.set(x, "ScheduledStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStartUndefined: Self = StObject.set(x, "ScheduledStart", js.undefined)
    
    @scala.inline
    def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    @scala.inline
    def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSuccessfulEndpointCount(value: integer): Self = StObject.set(x, "SuccessfulEndpointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulEndpointCountUndefined: Self = StObject.set(x, "SuccessfulEndpointCount", js.undefined)
    
    @scala.inline
    def setTimezonesCompletedCount(value: integer): Self = StObject.set(x, "TimezonesCompletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezonesCompletedCountUndefined: Self = StObject.set(x, "TimezonesCompletedCount", js.undefined)
    
    @scala.inline
    def setTimezonesTotalCount(value: integer): Self = StObject.set(x, "TimezonesTotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezonesTotalCountUndefined: Self = StObject.set(x, "TimezonesTotalCount", js.undefined)
    
    @scala.inline
    def setTotalEndpointCount(value: integer): Self = StObject.set(x, "TotalEndpointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalEndpointCountUndefined: Self = StObject.set(x, "TotalEndpointCount", js.undefined)
    
    @scala.inline
    def setTreatmentId(value: string): Self = StObject.set(x, "TreatmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentIdUndefined: Self = StObject.set(x, "TreatmentId", js.undefined)
  }
}
