package typingsSlinky.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientName extends js.Object {
  var recipientName: String | Null = js.native
  var recipientNotes: String | Null = js.native
  var recipientSkipSMSNotifications: String | Null = js.native
  var useMerchantForProxy: String | Null = js.native
}

object RecipientName {
  @scala.inline
  def apply(): RecipientName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientName]
  }
  @scala.inline
  implicit class RecipientNameOps[Self <: RecipientName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(null)
        ret
    }
    @scala.inline
    def withRecipientNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientNotesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientNotes")(null)
        ret
    }
    @scala.inline
    def withRecipientSkipSMSNotifications(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSkipSMSNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientSkipSMSNotificationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSkipSMSNotifications")(null)
        ret
    }
    @scala.inline
    def withUseMerchantForProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMerchantForProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseMerchantForProxyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMerchantForProxy")(null)
        ret
    }
  }
  
}

