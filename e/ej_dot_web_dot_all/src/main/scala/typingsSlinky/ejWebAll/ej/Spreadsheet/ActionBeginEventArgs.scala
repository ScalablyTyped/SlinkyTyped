package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeginEventArgs extends js.Object {
  /** Returns the applied style format object.
    */
  var afterFormat: js.UndefOr[js.Any] = js.native
  /** Returns the applied style format object.
    */
  var beforeFormat: js.UndefOr[js.Any] = js.native
  /** Returns selected columns while sorting or filtering begins.
    */
  var colSelected: js.UndefOr[Double] = js.native
  /** Return column name while sorting.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns goto index while paging.
    */
  var gotoIdx: js.UndefOr[Double] = js.native
  /** Returns boolean value. If create new sheet it returns true.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  /** Returns the cell range.
    */
  var range: js.UndefOr[js.Array[_]] = js.native
  /** Returns the action format.
    */
  var reqType: js.UndefOr[String] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  /** Returns sort direction while sort action begins.
    */
  var sortDirection: js.UndefOr[String] = js.native
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
  @scala.inline
  implicit class ActionBeginEventArgsOps[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withColSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
    @scala.inline
    def withGotoIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGotoIdx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoIdx")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withReqType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReqType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqType")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetIdx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetIdx")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
  }
  
}

