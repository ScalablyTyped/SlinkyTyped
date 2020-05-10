package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionMap extends js.Object {
  var draggables: DraggableDimensionMap = js.native
  var droppables: DroppableDimensionMap = js.native
}

object DimensionMap {
  @scala.inline
  def apply(draggables: DraggableDimensionMap, droppables: DroppableDimensionMap): DimensionMap = {
    val __obj = js.Dynamic.literal(draggables = draggables.asInstanceOf[js.Any], droppables = droppables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionMap]
  }
  @scala.inline
  implicit class DimensionMapOps[Self <: DimensionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggables(value: DraggableDimensionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroppables(value: DroppableDimensionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

