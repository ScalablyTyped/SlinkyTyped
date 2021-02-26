package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEffectivePolicyResponse extends StObject {
  
  /**
    * The contents of the effective policy.
    */
  var EffectivePolicy: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.EffectivePolicy] = js.native
}
object DescribeEffectivePolicyResponse {
  
  @scala.inline
  def apply(): DescribeEffectivePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePolicyResponse]
  }
  
  @scala.inline
  implicit class DescribeEffectivePolicyResponseMutableBuilder[Self <: DescribeEffectivePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectivePolicy(value: EffectivePolicy): Self = StObject.set(x, "EffectivePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePolicyUndefined: Self = StObject.set(x, "EffectivePolicy", js.undefined)
  }
}
