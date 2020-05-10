package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentHyperParameterTuningJob extends js.Object {
  /**
    * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName] = js.native
}

object ParentHyperParameterTuningJob {
  @scala.inline
  def apply(): ParentHyperParameterTuningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentHyperParameterTuningJob]
  }
  @scala.inline
  implicit class ParentHyperParameterTuningJobOps[Self <: ParentHyperParameterTuningJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameterTuningJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobName")(js.undefined)
        ret
    }
  }
  
}

