package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelPackageInput extends js.Object {
  /**
    * Whether to certify the model package for listing on AWS Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CertifyForMarketplace] = js.native
  /**
    * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.InferenceSpecification] = js.native
  /**
    * A description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: EntityName = js.native
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SourceAlgorithmSpecification] = js.native
  /**
    * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.native
}

object CreateModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: EntityName): CreateModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageInput]
  }
  @scala.inline
  implicit class CreateModelPackageInputOps[Self <: CreateModelPackageInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelPackageName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageName")(value.asInstanceOf[js.Any])
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

