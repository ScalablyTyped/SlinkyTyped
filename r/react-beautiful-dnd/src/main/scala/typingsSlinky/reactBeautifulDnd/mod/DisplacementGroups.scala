package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplacementGroups extends js.Object {
  var all: js.Array[DraggableId] = js.native
  var invisible: DraggableIdMap = js.native
  var visible: DisplacementMap = js.native
}

object DisplacementGroups {
  @scala.inline
  def apply(all: js.Array[DraggableId], invisible: DraggableIdMap, visible: DisplacementMap): DisplacementGroups = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], invisible = invisible.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementGroups]
  }
  @scala.inline
  implicit class DisplacementGroupsOps[Self <: DisplacementGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: js.Array[DraggableId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvisible(value: DraggableIdMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: DisplacementMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

