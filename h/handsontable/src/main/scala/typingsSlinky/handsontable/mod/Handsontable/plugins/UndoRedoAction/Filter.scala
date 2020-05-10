package typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typingsSlinky.handsontable.handsontableStrings.filter
import typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var actionType: filter = js.native
  var conditionsStack: js.Array[ColumnConditions] = js.native
}

object Filter {
  @scala.inline
  def apply(actionType: filter, conditionsStack: js.Array[ColumnConditions]): Filter = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], conditionsStack = conditionsStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionsStack(value: js.Array[ColumnConditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionsStack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

