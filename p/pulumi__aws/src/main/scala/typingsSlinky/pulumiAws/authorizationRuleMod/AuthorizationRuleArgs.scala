package typingsSlinky.pulumiAws.authorizationRuleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationRuleArgs extends js.Object {
  
  /**
    * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
    */
  val accessGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
    */
  val authorizeAllGroups: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Input[String] = js.native
  
  /**
    * A brief description of the authorization rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
    */
  val targetNetworkCidr: Input[String] = js.native
}
object AuthorizationRuleArgs {
  
  @scala.inline
  def apply(clientVpnEndpointId: Input[String], targetNetworkCidr: Input[String]): AuthorizationRuleArgs = {
    val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], targetNetworkCidr = targetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationRuleArgs]
  }
  
  @scala.inline
  implicit class AuthorizationRuleArgsOps[Self <: AuthorizationRuleArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientVpnEndpointId(value: Input[String]): Self = this.set("clientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNetworkCidr(value: Input[String]): Self = this.set("targetNetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessGroupId(value: Input[String]): Self = this.set("accessGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessGroupId: Self = this.set("accessGroupId", js.undefined)
    
    @scala.inline
    def setAuthorizeAllGroups(value: Input[Boolean]): Self = this.set("authorizeAllGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizeAllGroups: Self = this.set("authorizeAllGroups", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
