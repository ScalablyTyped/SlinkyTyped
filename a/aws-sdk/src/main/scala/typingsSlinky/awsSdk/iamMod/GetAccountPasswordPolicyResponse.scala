package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountPasswordPolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the account's password policy.
    */
  var PasswordPolicy: typingsSlinky.awsSdk.iamMod.PasswordPolicy = js.native
}
object GetAccountPasswordPolicyResponse {
  
  @scala.inline
  def apply(PasswordPolicy: PasswordPolicy): GetAccountPasswordPolicyResponse = {
    val __obj = js.Dynamic.literal(PasswordPolicy = PasswordPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountPasswordPolicyResponse]
  }
  
  @scala.inline
  implicit class GetAccountPasswordPolicyResponseMutableBuilder[Self <: GetAccountPasswordPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordPolicy(value: PasswordPolicy): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
  }
}
