package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScalingPlanResourceForecastDataResponse extends js.Object {
  /**
    * The data points to return.
    */
  var Datapoints: typingsSlinky.awsSdk.autoscalingplansMod.Datapoints = js.native
}

object GetScalingPlanResourceForecastDataResponse {
  @scala.inline
  def apply(Datapoints: Datapoints): GetScalingPlanResourceForecastDataResponse = {
    val __obj = js.Dynamic.literal(Datapoints = Datapoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
  }
  @scala.inline
  implicit class GetScalingPlanResourceForecastDataResponseOps[Self <: GetScalingPlanResourceForecastDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatapoints(value: Datapoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datapoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

