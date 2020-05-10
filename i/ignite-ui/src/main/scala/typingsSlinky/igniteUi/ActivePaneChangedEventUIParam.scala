package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivePaneChangedEventUIParam extends js.Object {
  /**
  	 * Gets the active cell of the new active pane or null if there is no active pane.
  	 */
  var activeCell: js.UndefOr[String] = js.native
  /**
  	 * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var newActivePane: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var oldActivePane: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the current visible range of the new active pane or null if there is no active pane.
  	 */
  var visibleRange: js.UndefOr[String] = js.native
}

object ActivePaneChangedEventUIParam {
  @scala.inline
  def apply(): ActivePaneChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivePaneChangedEventUIParam]
  }
  @scala.inline
  implicit class ActivePaneChangedEventUIParamOps[Self <: ActivePaneChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCell")(js.undefined)
        ret
    }
    @scala.inline
    def withNewActivePane(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewActivePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newActivePane")(js.undefined)
        ret
    }
    @scala.inline
    def withOldActivePane(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActivePane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldActivePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldActivePane")(js.undefined)
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
    @scala.inline
    def withVisibleRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.undefined)
        ret
    }
  }
  
}

