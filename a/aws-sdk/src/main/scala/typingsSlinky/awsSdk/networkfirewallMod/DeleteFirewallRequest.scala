package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallName: js.UndefOr[ResourceName] = js.native
}
object DeleteFirewallRequest {
  
  @scala.inline
  def apply(): DeleteFirewallRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallRequest]
  }
  
  @scala.inline
  implicit class DeleteFirewallRequestMutableBuilder[Self <: DeleteFirewallRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
  }
}
