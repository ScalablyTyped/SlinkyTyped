package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typingsSlinky.awsSdk.sagemakerMod.AlgorithmArn = js.native
  /**
    * A brief summary about the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm being described.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * The current status of the algorithm.
    */
  var AlgorithmStatus: typingsSlinky.awsSdk.sagemakerMod.AlgorithmStatus = js.native
  /**
    * Details about the current status of the algorithm.
    */
  var AlgorithmStatusDetails: typingsSlinky.awsSdk.sagemakerMod.AlgorithmStatusDetails = js.native
  /**
    * Whether the algorithm is certified to be listed in AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * A timestamp specifying when the algorithm was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * Details about inference jobs that the algorithm runs.
    */
  var InferenceSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * The product identifier of the algorithm.
    */
  var ProductId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProductId] = js.native
  /**
    * Details about training jobs run by this algorithm.
    */
  var TrainingSpecification: typingsSlinky.awsSdk.sagemakerMod.TrainingSpecification = js.native
  /**
    * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
    */
  var ValidationSpecification: js.UndefOr[AlgorithmValidationSpecification] = js.native
}

object DescribeAlgorithmOutput {
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    AlgorithmStatusDetails: AlgorithmStatusDetails,
    CreationTime: js.Date,
    TrainingSpecification: TrainingSpecification
  ): DescribeAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], AlgorithmStatusDetails = AlgorithmStatusDetails.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], TrainingSpecification = TrainingSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmOutput]
  }
  @scala.inline
  implicit class DescribeAlgorithmOutputOps[Self <: DescribeAlgorithmOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: AlgorithmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmStatus(value: AlgorithmStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmStatusDetails(value: AlgorithmStatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmStatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
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
    def withProductId(value: ProductId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
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

