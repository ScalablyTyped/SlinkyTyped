package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponentProperties extends ComponentProperties {
  var ariaColumnCount: js.UndefOr[Double] = js.native
  var ariaRowCount: js.UndefOr[Double] = js.native
  var columns: js.Array[String | TableColumn] = js.native
  var data: js.Array[js.Array[_]] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.native
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.native
  var selectedRows: js.UndefOr[js.Array[Double]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.native
}

object TableComponentProperties {
  @scala.inline
  def apply(columns: js.Array[String | TableColumn], data: js.Array[js.Array[_]]): TableComponentProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties]
  }
  @scala.inline
  implicit class TableComponentPropertiesOps[Self <: TableComponentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String | TableColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFitColumns(value: ColumnSizingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFitColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFitColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFitColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFocusOutWithTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusOutWithTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveFocusOutWithTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusOutWithTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRows(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCells(value: js.Array[TableCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCells")(js.undefined)
        ret
    }
  }
  
}

