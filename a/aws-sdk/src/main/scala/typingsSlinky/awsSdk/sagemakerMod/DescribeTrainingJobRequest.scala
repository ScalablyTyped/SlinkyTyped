package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrainingJobRequest extends js.Object {
  /**
    * The name of the training job.
    */
  var TrainingJobName: typingsSlinky.awsSdk.sagemakerMod.TrainingJobName = js.native
}

object DescribeTrainingJobRequest {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): DescribeTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrainingJobRequest]
  }
  @scala.inline
  implicit class DescribeTrainingJobRequestOps[Self <: DescribeTrainingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrainingJobName(value: TrainingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingJobName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

