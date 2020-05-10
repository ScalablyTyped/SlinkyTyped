package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.D
import typingsSlinky.devextreme.devextremeStrings.GT
import typingsSlinky.devextreme.devextremeStrings.T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridPivotGridCell extends js.Object {
  /** The cell's column path. Available for data area cells only. */
  var columnPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.native
  /** The type of the column to which the cell belongs. Available for data area cells only. */
  var columnType: js.UndefOr[D | T | GT] = js.native
  /** The data field's index. Available for data area cells only. */
  var dataIndex: js.UndefOr[Double] = js.native
  /** Indicates whether the cell is expanded. Available for row or column area cells only. */
  var expanded: js.UndefOr[Boolean] = js.native
  /** The path to the row/column cell. Available for row or column area cells only. */
  var path: js.UndefOr[js.Array[String | Double | js.Date]] = js.native
  /** The cell's row path. Available for data area cells only. */
  var rowPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.native
  /** The type of the row to which the cell belongs. Available for data area cells only. */
  var rowType: js.UndefOr[D | T | GT] = js.native
  /** The text displayed in the cell. */
  var text: js.UndefOr[String] = js.native
  /** The cell's type. Available for row or column area cells only. */
  var `type`: js.UndefOr[D | T | GT] = js.native
  /** The cell's value. */
  var value: js.UndefOr[js.Any] = js.native
}

object dxPivotGridPivotGridCell {
  @scala.inline
  def apply(): dxPivotGridPivotGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridPivotGridCell]
  }
  @scala.inline
  implicit class dxPivotGridPivotGridCellOps[Self <: dxPivotGridPivotGridCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnPath(value: js.Array[String | Double | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPath")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnType(value: D | T | GT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String | Double | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRowPath(value: js.Array[String | Double | js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRowType(value: D | T | GT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: D | T | GT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

