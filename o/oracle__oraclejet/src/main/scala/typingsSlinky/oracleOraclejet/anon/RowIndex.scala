package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-gantt-taskbar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndex extends js.Object {
  var index: Double = js.native
  var rowIndex: Double = js.native
  var subId: `oj-gantt-taskbar` = js.native
}

object RowIndex {
  @scala.inline
  def apply(index: Double, rowIndex: Double, subId: `oj-gantt-taskbar`): RowIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
  @scala.inline
  implicit class RowIndexOps[Self <: RowIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: `oj-gantt-taskbar`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

