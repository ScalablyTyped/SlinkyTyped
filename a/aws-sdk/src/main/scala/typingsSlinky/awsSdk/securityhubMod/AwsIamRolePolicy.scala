package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamRolePolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamRolePolicy {
  
  @scala.inline
  def apply(): AwsIamRolePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRolePolicy]
  }
  
  @scala.inline
  implicit class AwsIamRolePolicyMutableBuilder[Self <: AwsIamRolePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
