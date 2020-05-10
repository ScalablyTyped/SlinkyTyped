package typingsSlinky.atom

import typingsSlinky.atom.mod.Pane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPane extends js.Object {
  var pane: Pane = js.native
}

object AnonPane {
  @scala.inline
  def apply(pane: Pane): AnonPane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPane]
  }
  @scala.inline
  implicit class AnonPaneOps[Self <: AnonPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPane(value: Pane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

