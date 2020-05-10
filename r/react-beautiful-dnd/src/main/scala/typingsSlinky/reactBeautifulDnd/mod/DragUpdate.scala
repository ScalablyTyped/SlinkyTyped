package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragUpdate extends DragStart {
  // populated when a draggable is dragging over another in combine mode
  var combine: js.UndefOr[Combine] = js.native
  // may not have any destination (drag to nowhere)
  var destination: js.UndefOr[DraggableLocation] = js.native
}

object DragUpdate {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragUpdate = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragUpdate]
  }
  @scala.inline
  implicit class DragUpdateOps[Self <: DragUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombine(value: Combine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: DraggableLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
  }
  
}

