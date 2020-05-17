package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PvWindow extends js.Object {
  val PvWindow: ProtectedViewWindow = js.native
}

object PvWindow {
  @scala.inline
  def apply(PvWindow: ProtectedViewWindow): PvWindow = {
    val __obj = js.Dynamic.literal(PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PvWindow]
  }
  @scala.inline
  implicit class PvWindowOps[Self <: PvWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPvWindow(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PvWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

