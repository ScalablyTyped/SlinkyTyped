package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTelemetryMetadataRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that has the telemetry data that you want to obtain.
    */
  var assessmentRunArn: Arn = js.native
}

object GetTelemetryMetadataRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn): GetTelemetryMetadataRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataRequest]
  }
  @scala.inline
  implicit class GetTelemetryMetadataRequestOps[Self <: GetTelemetryMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentRunArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentRunArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

