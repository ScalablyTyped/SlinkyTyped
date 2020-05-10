package typingsSlinky.activexFaxcomexlib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBstrMessageIdPFaxServer extends js.Object {
  val bstrMessageId: String = js.native
  val pFaxServer: FaxServer = js.native
}

object AnonBstrMessageIdPFaxServer {
  @scala.inline
  def apply(bstrMessageId: String, pFaxServer: FaxServer): AnonBstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBstrMessageIdPFaxServer]
  }
  @scala.inline
  implicit class AnonBstrMessageIdPFaxServerOps[Self <: AnonBstrMessageIdPFaxServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrMessageId")(value.asInstanceOf[js.Any])
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

