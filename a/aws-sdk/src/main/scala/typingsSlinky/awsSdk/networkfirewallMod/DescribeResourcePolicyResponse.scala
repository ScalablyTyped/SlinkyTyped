package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourcePolicyResponse extends StObject {
  
  /**
    * The AWS Identity and Access Management policy for the resource. 
    */
  var Policy: js.UndefOr[PolicyString] = js.native
}
object DescribeResourcePolicyResponse {
  
  @scala.inline
  def apply(): DescribeResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeResourcePolicyResponseMutableBuilder[Self <: DescribeResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
