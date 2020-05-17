package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PFaxServer extends js.Object {
  val pFaxServer: FaxServer = js.native
}

object PFaxServer {
  @scala.inline
  def apply(pFaxServer: FaxServer): PFaxServer = {
    val __obj = js.Dynamic.literal(pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFaxServer]
  }
  @scala.inline
  implicit class PFaxServerOps[Self <: PFaxServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPFaxServer(value: FaxServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pFaxServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

