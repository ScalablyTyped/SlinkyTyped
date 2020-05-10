package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferData extends js.Object {
  /**
    * The date the transfer was accepted.
    */
  var acceptDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the transfer was rejected.
    */
  var rejectDate: js.UndefOr[js.Date] = js.native
  /**
    * The reason why the transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.native
  /**
    * The date the transfer took place.
    */
  var transferDate: js.UndefOr[js.Date] = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}

object TransferData {
  @scala.inline
  def apply(): TransferData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferData]
  }
  @scala.inline
  implicit class TransferDataOps[Self <: TransferData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectReason(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferMessage")(js.undefined)
        ret
    }
  }
  
}

