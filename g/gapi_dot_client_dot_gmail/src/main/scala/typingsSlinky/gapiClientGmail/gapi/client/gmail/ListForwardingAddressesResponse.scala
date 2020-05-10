package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForwardingAddressesResponse extends js.Object {
  /** List of addresses that may be used for forwarding. */
  var forwardingAddresses: js.UndefOr[js.Array[ForwardingAddress]] = js.native
}

object ListForwardingAddressesResponse {
  @scala.inline
  def apply(): ListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForwardingAddressesResponse]
  }
  @scala.inline
  implicit class ListForwardingAddressesResponseOps[Self <: ListForwardingAddressesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardingAddresses(value: js.Array[ForwardingAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardingAddresses")(js.undefined)
        ret
    }
  }
  
}

