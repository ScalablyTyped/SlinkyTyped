package typingsSlinky.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you obtained from the Amazon App Distribution Portal.
    */
  var ClientId: js.UndefOr[String] = js.native
  /**
    * The Client Secret that you obtained from the Amazon App Distribution Portal.
    */
  var ClientSecret: js.UndefOr[String] = js.native
  /**
    * Indicates whether or not the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ADMChannelRequest {
  @scala.inline
  def apply(): ADMChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ADMChannelRequest]
  }
  @scala.inline
  implicit class ADMChannelRequestOps[Self <: ADMChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSecret")(js.undefined)
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
  }
  
}

