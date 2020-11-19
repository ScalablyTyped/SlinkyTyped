package typingsSlinky.googleapis.servicebrokerV1Mod.servicebrokerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait SchemaGoogleIamV1SetIamPolicyRequest extends js.Object {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaGoogleIamV1Policy] = js.native
}
object SchemaGoogleIamV1SetIamPolicyRequest {
  
  @scala.inline
  def apply(): SchemaGoogleIamV1SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1SetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleIamV1SetIamPolicyRequestOps[Self <: SchemaGoogleIamV1SetIamPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: SchemaGoogleIamV1Policy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
