package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHyperParameterTuningJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
    */
  var HyperParameterTuningJobArn: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
}

object CreateHyperParameterTuningJobResponse {
  @scala.inline
  def apply(HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
  }
  @scala.inline
  implicit class CreateHyperParameterTuningJobResponseOps[Self <: CreateHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameterTuningJobArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

