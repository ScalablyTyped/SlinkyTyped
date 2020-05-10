package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job to stop.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
}

object StopHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): StopHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHyperParameterTuningJobRequest]
  }
  @scala.inline
  implicit class StopHyperParameterTuningJobRequestOps[Self <: StopHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
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
  }
  
}

