package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobCompletionCriteria extends js.Object {
  /**
    * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or greater than MaxRuntimePerTrainingJobInSeconds.
    */
  var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxAutoMLJobRuntimeInSeconds] = js.native
  /**
    * The maximum number of times a training job is allowed to run.
    */
  var MaxCandidates: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxCandidates] = js.native
  /**
    * The maximum time, in seconds, a job is allowed to run.
    */
  var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxRuntimePerTrainingJobInSeconds] = js.native
}

object AutoMLJobCompletionCriteria {
  @scala.inline
  def apply(): AutoMLJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobCompletionCriteria]
  }
  @scala.inline
  implicit class AutoMLJobCompletionCriteriaOps[Self <: AutoMLJobCompletionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAutoMLJobRuntimeInSeconds(value: MaxAutoMLJobRuntimeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAutoMLJobRuntimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAutoMLJobRuntimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAutoMLJobRuntimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCandidates(value: MaxCandidates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCandidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCandidates")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRuntimePerTrainingJobInSeconds(value: MaxRuntimePerTrainingJobInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRuntimePerTrainingJobInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRuntimePerTrainingJobInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRuntimePerTrainingJobInSeconds")(js.undefined)
        ret
    }
  }
  
}

