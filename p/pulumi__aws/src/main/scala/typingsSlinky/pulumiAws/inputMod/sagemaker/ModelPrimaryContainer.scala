package typingsSlinky.pulumiAws.inputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPrimaryContainer extends js.Object {
  
  /**
    * The DNS host name for the container.
    */
  var containerHostname: js.UndefOr[Input[String]] = js.native
  
  /**
    * Environment variables for the Docker container.
    * A list of key value pairs.
    */
  var environment: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The registry path where the inference code image is stored in Amazon ECR.
    */
  var image: Input[String] = js.native
  
  /**
    * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
    */
  var imageConfig: js.UndefOr[Input[ModelPrimaryContainerImageConfig]] = js.native
  
  /**
    * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
    */
  var mode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL for the S3 location where model artifacts are stored.
    */
  var modelDataUrl: js.UndefOr[Input[String]] = js.native
}
object ModelPrimaryContainer {
  
  @scala.inline
  def apply(image: Input[String]): ModelPrimaryContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPrimaryContainer]
  }
  
  @scala.inline
  implicit class ModelPrimaryContainerOps[Self <: ModelPrimaryContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: Input[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHostname(value: Input[String]): Self = this.set("containerHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerHostname: Self = this.set("containerHostname", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Input[StringDictionary[Input[String]]]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setImageConfig(value: Input[ModelPrimaryContainerImageConfig]): Self = this.set("imageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageConfig: Self = this.set("imageConfig", js.undefined)
    
    @scala.inline
    def setMode(value: Input[String]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModelDataUrl(value: Input[String]): Self = this.set("modelDataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDataUrl: Self = this.set("modelDataUrl", js.undefined)
  }
}
