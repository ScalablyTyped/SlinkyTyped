package typingsSlinky.reactBootstrapTable2Toolkit.anon

import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  /**
    * array of toggled columns
    */
  var toggles: js.Array[Boolean] = js.native
  def onColumnToggle(dataField: String): Unit = js.native
}

object Columns {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean]
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnDescription[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnColumnToggle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggles(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

