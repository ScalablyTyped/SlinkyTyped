package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceViolation extends StObject {
  
  /**
    * Violation details for an EC2 instance.
    */
  var AwsEc2InstanceViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.AwsEc2InstanceViolation] = js.native
  
  /**
    * Violation details for network interface.
    */
  var AwsEc2NetworkInterfaceViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolation] = js.native
  
  /**
    * Violation details for security groups.
    */
  var AwsVPCSecurityGroupViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.AwsVPCSecurityGroupViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected Firewall Manager managed route table. 
    */
  var NetworkFirewallMissingExpectedRTViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.NetworkFirewallMissingExpectedRTViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed firewall in its VPC. 
    */
  var NetworkFirewallMissingFirewallViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.NetworkFirewallMissingFirewallViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected Firewall Manager managed subnet.
    */
  var NetworkFirewallMissingSubnetViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.NetworkFirewallMissingSubnetViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account has been modified in a way that makes it noncompliant. For example, the individual account owner might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
    */
  var NetworkFirewallPolicyModifiedViolation: js.UndefOr[typingsSlinky.awsSdk.fmsMod.NetworkFirewallPolicyModifiedViolation] = js.native
}
object ResourceViolation {
  
  @scala.inline
  def apply(): ResourceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceViolation]
  }
  
  @scala.inline
  implicit class ResourceViolationMutableBuilder[Self <: ResourceViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsEc2InstanceViolation(value: AwsEc2InstanceViolation): Self = StObject.set(x, "AwsEc2InstanceViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2InstanceViolationUndefined: Self = StObject.set(x, "AwsEc2InstanceViolation", js.undefined)
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolation(value: AwsEc2NetworkInterfaceViolation): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolationUndefined: Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", js.undefined)
    
    @scala.inline
    def setAwsVPCSecurityGroupViolation(value: AwsVPCSecurityGroupViolation): Self = StObject.set(x, "AwsVPCSecurityGroupViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsVPCSecurityGroupViolationUndefined: Self = StObject.set(x, "AwsVPCSecurityGroupViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingExpectedRTViolation(value: NetworkFirewallMissingExpectedRTViolation): Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkFirewallMissingExpectedRTViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingFirewallViolation(value: NetworkFirewallMissingFirewallViolation): Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkFirewallMissingFirewallViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingSubnetViolation(value: NetworkFirewallMissingSubnetViolation): Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkFirewallMissingSubnetViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallPolicyModifiedViolation(value: NetworkFirewallPolicyModifiedViolation): Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkFirewallPolicyModifiedViolationUndefined: Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", js.undefined)
  }
}
