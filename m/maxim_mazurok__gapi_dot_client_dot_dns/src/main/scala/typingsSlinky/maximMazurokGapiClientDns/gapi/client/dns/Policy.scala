package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Policy extends js.Object {
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not
    * available when an alternative name server is specified.
    */
  var alternativeNameServerConfig: js.UndefOr[PolicyAlternativeNameServerConfig] = js.native
  
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address will be allocated from each of the
    * sub-networks that are bound to this policy.
    */
  var enableInboundForwarding: js.UndefOr[Boolean] = js.native
  
  /** Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set. */
  var enableLogging: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** User assigned name for this policy. */
  var name: js.UndefOr[String] = js.native
  
  /** List of network names specifying networks to which this policy is applied. */
  var networks: js.UndefOr[js.Array[PolicyNetwork]] = js.native
}
object Policy {
  
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    
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
    def setAlternativeNameServerConfig(value: PolicyAlternativeNameServerConfig): Self = this.set("alternativeNameServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeNameServerConfig: Self = this.set("alternativeNameServerConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableInboundForwarding(value: Boolean): Self = this.set("enableInboundForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInboundForwarding: Self = this.set("enableInboundForwarding", js.undefined)
    
    @scala.inline
    def setEnableLogging(value: Boolean): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: PolicyNetwork*): Self = this.set("networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[PolicyNetwork]): Self = this.set("networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("networks", js.undefined)
  }
}
