package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBatchInferenceJobResponse extends js.Object {
  /**
    * The ARN of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.native
}

object CreateBatchInferenceJobResponse {
  @scala.inline
  def apply(): CreateBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchInferenceJobResponse]
  }
  @scala.inline
  implicit class CreateBatchInferenceJobResponseOps[Self <: CreateBatchInferenceJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchInferenceJobArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInferenceJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchInferenceJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchInferenceJobArn")(js.undefined)
        ret
    }
  }
  
}

