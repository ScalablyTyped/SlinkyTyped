package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageRecipePolicyRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that this policy should be applied to. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  
  /**
    * The policy to apply. 
    */
  var policy: ResourcePolicyDocument = js.native
}
object PutImageRecipePolicyRequest {
  
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn, policy: ResourcePolicyDocument): PutImageRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageRecipePolicyRequest]
  }
  
  @scala.inline
  implicit class PutImageRecipePolicyRequestOps[Self <: PutImageRecipePolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setImageRecipeArn(value: ImageRecipeArn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
