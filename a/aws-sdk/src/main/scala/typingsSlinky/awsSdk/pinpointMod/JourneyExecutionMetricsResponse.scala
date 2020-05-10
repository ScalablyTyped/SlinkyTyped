package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyExecutionMetricsResponse extends js.Object {
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the journey that the metric applies to.
    */
  var JourneyId: string = js.native
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint last evaluated the journey and updated the data for the metric.
    */
  var LastEvaluatedTime: string = js.native
  /**
    * A JSON object that contains the results of the query. For information about the structure and contents of the results, see the Amazon Pinpoint Developer Guide.
    */
  var Metrics: MapOfString = js.native
}

object JourneyExecutionMetricsResponse {
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string, LastEvaluatedTime: string, Metrics: MapOfString): JourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], LastEvaluatedTime = LastEvaluatedTime.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyExecutionMetricsResponse]
  }
  @scala.inline
  implicit class JourneyExecutionMetricsResponseOps[Self <: JourneyExecutionMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJourneyId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JourneyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastEvaluatedTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

