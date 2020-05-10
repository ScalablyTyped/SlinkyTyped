package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTableChangedEventUIParam extends js.Object {
  /**
  	 * Gets the current active [Table](ig.excel.WorksheetTable).
  	 */
  var newActiveTable: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the previous active [Table](ig.excel.WorksheetTable).
  	 */
  var oldActiveTable: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ActiveTableChangedEventUIParam {
  @scala.inline
  def apply(): ActiveTableChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTableChangedEventUIParam]
  }
  @scala.inline
  implicit class ActiveTableChangedEventUIParamOps[Self <: ActiveTableChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewActiveTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewActiveTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActiveTable")(js.undefined)
        ret
    }
    @scala.inline
    def withOldActiveTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldActiveTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActiveTable")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

