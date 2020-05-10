package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAlgorithmInput extends js.Object {
  /**
    * A description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * Specifies details about inference jobs that the algorithm runs, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the algorithm supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * Specifies details about training jobs run by this algorithm, including the following:   The Amazon ECR path of the container and the version digest of the algorithm.   The hyperparameters that the algorithm supports.   The instance types that the algorithm supports for training.   Whether the algorithm supports distributed training.   The metrics that the algorithm emits to Amazon CloudWatch.   Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.   The input channels that the algorithm supports for training data. For example, an algorithm might support train, validation, and test channels.  
    */
  var TrainingSpecification: typingsSlinky.awsSdk.sagemakerMod.TrainingSpecification = js.native
  /**
    * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the algorithm's inference code.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}

object CreateAlgorithmInput {
  @scala.inline
  def apply(AlgorithmName: EntityName, TrainingSpecification: TrainingSpecification): CreateAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmInput]
  }
  @scala.inline
  implicit class CreateAlgorithmInputOps[Self <: CreateAlgorithmInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingSpecification(value: TrainingSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCertifyForMarketplace(value: CertifyForMarketplace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertifyForMarketplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertifyForMarketplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertifyForMarketplace")(js.undefined)
        ret
    }
    @scala.inline
    def withInferenceSpecification(value: InferenceSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSpecification(value: AlgorithmValidationSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationSpecification")(js.undefined)
        ret
    }
  }
  
}

