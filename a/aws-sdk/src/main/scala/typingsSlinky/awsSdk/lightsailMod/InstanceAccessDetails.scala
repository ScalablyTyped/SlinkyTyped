package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAccessDetails extends StObject {
  
  /**
    * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
    */
  var certKey: js.UndefOr[String] = js.native
  
  /**
    * For SSH access, the date on which the temporary keys expire.
    */
  var expiresAt: js.UndefOr[js.Date] = js.native
  
  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  var hostKeys: js.UndefOr[HostKeysList] = js.native
  
  /**
    * The name of this Amazon Lightsail instance.
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The public IP address of the Amazon Lightsail instance.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  
  /**
    * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
    */
  var passwordData: js.UndefOr[PasswordData] = js.native
  
  /**
    * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
    */
  var privateKey: js.UndefOr[String] = js.native
  
  /**
    * The protocol for these Amazon Lightsail instance access details.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.native
  
  /**
    * The user name to use when logging in to the Amazon Lightsail instance.
    */
  var username: js.UndefOr[String] = js.native
}
object InstanceAccessDetails {
  
  @scala.inline
  def apply(): InstanceAccessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccessDetails]
  }
  
  @scala.inline
  implicit class InstanceAccessDetailsMutableBuilder[Self <: InstanceAccessDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertKey(value: String): Self = StObject.set(x, "certKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertKeyUndefined: Self = StObject.set(x, "certKey", js.undefined)
    
    @scala.inline
    def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    @scala.inline
    def setHostKeys(value: HostKeysList): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostKeysUndefined: Self = StObject.set(x, "hostKeys", js.undefined)
    
    @scala.inline
    def setHostKeysVarargs(value: HostKeyAttributes*): Self = StObject.set(x, "hostKeys", js.Array(value :_*))
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordData(value: PasswordData): Self = StObject.set(x, "passwordData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordDataUndefined: Self = StObject.set(x, "passwordData", js.undefined)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    @scala.inline
    def setProtocol(value: InstanceAccessProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
