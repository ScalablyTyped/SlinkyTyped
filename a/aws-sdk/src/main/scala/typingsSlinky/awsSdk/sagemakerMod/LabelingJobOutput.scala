package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model trained as part of automated data labeling. 
    */
  var FinalActiveLearningModelArn: js.UndefOr[ModelArn] = js.native
  /**
    * The Amazon S3 bucket location of the manifest file for labeled data. 
    */
  var OutputDatasetS3Uri: S3Uri = js.native
}

object LabelingJobOutput {
  @scala.inline
  def apply(OutputDatasetS3Uri: S3Uri): LabelingJobOutput = {
    val __obj = js.Dynamic.literal(OutputDatasetS3Uri = OutputDatasetS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutput]
  }
  @scala.inline
  implicit class LabelingJobOutputOps[Self <: LabelingJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputDatasetS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDatasetS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalActiveLearningModelArn(value: ModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalActiveLearningModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalActiveLearningModelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalActiveLearningModelArn")(js.undefined)
        ret
    }
  }
  
}

