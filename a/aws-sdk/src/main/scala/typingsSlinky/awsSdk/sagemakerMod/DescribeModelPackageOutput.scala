package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelPackageOutput extends js.Object {
  /**
    * Whether the model package is certified for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * A timestamp specifying when the model package was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * Details about inference jobs that can be run with models based on this model package.
    */
  var InferenceSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typingsSlinky.awsSdk.sagemakerMod.ModelPackageArn = js.native
  /**
    * A brief summary of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package being described.
    */
  var ModelPackageName: EntityName = js.native
  /**
    * The current status of the model package.
    */
  var ModelPackageStatus: typingsSlinky.awsSdk.sagemakerMod.ModelPackageStatus = js.native
  /**
    * Details about the current status of the model package.
    */
  var ModelPackageStatusDetails: typingsSlinky.awsSdk.sagemakerMod.ModelPackageStatusDetails = js.native
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SourceAlgorithmSpecification] = js.native
  /**
    * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}

object DescribeModelPackageOutput {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageStatusDetails: ModelPackageStatusDetails
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
  @scala.inline
  implicit class DescribeModelPackageOutputOps[Self <: DescribeModelPackageOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelPackageArn(value: ModelPackageArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelPackageName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelPackageStatus(value: ModelPackageStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelPackageStatusDetails(value: ModelPackageStatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageStatusDetails")(value.asInstanceOf[js.Any])
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
    def withModelPackageDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelPackageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAlgorithmSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAlgorithmSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAlgorithmSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSpecification(value: ModelPackageValidationSpecification): Self = {
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

