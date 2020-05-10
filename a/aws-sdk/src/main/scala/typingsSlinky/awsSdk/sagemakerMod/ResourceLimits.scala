package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLimits extends js.Object {
  /**
    * The maximum number of training jobs that a hyperparameter tuning job can launch.
    */
  var MaxNumberOfTrainingJobs: typingsSlinky.awsSdk.sagemakerMod.MaxNumberOfTrainingJobs = js.native
  /**
    * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
    */
  var MaxParallelTrainingJobs: typingsSlinky.awsSdk.sagemakerMod.MaxParallelTrainingJobs = js.native
}

object ResourceLimits {
  @scala.inline
  def apply(MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs, MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
    val __obj = js.Dynamic.literal(MaxNumberOfTrainingJobs = MaxNumberOfTrainingJobs.asInstanceOf[js.Any], MaxParallelTrainingJobs = MaxParallelTrainingJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
  @scala.inline
  implicit class ResourceLimitsOps[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNumberOfTrainingJobs(value: MaxNumberOfTrainingJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumberOfTrainingJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxParallelTrainingJobs(value: MaxParallelTrainingJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxParallelTrainingJobs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

