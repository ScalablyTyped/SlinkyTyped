package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.native
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.native
}

object SMSChannelRequest {
  @scala.inline
  def apply(): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSChannelRequest]
  }
  @scala.inline
  implicit class SMSChannelRequestOps[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSenderId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderId")(js.undefined)
        ret
    }
    @scala.inline
    def withShortCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortCode")(js.undefined)
        ret
    }
  }
  
}

