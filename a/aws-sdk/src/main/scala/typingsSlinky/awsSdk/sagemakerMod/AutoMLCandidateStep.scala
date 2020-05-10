package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLCandidateStep extends js.Object {
  /**
    * The ARN for the Candidate's step.
    */
  var CandidateStepArn: typingsSlinky.awsSdk.sagemakerMod.CandidateStepArn = js.native
  /**
    * The name for the Candidate's step.
    */
  var CandidateStepName: typingsSlinky.awsSdk.sagemakerMod.CandidateStepName = js.native
  /**
    * Whether the Candidate is at the transform, training, or processing step.
    */
  var CandidateStepType: typingsSlinky.awsSdk.sagemakerMod.CandidateStepType = js.native
}

object AutoMLCandidateStep {
  @scala.inline
  def apply(
    CandidateStepArn: CandidateStepArn,
    CandidateStepName: CandidateStepName,
    CandidateStepType: CandidateStepType
  ): AutoMLCandidateStep = {
    val __obj = js.Dynamic.literal(CandidateStepArn = CandidateStepArn.asInstanceOf[js.Any], CandidateStepName = CandidateStepName.asInstanceOf[js.Any], CandidateStepType = CandidateStepType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidateStep]
  }
  @scala.inline
  implicit class AutoMLCandidateStepOps[Self <: AutoMLCandidateStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidateStepArn(value: CandidateStepArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateStepArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateStepName(value: CandidateStepName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidateStepType(value: CandidateStepType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateStepType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

