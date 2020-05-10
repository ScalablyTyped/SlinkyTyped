package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorModelRequest extends js.Object {
  /**
    * Information that defines how the detectors operate.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The input attribute key used to identify a device or system to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression in the message payload of each input to specify the attribute-value pair that is used to identify the device associated with the input.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
  /**
    * Metadata that can be used to manage the detector model.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateDetectorModelRequest {
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): CreateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorModelRequest]
  }
  @scala.inline
  implicit class CreateDetectorModelRequestOps[Self <: CreateDetectorModelRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withKey(value: AttributeJsonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

