package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLabelingJobRequest extends js.Object {
  /**
    * The name of the labeling job to return information for.
    */
  var LabelingJobName: typingsSlinky.awsSdk.sagemakerMod.LabelingJobName = js.native
}

object DescribeLabelingJobRequest {
  @scala.inline
  def apply(LabelingJobName: LabelingJobName): DescribeLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelingJobRequest]
  }
  @scala.inline
  implicit class DescribeLabelingJobRequestOps[Self <: DescribeLabelingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelingJobName(value: LabelingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

