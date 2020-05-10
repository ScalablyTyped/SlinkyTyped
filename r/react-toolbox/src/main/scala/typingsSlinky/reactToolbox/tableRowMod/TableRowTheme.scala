package typingsSlinky.reactToolbox.tableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[String] = js.native
  /**
    * Added to each row in the table except for the header.
    */
  var row: js.UndefOr[String] = js.native
  /**
    * Modifier for rows that are selected.
    */
  var selected: js.UndefOr[String] = js.native
}

object TableRowTheme {
  @scala.inline
  def apply(): TableRowTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowTheme]
  }
  @scala.inline
  implicit class TableRowThemeOps[Self <: TableRowTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCell")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

