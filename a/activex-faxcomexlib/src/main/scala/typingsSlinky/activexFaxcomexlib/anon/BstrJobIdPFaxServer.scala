package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrJobIdPFaxServer extends js.Object {
  val bstrJobId: String = js.native
  val pFaxServer: FaxServer = js.native
}

object BstrJobIdPFaxServer {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer): BstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobIdPFaxServer]
  }
  @scala.inline
  implicit class BstrJobIdPFaxServerOps[Self <: BstrJobIdPFaxServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrJobId")(value.asInstanceOf[js.Any])
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

