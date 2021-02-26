package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRuleConfig extends StObject {
  
  /**
    * The new name for the Resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * The ID of the new outbound Resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  
  /**
    * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}
object ResolverRuleConfig {
  
  @scala.inline
  def apply(): ResolverRuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleConfig]
  }
  
  @scala.inline
  implicit class ResolverRuleConfigMutableBuilder[Self <: ResolverRuleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointIdUndefined: Self = StObject.set(x, "ResolverEndpointId", js.undefined)
    
    @scala.inline
    def setTargetIps(value: TargetList): Self = StObject.set(x, "TargetIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIpsUndefined: Self = StObject.set(x, "TargetIps", js.undefined)
    
    @scala.inline
    def setTargetIpsVarargs(value: TargetAddress*): Self = StObject.set(x, "TargetIps", js.Array(value :_*))
  }
}
