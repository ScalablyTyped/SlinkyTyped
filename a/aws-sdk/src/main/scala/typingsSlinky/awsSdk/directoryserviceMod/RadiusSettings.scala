package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusSettings extends StObject {
  
  /**
    * The protocol specified for your RADIUS endpoints.
    */
  var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.native
  
  /**
    * Not currently used.
    */
  var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.native
  
  /**
    * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic over this port from the AWS Directory Service servers.
    */
  var RadiusPort: js.UndefOr[PortNumber] = js.native
  
  /**
    * The maximum number of times that communication with the RADIUS server is attempted.
    */
  var RadiusRetries: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusRetries] = js.native
  
  /**
    * An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
    */
  var RadiusServers: js.UndefOr[Servers] = js.native
  
  /**
    * The amount of time, in seconds, to wait for the RADIUS server to respond.
    */
  var RadiusTimeout: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusTimeout] = js.native
  
  /**
    * Required for enabling RADIUS on the directory.
    */
  var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.native
  
  /**
    * Not currently used.
    */
  var UseSameUsername: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.UseSameUsername] = js.native
}
object RadiusSettings {
  
  @scala.inline
  def apply(): RadiusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusSettings]
  }
  
  @scala.inline
  implicit class RadiusSettingsMutableBuilder[Self <: RadiusSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationProtocol(value: RadiusAuthenticationProtocol): Self = StObject.set(x, "AuthenticationProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationProtocolUndefined: Self = StObject.set(x, "AuthenticationProtocol", js.undefined)
    
    @scala.inline
    def setDisplayLabel(value: RadiusDisplayLabel): Self = StObject.set(x, "DisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabelUndefined: Self = StObject.set(x, "DisplayLabel", js.undefined)
    
    @scala.inline
    def setRadiusPort(value: PortNumber): Self = StObject.set(x, "RadiusPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusPortUndefined: Self = StObject.set(x, "RadiusPort", js.undefined)
    
    @scala.inline
    def setRadiusRetries(value: RadiusRetries): Self = StObject.set(x, "RadiusRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusRetriesUndefined: Self = StObject.set(x, "RadiusRetries", js.undefined)
    
    @scala.inline
    def setRadiusServers(value: Servers): Self = StObject.set(x, "RadiusServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusServersUndefined: Self = StObject.set(x, "RadiusServers", js.undefined)
    
    @scala.inline
    def setRadiusServersVarargs(value: Server*): Self = StObject.set(x, "RadiusServers", js.Array(value :_*))
    
    @scala.inline
    def setRadiusTimeout(value: RadiusTimeout): Self = StObject.set(x, "RadiusTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusTimeoutUndefined: Self = StObject.set(x, "RadiusTimeout", js.undefined)
    
    @scala.inline
    def setSharedSecret(value: RadiusSharedSecret): Self = StObject.set(x, "SharedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedSecretUndefined: Self = StObject.set(x, "SharedSecret", js.undefined)
    
    @scala.inline
    def setUseSameUsername(value: UseSameUsername): Self = StObject.set(x, "UseSameUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSameUsernameUndefined: Self = StObject.set(x, "UseSameUsername", js.undefined)
  }
}
