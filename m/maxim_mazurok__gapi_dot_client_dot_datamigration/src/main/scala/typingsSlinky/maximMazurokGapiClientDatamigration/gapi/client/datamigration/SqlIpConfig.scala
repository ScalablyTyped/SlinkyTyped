package typingsSlinky.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlIpConfig extends StObject {
  
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation
    * (e.g. `192.168.100.0/24`).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SqlAclEntry]] = js.native
  
  /** Whether the instance should be assigned an IPv4 address or not. */
  var enableIpv4: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be
    * updated, but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.native
  
  /** Whether SSL connections over IP should be enforced or not. */
  var requireSsl: js.UndefOr[Boolean] = js.native
}
object SqlIpConfig {
  
  @scala.inline
  def apply(): SqlIpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlIpConfig]
  }
  
  @scala.inline
  implicit class SqlIpConfigMutableBuilder[Self <: SqlIpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[SqlAclEntry]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworksVarargs(value: SqlAclEntry*): Self = StObject.set(x, "authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setEnableIpv4(value: Boolean): Self = StObject.set(x, "enableIpv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIpv4Undefined: Self = StObject.set(x, "enableIpv4", js.undefined)
    
    @scala.inline
    def setPrivateNetwork(value: String): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    @scala.inline
    def setRequireSsl(value: Boolean): Self = StObject.set(x, "requireSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSslUndefined: Self = StObject.set(x, "requireSsl", js.undefined)
  }
}
