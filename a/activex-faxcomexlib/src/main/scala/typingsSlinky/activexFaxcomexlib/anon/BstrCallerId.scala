package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrCallerId extends js.Object {
  val bstrCallerId: String = js.native
  val lCallId: Double = js.native
  val lDeviceId: Double = js.native
  val pFaxServer: FaxServer = js.native
}

object BstrCallerId {
  @scala.inline
  def apply(bstrCallerId: String, lCallId: Double, lDeviceId: Double, pFaxServer: FaxServer): BstrCallerId = {
    val __obj = js.Dynamic.literal(bstrCallerId = bstrCallerId.asInstanceOf[js.Any], lCallId = lCallId.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrCallerId]
  }
  @scala.inline
  implicit class BstrCallerIdOps[Self <: BstrCallerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrCallerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrCallerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLCallId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lCallId")(value.asInstanceOf[js.Any])
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

