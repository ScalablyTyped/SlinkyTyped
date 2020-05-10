package typingsSlinky.awsSdkClientPinpointBrowser.typesApnsvoipchannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSVoipChannelRequest extends js.Object {
  /**
    * The bundle id used for APNs Tokens.
    */
  var BundleId: js.UndefOr[String] = js.native
  /**
    * The distribution certificate from Apple.
    */
  var Certificate: js.UndefOr[String] = js.native
  /**
    * The default authentication method used for APNs.
    */
  var DefaultAuthenticationMethod: js.UndefOr[String] = js.native
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The certificate private key.
    */
  var PrivateKey: js.UndefOr[String] = js.native
  /**
    * The team id used for APNs Tokens.
    */
  var TeamId: js.UndefOr[String] = js.native
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKey: js.UndefOr[String] = js.native
  /**
    * The token key used for APNs Tokens.
    */
  var TokenKeyId: js.UndefOr[String] = js.native
}

object APNSVoipChannelRequest {
  @scala.inline
  def apply(): APNSVoipChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSVoipChannelRequest]
  }
  @scala.inline
  implicit class APNSVoipChannelRequestOps[Self <: APNSVoipChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
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
    def withCertificate(value: String): Self = {
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
    def withDefaultAuthenticationMethod(value: String): Self = {
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
    def withEnabled(value: Boolean): Self = {
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
    def withPrivateKey(value: String): Self = {
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
    def withTeamId(value: String): Self = {
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
    def withTokenKey(value: String): Self = {
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
    def withTokenKeyId(value: String): Self = {
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

