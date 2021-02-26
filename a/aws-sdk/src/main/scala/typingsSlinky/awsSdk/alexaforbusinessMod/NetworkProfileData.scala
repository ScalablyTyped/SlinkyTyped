package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkProfileData extends StObject {
  
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  
  /**
    * Detailed information about a device's network profile.
    */
  var Description: js.UndefOr[NetworkProfileDescription] = js.native
  
  /**
    * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
    */
  var EapMethod: js.UndefOr[NetworkEapMethod] = js.native
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NetworkProfileName] = js.native
  
  /**
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: js.UndefOr[NetworkSecurityType] = js.native
  
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: js.UndefOr[NetworkSsid] = js.native
}
object NetworkProfileData {
  
  @scala.inline
  def apply(): NetworkProfileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProfileData]
  }
  
  @scala.inline
  implicit class NetworkProfileDataMutableBuilder[Self <: NetworkProfileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setDescription(value: NetworkProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEapMethod(value: NetworkEapMethod): Self = StObject.set(x, "EapMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEapMethodUndefined: Self = StObject.set(x, "EapMethod", js.undefined)
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
    
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileNameUndefined: Self = StObject.set(x, "NetworkProfileName", js.undefined)
    
    @scala.inline
    def setSecurityType(value: NetworkSecurityType): Self = StObject.set(x, "SecurityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypeUndefined: Self = StObject.set(x, "SecurityType", js.undefined)
    
    @scala.inline
    def setSsid(value: NetworkSsid): Self = StObject.set(x, "Ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsidUndefined: Self = StObject.set(x, "Ssid", js.undefined)
  }
}
