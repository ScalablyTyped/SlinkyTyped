package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: string = js.native
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: string = js.native
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object ADMChannelRequest {
  @scala.inline
  def apply(ClientId: string, ClientSecret: string): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
  @scala.inline
  implicit class ADMChannelRequestOps[Self <: ADMChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSecret")(value.asInstanceOf[js.Any])
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
  }
  
}

