package typingsSlinky.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global object NFC.
  */
@js.native
trait Window extends js.Object {
  var ndef: Ndef = js.native
  var nfc: Nfc = js.native
  var util: Util = js.native
  def fireNfcTagEvent(event: TagEvent, tagAsJson: String): Unit = js.native
}

object Window {
  @scala.inline
  def apply(fireNfcTagEvent: (TagEvent, String) => Unit, ndef: Ndef, nfc: Nfc, util: Util): Window = {
    val __obj = js.Dynamic.literal(fireNfcTagEvent = js.Any.fromFunction2(fireNfcTagEvent), ndef = ndef.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFireNfcTagEvent(value: (TagEvent, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireNfcTagEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNdef(value: Ndef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNfc(value: Nfc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtil(value: Util): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

