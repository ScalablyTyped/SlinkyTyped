package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyVersionResponse extends StObject {
  
  /**
    * A structure containing details about the policy version.
    */
  var PolicyVersion: js.UndefOr[typingsSlinky.awsSdk.iamMod.PolicyVersion] = js.native
}
object GetPolicyVersionResponse {
  
  @scala.inline
  def apply(): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
  
  @scala.inline
  implicit class GetPolicyVersionResponseMutableBuilder[Self <: GetPolicyVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyVersion(value: PolicyVersion): Self = StObject.set(x, "PolicyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionUndefined: Self = StObject.set(x, "PolicyVersion", js.undefined)
  }
}
