package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPackageContainerDefinition extends StObject {
  
  /**
    * The DNS host name for the Docker container.
    */
  var ContainerHostname: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerHostname] = js.native
  
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var Image: ContainerImage = js.native
  
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var ImageDigest: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageDigest] = js.native
  
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  The model artifacts must be in an S3 bucket that is in the same region as the model package. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
  
  /**
    * The AWS Marketplace product ID of the model package.
    */
  var ProductId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProductId] = js.native
}
object ModelPackageContainerDefinition {
  
  @scala.inline
  def apply(Image: ContainerImage): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
  
  @scala.inline
  implicit class ModelPackageContainerDefinitionMutableBuilder[Self <: ModelPackageContainerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerHostname(value: ContainerHostname): Self = StObject.set(x, "ContainerHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHostnameUndefined: Self = StObject.set(x, "ContainerHostname", js.undefined)
    
    @scala.inline
    def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = StObject.set(x, "ImageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "ImageDigest", js.undefined)
    
    @scala.inline
    def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDataUrlUndefined: Self = StObject.set(x, "ModelDataUrl", js.undefined)
    
    @scala.inline
    def setProductId(value: ProductId): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
  }
}
