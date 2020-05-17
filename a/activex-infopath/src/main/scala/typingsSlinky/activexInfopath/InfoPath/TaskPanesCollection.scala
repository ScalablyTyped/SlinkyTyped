package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPanesCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.TaskPanesCollection_typekey")
  var InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection = js.native
  def Item(varIndex: js.Any): TaskPaneObject = js.native
}

object TaskPanesCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection,
    Item: js.Any => TaskPaneObject
  ): TaskPanesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.TaskPanesCollection_typekey")(InfoPathDotTaskPanesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanesCollection]
  }
  @scala.inline
  implicit class TaskPanesCollectionOps[Self <: TaskPanesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotTaskPanesCollection_typekey(value: TaskPanesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.TaskPanesCollection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => TaskPaneObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

