package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typingsSlinky.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  var args: js.Array[_] = js.native
  var name: ConditionName = js.native
  def func(dataRow: CellValue, values: js.Array[_]): Boolean = js.native
}

object Condition {
  @scala.inline
  def apply(args: js.Array[_], func: (CellValue, js.Array[_]) => Boolean, name: ConditionName): Condition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: (CellValue, js.Array[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: ConditionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

