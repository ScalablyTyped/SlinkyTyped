package typingsSlinky.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyMetadata extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy.
    */
  var Arn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}
object FirewallPolicyMetadata {
  
  @scala.inline
  def apply(): FirewallPolicyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyMetadata]
  }
  
  @scala.inline
  implicit class FirewallPolicyMetadataOps[Self <: FirewallPolicyMetadata] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ResourceArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
