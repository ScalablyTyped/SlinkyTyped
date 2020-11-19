package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyExecutionActivityMetricsResponse extends js.Object {
  
  /**
    * The type of activity that the metric applies to. Possible values are: CONDITIONAL_SPLIT - For a yes/no split activity, which is an activity that sends participants down one of two paths in a journey. HOLDOUT - For a holdout activity, which is an activity that stops a journey for a specified percentage of participants. MESSAGE - For an email activity, which is an activity that sends an email message to participants. MULTI_CONDITIONAL_SPLIT - For a multivariate split activity, which is an activity that sends participants down one of as many as five paths in a journey. RANDOM_SPLIT - For a random split activity, which is an activity that sends specified percentages of participants down one of as many as five paths in a journey. WAIT - For a wait activity, which is an activity that waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  var ActivityType: string = js.native
  
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the activity that the metric applies to.
    */
  var JourneyActivityId: string = js.native
  
  /**
    * The unique identifier for the journey that the metric applies to.
    */
  var JourneyId: string = js.native
  
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint last evaluated the execution status of the activity and updated the data for the metric.
    */
  var LastEvaluatedTime: string = js.native
  
  /**
    * A JSON object that contains the results of the query. The results vary depending on the type of activity (ActivityType). For information about the structure and contents of the results, see the Amazon Pinpoint Developer Guide.
    */
  var Metrics: MapOfString = js.native
}
object JourneyExecutionActivityMetricsResponse {
  
  @scala.inline
  def apply(
    ActivityType: string,
    ApplicationId: string,
    JourneyActivityId: string,
    JourneyId: string,
    LastEvaluatedTime: string,
    Metrics: MapOfString
  ): JourneyExecutionActivityMetricsResponse = {
    val __obj = js.Dynamic.literal(ActivityType = ActivityType.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyActivityId = JourneyActivityId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], LastEvaluatedTime = LastEvaluatedTime.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyExecutionActivityMetricsResponse]
  }
  
  @scala.inline
  implicit class JourneyExecutionActivityMetricsResponseOps[Self <: JourneyExecutionActivityMetricsResponse] (val x: Self) extends AnyVal {
    
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
    def setActivityType(value: string): Self = this.set("ActivityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyActivityId(value: string): Self = this.set("JourneyActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneyId(value: string): Self = this.set("JourneyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedTime(value: string): Self = this.set("LastEvaluatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: MapOfString): Self = this.set("Metrics", value.asInstanceOf[js.Any])
  }
}
