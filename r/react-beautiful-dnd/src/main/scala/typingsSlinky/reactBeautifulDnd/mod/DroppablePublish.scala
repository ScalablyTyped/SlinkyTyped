package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppablePublish extends js.Object {
  var droppableId: DroppableId = js.native
  var scroll: Position = js.native
}

object DroppablePublish {
  @scala.inline
  def apply(droppableId: DroppableId, scroll: Position): DroppablePublish = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppablePublish]
  }
  @scala.inline
  implicit class DroppablePublishOps[Self <: DroppablePublish] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDroppableId(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

