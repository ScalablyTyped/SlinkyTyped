package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorModelRequest extends js.Object {
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model that is updated.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
}

object UpdateDetectorModelRequest {
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
  @scala.inline
  implicit class UpdateDetectorModelRequestOps[Self <: UpdateDetectorModelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorModelDefinition(value: DetectorModelDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorModelName(value: DetectorModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorModelDescription(value: DetectorModelDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationMethod(value: EvaluationMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationMethod")(js.undefined)
        ret
    }
  }
  
}

