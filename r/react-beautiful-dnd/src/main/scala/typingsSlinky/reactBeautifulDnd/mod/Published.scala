package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Published extends js.Object {
  var additions: js.Array[DraggableDimension] = js.native
  var modified: js.Array[DroppablePublish] = js.native
  var removals: js.Array[DraggableId] = js.native
}

object Published {
  @scala.inline
  def apply(
    additions: js.Array[DraggableDimension],
    modified: js.Array[DroppablePublish],
    removals: js.Array[DraggableId]
  ): Published = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Published]
  }
  @scala.inline
  implicit class PublishedOps[Self <: Published] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditions(value: js.Array[DraggableDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: js.Array[DroppablePublish]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovals(value: js.Array[DraggableId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

