package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSSandboxChannelRequest extends js.Object {
  /**
    * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
    */
  var BundleId: js.UndefOr[string] = js.native
  /**
    * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using an APNs certificate.
    */
  var Certificate: js.UndefOr[string] = js.native
  /**
    * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox environment, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.native
  /**
    * Specifies whether to enable the APNs sandbox channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs sandbox environment.
    */
  var PrivateKey: js.UndefOr[string] = js.native
  /**
    * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
    */
  var TeamId: js.UndefOr[string] = js.native
  /**
    * The authentication key to use for APNs tokens.
    */
  var TokenKey: js.UndefOr[string] = js.native
  /**
    * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the APNs sandbox environment by using APNs tokens.
    */
  var TokenKeyId: js.UndefOr[string] = js.native
}

object APNSSandboxChannelRequest {
  @scala.inline
  def apply(): APNSSandboxChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSSandboxChannelRequest]
  }
  @scala.inline
  implicit class APNSSandboxChannelRequestOps[Self <: APNSSandboxChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAuthenticationMethod(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAuthenticationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAuthenticationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAuthenticationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeamId")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenKey(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenKeyId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenKeyId")(js.undefined)
        ret
    }
  }
  
}

