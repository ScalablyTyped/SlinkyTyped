package typingsSlinky.reactEmailEditor.anon

import typingsSlinky.reactEmailEditor.mod.DockPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dock extends js.Object {
  val dock: DockPosition = js.native
}

object Dock {
  @scala.inline
  def apply(dock: DockPosition): Dock = {
    val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dock]
  }
  @scala.inline
  implicit class DockOps[Self <: Dock] (val x: Self) extends AnyVal {
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

