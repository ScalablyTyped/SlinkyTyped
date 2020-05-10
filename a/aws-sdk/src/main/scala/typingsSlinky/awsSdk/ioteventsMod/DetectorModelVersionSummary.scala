package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelVersionSummary extends js.Object {
  /**
    * The time the detector model version was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the detector model version.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  /**
    * The ID of the detector model version.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The last time the detector model version was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the role that grants the detector model permission to perform its tasks.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The status of the detector model version.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.native
}

object DetectorModelVersionSummary {
  @scala.inline
  def apply(): DetectorModelVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelVersionSummary]
  }
  @scala.inline
  implicit class DetectorModelVersionSummaryOps[Self <: DetectorModelVersionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelArn(value: DetectorModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelName(value: DetectorModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelName")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorModelVersion(value: DetectorModelVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorModelVersion")(js.undefined)
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
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DetectorModelVersionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

