package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferResultInfo extends js.Object {
  /** The data returned by an input transfer. undefined for output transfers. */
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /** A value of 0 indicates that the transfer was a success. Other values indicate failure. */
  var resultCode: js.UndefOr[integer] = js.native
}

object TransferResultInfo {
  @scala.inline
  def apply(): TransferResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferResultInfo]
  }
  @scala.inline
  implicit class TransferResultInfoOps[Self <: TransferResultInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCode(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(js.undefined)
        ret
    }
  }
  
}

