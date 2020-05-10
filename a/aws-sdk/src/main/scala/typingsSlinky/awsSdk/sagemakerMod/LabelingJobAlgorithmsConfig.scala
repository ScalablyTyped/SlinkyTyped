package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobAlgorithmsConfig extends js.Object {
  /**
    * At the end of an auto-label job Amazon SageMaker Ground Truth sends the Amazon Resource Nam (ARN) of the final model used for auto-labeling. You can use this model as the starting point for subsequent similar jobs by providing the ARN of the model here. 
    */
  var InitialActiveLearningModelArn: js.UndefOr[ModelArn] = js.native
  /**
    * Specifies the Amazon Resource Name (ARN) of the algorithm used for auto-labeling. You must select one of the following ARNs:    Image classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/image-classification     Text classification   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/text-classification     Object detection   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/object-detection     Semantic Segmentation   arn:aws:sagemaker:region:027400017018:labeling-job-algorithm-specification/semantic-segmentation   
    */
  var LabelingJobAlgorithmSpecificationArn: typingsSlinky.awsSdk.sagemakerMod.LabelingJobAlgorithmSpecificationArn = js.native
  /**
    * Provides configuration information for a labeling job.
    */
  var LabelingJobResourceConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobResourceConfig] = js.native
}

object LabelingJobAlgorithmsConfig {
  @scala.inline
  def apply(LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn): LabelingJobAlgorithmsConfig = {
    val __obj = js.Dynamic.literal(LabelingJobAlgorithmSpecificationArn = LabelingJobAlgorithmSpecificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobAlgorithmsConfig]
  }
  @scala.inline
  implicit class LabelingJobAlgorithmsConfigOps[Self <: LabelingJobAlgorithmsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelingJobAlgorithmSpecificationArn(value: LabelingJobAlgorithmSpecificationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobAlgorithmSpecificationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialActiveLearningModelArn(value: ModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialActiveLearningModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialActiveLearningModelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialActiveLearningModelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelingJobResourceConfig(value: LabelingJobResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingJobResourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobResourceConfig")(js.undefined)
        ret
    }
  }
  
}

