package typingsSlinky.agGrid.iRowNodeStageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.changedPathMod.ChangedPath
import typingsSlinky.agGrid.clientSideRowModelMod.RowNodeTransaction
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageExecuteParams extends js.Object {
  var changedPath: js.UndefOr[ChangedPath] = js.native
  var rowNode: RowNode = js.native
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.native
  var rowNodeTransaction: js.UndefOr[RowNodeTransaction] = js.native
}

object StageExecuteParams {
  @scala.inline
  def apply(rowNode: RowNode): StageExecuteParams = {
    val __obj = js.Dynamic.literal(rowNode = rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecuteParams]
  }
  @scala.inline
  implicit class StageExecuteParamsOps[Self <: StageExecuteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedPath(value: ChangedPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNodeOrder(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodeOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNodeTransaction(value: RowNodeTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodeTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeTransaction")(js.undefined)
        ret
    }
  }
  
}

