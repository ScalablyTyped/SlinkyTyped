package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrainingJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typingsSlinky.awsSdk.sagemakerMod.TrainingJobArn = js.native
}

object CreateTrainingJobResponse {
  @scala.inline
  def apply(TrainingJobArn: TrainingJobArn): CreateTrainingJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrainingJobResponse]
  }
  @scala.inline
  implicit class CreateTrainingJobResponseOps[Self <: CreateTrainingJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrainingJobArn(value: TrainingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

