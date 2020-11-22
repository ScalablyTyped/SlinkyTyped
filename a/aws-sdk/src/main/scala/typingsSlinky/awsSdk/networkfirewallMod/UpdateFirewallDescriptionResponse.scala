package typingsSlinky.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFirewallDescriptionResponse extends js.Object {
  
  /**
    * A description of the firewall.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.networkfirewallMod.Description] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.native
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typingsSlinky.awsSdk.networkfirewallMod.UpdateToken] = js.native
}
object UpdateFirewallDescriptionResponse {
  
  @scala.inline
  def apply(): UpdateFirewallDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallDescriptionResponse]
  }
  
  @scala.inline
  implicit class UpdateFirewallDescriptionResponseOps[Self <: UpdateFirewallDescriptionResponse] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = this.set("FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallArn: Self = this.set("FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = this.set("FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallName: Self = this.set("FirewallName", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = this.set("UpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateToken: Self = this.set("UpdateToken", js.undefined)
  }
}
