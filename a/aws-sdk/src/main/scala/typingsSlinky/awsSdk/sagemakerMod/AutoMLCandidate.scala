package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLCandidate extends js.Object {
  /**
    * The candidate name.
    */
  var CandidateName: typingsSlinky.awsSdk.sagemakerMod.CandidateName = js.native
  /**
    * The candidate's status.
    */
  var CandidateStatus: typingsSlinky.awsSdk.sagemakerMod.CandidateStatus = js.native
  /**
    * The candidate's steps.
    */
  var CandidateSteps: typingsSlinky.awsSdk.sagemakerMod.CandidateSteps = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.Date = js.native
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FinalAutoMLJobObjectiveMetric] = js.native
  /**
    * The inference containers.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * The objective status.
    */
  var ObjectiveStatus: typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatus = js.native
}

object AutoMLCandidate {
  @scala.inline
  def apply(
    CandidateName: CandidateName,
    CandidateStatus: CandidateStatus,
    CandidateSteps: CandidateSteps,
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    ObjectiveStatus: ObjectiveStatus
  ): AutoMLCandidate = {
    val __obj = js.Dynamic.literal(CandidateName = CandidateName.asInstanceOf[js.Any], CandidateStatus = CandidateStatus.asInstanceOf[js.Any], CandidateSteps = CandidateSteps.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ObjectiveStatus = ObjectiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidate]
  }
  @scala.inline
  implicit class AutoMLCandidateOps[Self <: AutoMLCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidateName(value: CandidateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateStatus(value: CandidateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateSteps(value: CandidateSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectiveStatus(value: ObjectiveStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectiveStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: AutoMLFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalAutoMLJobObjectiveMetric(value: FinalAutoMLJobObjectiveMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalAutoMLJobObjectiveMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalAutoMLJobObjectiveMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalAutoMLJobObjectiveMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withInferenceContainers(value: AutoMLContainerDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceContainers")(js.undefined)
        ret
    }
  }
  
}

