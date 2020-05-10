package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSendAsResponse extends js.Object {
  /** List of send-as aliases. */
  var sendAs: js.UndefOr[js.Array[SendAs]] = js.native
}

object ListSendAsResponse {
  @scala.inline
  def apply(): ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSendAsResponse]
  }
  @scala.inline
  implicit class ListSendAsResponseOps[Self <: ListSendAsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendAs(value: js.Array[SendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAs")(js.undefined)
        ret
    }
  }
  
}

