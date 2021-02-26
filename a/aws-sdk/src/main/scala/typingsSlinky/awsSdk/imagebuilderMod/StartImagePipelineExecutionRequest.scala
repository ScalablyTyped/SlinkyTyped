package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImagePipelineExecutionRequest extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to manually invoke. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}
object StartImagePipelineExecutionRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, imagePipelineArn: ImagePipelineArn): StartImagePipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImagePipelineExecutionRequest]
  }
  
  @scala.inline
  implicit class StartImagePipelineExecutionRequestMutableBuilder[Self <: StartImagePipelineExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = StObject.set(x, "imagePipelineArn", value.asInstanceOf[js.Any])
  }
}
