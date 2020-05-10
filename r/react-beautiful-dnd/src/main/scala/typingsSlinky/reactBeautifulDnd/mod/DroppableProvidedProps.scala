package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableProvidedProps extends js.Object {
  // used for shared global styles
  var `data-rbd-droppable-context-id`: String = js.native
  // Used to lookup. Currently not used for drag and drop lifecycle
  var `data-rbd-droppable-id`: DroppableId = js.native
}

object DroppableProvidedProps {
  @scala.inline
  def apply(`data-rbd-droppable-context-id`: String, `data-rbd-droppable-id`: DroppableId): DroppableProvidedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-droppable-context-id")(`data-rbd-droppable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-droppable-id")(`data-rbd-droppable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProvidedProps]
  }
  @scala.inline
  implicit class DroppableProvidedPropsOps[Self <: DroppableProvidedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withData-rbd-droppable-context-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-droppable-context-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-rbd-droppable-id`(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-droppable-id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

