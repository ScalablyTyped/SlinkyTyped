package typingsSlinky.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDropIndex extends js.Object {
  var columns: js.Any = js.native
  var dragIndex: Double = js.native
  var dropIndex: Double = js.native
}

object AnonDropIndex {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double): AnonDropIndex = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropIndex]
  }
  @scala.inline
  implicit class AnonDropIndexOps[Self <: AnonDropIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

