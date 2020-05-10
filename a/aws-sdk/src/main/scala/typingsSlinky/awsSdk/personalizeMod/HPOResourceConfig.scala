package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOResourceConfig extends js.Object {
  /**
    * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.native
  /**
    * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.native
}

object HPOResourceConfig {
  @scala.inline
  def apply(): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOResourceConfig]
  }
  @scala.inline
  implicit class HPOResourceConfigOps[Self <: HPOResourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNumberOfTrainingJobs(value: HPOResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberOfTrainingJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberOfTrainingJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberOfTrainingJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParallelTrainingJobs(value: HPOResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelTrainingJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParallelTrainingJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelTrainingJobs")(js.undefined)
        ret
    }
  }
  
}

