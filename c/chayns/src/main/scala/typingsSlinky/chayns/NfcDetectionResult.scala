package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startNfcDetection()
@js.native
trait NfcDetectionResult extends js.Object {
  var connected: Boolean = js.native
  var rfid: String = js.native
}

object NfcDetectionResult {
  @scala.inline
  def apply(connected: Boolean, rfid: String): NfcDetectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], rfid = rfid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfcDetectionResult]
  }
  @scala.inline
  implicit class NfcDetectionResultOps[Self <: NfcDetectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRfid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

