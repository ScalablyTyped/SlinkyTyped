package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProperties extends js.Object {
  /**
  	 * Column definitions
  	 */
  var columns: js.Array[TableColumnProperties] = js.native
  /**
  	 * The display name of the table
  	 */
  var displayName: js.UndefOr[String] = js.native
  /**
  	 * Show headers at top of table
  	 * @default true
  	 */
  var headerRow: js.UndefOr[Boolean] = js.native
  /**
  	 * The name of the table
  	 */
  var name: String = js.native
  /**
  	 * Top left cell of the table
  	 */
  var ref: String = js.native
  /**
  	 * Rows of data
  	 */
  var rows: js.Array[js.Array[_]] = js.native
  /**
  	 * Extra style properties
  	 * @default {}
  	 */
  var style: js.UndefOr[TableStyleProperties] = js.native
  /**
  	 * Show totals at bottom of table
  	 * @default false
  	 */
  var totalsRow: js.UndefOr[Boolean] = js.native
}

object TableProperties {
  @scala.inline
  def apply(columns: js.Array[TableColumnProperties], name: String, ref: String, rows: js.Array[js.Array[_]]): TableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProperties]
  }
  @scala.inline
  implicit class TablePropertiesOps[Self <: TableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[TableColumnProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: TableStyleProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsRow")(js.undefined)
        ret
    }
  }
  
}

