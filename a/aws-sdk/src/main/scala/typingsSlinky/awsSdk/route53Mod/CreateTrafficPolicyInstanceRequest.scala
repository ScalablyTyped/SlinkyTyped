package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the configuration in a traffic policy.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
    */
  var Name: DNSName = js.native
  
  /**
    * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in the specified hosted zone.
    */
  var TTL: typingsSlinky.awsSdk.route53Mod.TTL = js.native
  
  /**
    * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyId: typingsSlinky.awsSdk.route53Mod.TrafficPolicyId = js.native
  
  /**
    * The version of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyVersion: typingsSlinky.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}
object CreateTrafficPolicyInstanceRequest {
  
  @scala.inline
  def apply(
    HostedZoneId: ResourceId,
    Name: DNSName,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): CreateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateTrafficPolicyInstanceRequestMutableBuilder[Self <: CreateTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DNSName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTL(value: TTL): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyId(value: TrafficPolicyId): Self = StObject.set(x, "TrafficPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "TrafficPolicyVersion", value.asInstanceOf[js.Any])
  }
}
