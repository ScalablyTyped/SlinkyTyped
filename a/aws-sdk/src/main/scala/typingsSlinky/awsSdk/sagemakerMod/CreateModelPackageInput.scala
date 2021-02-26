package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelPackageInput extends StObject {
  
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
  var ModelPackageName: js.UndefOr[EntityName] = js.native
  
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
  def apply(): CreateModelPackageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelPackageInput]
  }
  
  @scala.inline
  implicit class CreateModelPackageInputMutableBuilder[Self <: CreateModelPackageInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    @scala.inline
    def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    @scala.inline
    def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    @scala.inline
    def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageNameUndefined: Self = StObject.set(x, "ModelPackageName", js.undefined)
    
    @scala.inline
    def setSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = StObject.set(x, "SourceAlgorithmSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAlgorithmSpecificationUndefined: Self = StObject.set(x, "SourceAlgorithmSpecification", js.undefined)
    
    @scala.inline
    def setValidationSpecification(value: ModelPackageValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
