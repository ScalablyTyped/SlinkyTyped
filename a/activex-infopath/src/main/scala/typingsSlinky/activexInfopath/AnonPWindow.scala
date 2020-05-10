package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.Window
import typingsSlinky.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPWindow extends js.Object {
  val pDocument: _XDocument = js.native
  val pWindow: Window = js.native
}

object AnonPWindow {
  @scala.inline
  def apply(pDocument: _XDocument, pWindow: Window): AnonPWindow = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pWindow = pWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPWindow]
  }
  @scala.inline
  implicit class AnonPWindowOps[Self <: AnonPWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

