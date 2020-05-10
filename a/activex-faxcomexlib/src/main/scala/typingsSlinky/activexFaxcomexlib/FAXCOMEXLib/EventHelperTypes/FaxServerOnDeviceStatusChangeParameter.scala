package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaxServerOnDeviceStatusChangeParameter extends js.Object {
  val bPoweredOff: Boolean = js.native
  val bReceiving: Boolean = js.native
  val bRinging: Boolean = js.native
  val bSending: Boolean = js.native
  val lDeviceId: Double = js.native
  val pFaxServer: FaxServer = js.native
}

object FaxServerOnDeviceStatusChangeParameter {
  @scala.inline
  def apply(
    bPoweredOff: Boolean,
    bReceiving: Boolean,
    bRinging: Boolean,
    bSending: Boolean,
    lDeviceId: Double,
    pFaxServer: FaxServer
  ): FaxServerOnDeviceStatusChangeParameter = {
    val __obj = js.Dynamic.literal(bPoweredOff = bPoweredOff.asInstanceOf[js.Any], bReceiving = bReceiving.asInstanceOf[js.Any], bRinging = bRinging.asInstanceOf[js.Any], bSending = bSending.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxServerOnDeviceStatusChangeParameter]
  }
  @scala.inline
  implicit class FaxServerOnDeviceStatusChangeParameterOps[Self <: FaxServerOnDeviceStatusChangeParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBPoweredOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bPoweredOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBReceiving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bReceiving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBRinging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bRinging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLDeviceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPFaxServer(value: FaxServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pFaxServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

