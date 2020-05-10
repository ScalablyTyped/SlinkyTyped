package typingsSlinky.reactEmailEditor

import typingsSlinky.reactEmailEditor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDock extends js.Object {
  val dock: DockPosition = js.native
}

object AnonDock {
  @scala.inline
  def apply(dock: DockPosition): AnonDock = {
    val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDock]
  }
  @scala.inline
  implicit class AnonDockOps[Self <: AnonDock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDock(value: DockPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

