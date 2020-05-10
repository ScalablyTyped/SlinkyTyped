package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNetworkProfileRequest extends js.Object {
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
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn = js.native
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NetworkProfileName] = js.native
  /**
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.native
  /**
    * The root certificate(s) of your authentication server that will be installed on your devices and used to trust your authentication server during EAP negotiation. 
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.native
}

object UpdateNetworkProfileRequest {
  @scala.inline
  def apply(NetworkProfileArn: Arn): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
  @scala.inline
  implicit class UpdateNetworkProfileRequestOps[Self <: UpdateNetworkProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
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

