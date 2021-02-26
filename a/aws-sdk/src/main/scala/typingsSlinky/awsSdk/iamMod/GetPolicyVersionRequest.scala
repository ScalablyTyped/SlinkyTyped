package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the managed policy that you want information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
  
  /**
    * Identifies the policy version to retrieve. This parameter allows (through its regex pattern) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits.
    */
  var VersionId: policyVersionIdType = js.native
}
object GetPolicyVersionRequest {
  
  @scala.inline
  def apply(PolicyArn: arnType, VersionId: policyVersionIdType): GetPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyVersionRequest]
  }
  
  @scala.inline
  implicit class GetPolicyVersionRequestMutableBuilder[Self <: GetPolicyVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: policyVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
