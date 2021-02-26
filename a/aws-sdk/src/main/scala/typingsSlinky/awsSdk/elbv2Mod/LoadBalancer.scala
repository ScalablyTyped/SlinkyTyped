package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancer extends StObject {
  
  /**
    * The subnets for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.AvailabilityZones] = js.native
  
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.CanonicalHostedZoneId] = js.native
  
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * [Application Load Balancers on Outposts] The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.CustomerOwnedIpv4Pool] = js.native
  
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.DNSName] = js.native
  
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.IpAddressType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArn] = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerName] = js.native
  
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.native
  
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SecurityGroups] = js.native
  
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.native
  
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.VpcId] = js.native
}
object LoadBalancer {
  
  @scala.inline
  def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  @scala.inline
  implicit class LoadBalancerMutableBuilder[Self <: LoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setCanonicalHostedZoneId(value: CanonicalHostedZoneId): Self = StObject.set(x, "CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneIdUndefined: Self = StObject.set(x, "CanonicalHostedZoneId", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: CustomerOwnedIpv4Pool): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: LoadBalancerName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    @scala.inline
    def setScheme(value: LoadBalancerSchemeEnum): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setState(value: LoadBalancerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: LoadBalancerTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
