package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProfile extends js.Object {
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices. 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The current password of the Wi-Fi network.
    */
  var CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.native
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
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.native
  /**
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: js.UndefOr[NetworkSecurityType] = js.native
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: js.UndefOr[NetworkSsid] = js.native
  /**
    * The root certificates of your authentication server, which is installed on your devices and used to trust your authentication server during EAP negotiation.
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.native
}

object NetworkProfile {
  @scala.inline
  def apply(): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProfile]
  }
  @scala.inline
  implicit class NetworkProfileOps[Self <: NetworkProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPassword(value: CurrentWiFiPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NetworkProfileDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEapMethod(value: NetworkEapMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EapMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEapMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EapMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfileName(value: NetworkProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPassword(value: NextWiFiPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityType(value: NetworkSecurityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityType")(js.undefined)
        ret
    }
    @scala.inline
    def withSsid(value: NetworkSsid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ssid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ssid")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustAnchors(value: TrustAnchorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustAnchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustAnchors")(js.undefined)
        ret
    }
  }
  
}

