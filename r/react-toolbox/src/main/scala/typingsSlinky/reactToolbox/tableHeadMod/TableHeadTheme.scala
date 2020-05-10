package typingsSlinky.reactToolbox.tableHeadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeadTheme extends js.Object {
  /**
    * Modifier for cells that include a select checkbox.
    */
  var checkboxCell: js.UndefOr[String] = js.native
}

object TableHeadTheme {
  @scala.inline
  def apply(): TableHeadTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeadTheme]
  }
  @scala.inline
  implicit class TableHeadThemeOps[Self <: TableHeadTheme] (val x: Self) extends AnyVal {
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
  }
  
}

