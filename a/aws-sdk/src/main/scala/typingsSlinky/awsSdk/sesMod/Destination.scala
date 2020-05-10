package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The recipients to place on the BCC: line of the message.
    */
  var BccAddresses: js.UndefOr[AddressList] = js.native
  /**
    * The recipients to place on the CC: line of the message.
    */
  var CcAddresses: js.UndefOr[AddressList] = js.native
  /**
    * The recipients to place on the To: line of the message.
    */
  var ToAddresses: js.UndefOr[AddressList] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBccAddresses(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBccAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCcAddresses(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withToAddresses(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToAddresses")(js.undefined)
        ret
    }
  }
  
}

