package typingsSlinky.agGrid.clientSideRowModelMod

import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowNodeTransaction extends js.Object {
  var add: js.Array[RowNode] = js.native
  var remove: js.Array[RowNode] = js.native
  var update: js.Array[RowNode] = js.native
}

object RowNodeTransaction {
  @scala.inline
  def apply(add: js.Array[RowNode], remove: js.Array[RowNode], update: js.Array[RowNode]): RowNodeTransaction = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeTransaction]
  }
  @scala.inline
  implicit class RowNodeTransactionOps[Self <: RowNodeTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Array[RowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: js.Array[RowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: js.Array[RowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

