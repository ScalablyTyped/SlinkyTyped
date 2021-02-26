package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImagePolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image that this policy was applied to. 
    */
  var imageArn: js.UndefOr[ImageBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object PutImagePolicyResponse {
  
  @scala.inline
  def apply(): PutImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImagePolicyResponse]
  }
  
  @scala.inline
  implicit class PutImagePolicyResponseMutableBuilder[Self <: PutImagePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArnUndefined: Self = StObject.set(x, "imageArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
