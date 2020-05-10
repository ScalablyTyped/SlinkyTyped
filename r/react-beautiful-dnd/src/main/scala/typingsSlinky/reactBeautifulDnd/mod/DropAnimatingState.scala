package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.DROP_ANIMATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropAnimatingState extends State {
  var completed: CompletedDrag = js.native
  // We still need to render placeholders and fix the dimensions of the dragging item
  var dimensions: DimensionMap = js.native
  var dropDuration: Double = js.native
  var newHomeClientOffset: Position = js.native
  var phase: DROP_ANIMATING = js.native
}

object DropAnimatingState {
  @scala.inline
  def apply(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position,
    phase: DROP_ANIMATING
  ): DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimatingState]
  }
  @scala.inline
  implicit class DropAnimatingStateOps[Self <: DropAnimatingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: CompletedDrag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: DimensionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewHomeClientOffset(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHomeClientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: DROP_ANIMATING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

