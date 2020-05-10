package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOutboundVoiceContactResponse extends js.Object {
  /**
    * The identifier of this contact within the Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typingsSlinky.awsSdk.connectMod.ContactId] = js.native
}

object StartOutboundVoiceContactResponse {
  @scala.inline
  def apply(): StartOutboundVoiceContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOutboundVoiceContactResponse]
  }
  @scala.inline
  implicit class StartOutboundVoiceContactResponseOps[Self <: StartOutboundVoiceContactResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: ContactId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactId")(js.undefined)
        ret
    }
  }
  
}

