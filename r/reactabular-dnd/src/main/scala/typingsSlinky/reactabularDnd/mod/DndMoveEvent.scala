package typingsSlinky.reactabularDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndMoveEvent extends js.Object {
  var sourceLabel: String = js.native
  var targetLabel: String = js.native
}

object DndMoveEvent {
  @scala.inline
  def apply(sourceLabel: String, targetLabel: String): DndMoveEvent = {
    val __obj = js.Dynamic.literal(sourceLabel = sourceLabel.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DndMoveEvent]
  }
  @scala.inline
  implicit class DndMoveEventOps[Self <: DndMoveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

