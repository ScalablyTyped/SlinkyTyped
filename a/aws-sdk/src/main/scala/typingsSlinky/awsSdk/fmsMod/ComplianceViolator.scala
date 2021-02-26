package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceViolator extends StObject {
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceId] = js.native
  
  /**
    * The resource type. This is in the format shown in the AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::CloudFront::Distribution, or AWS::NetworkFirewall::FirewallPolicy.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ResourceType] = js.native
  
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ViolationReason] = js.native
}
object ComplianceViolator {
  
  @scala.inline
  def apply(): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceViolator]
  }
  
  @scala.inline
  implicit class ComplianceViolatorMutableBuilder[Self <: ComplianceViolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setViolationReason(value: ViolationReason): Self = StObject.set(x, "ViolationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationReasonUndefined: Self = StObject.set(x, "ViolationReason", js.undefined)
  }
}
