package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditModeValidationErrorEventUIParam extends js.Object {
  /**
  	 * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
  	 */
  var action: js.UndefOr[String] = js.native
  /**
  	 * Get a boolean indicating whether the cell is allowed to stay in edit mode.
  	 */
  var canStayInEditMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the cell for which the control is in edit mode.
  	 */
  var cell: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Get the [rule](ig.excel.DataValidationRule) which failed validation.
  	 */
  var validationRule: js.UndefOr[String] = js.native
}

object EditModeValidationErrorEventUIParam {
  @scala.inline
  def apply(): EditModeValidationErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeValidationErrorEventUIParam]
  }
  @scala.inline
  implicit class EditModeValidationErrorEventUIParamOps[Self <: EditModeValidationErrorEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCanStayInEditMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStayInEditMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanStayInEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStayInEditMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
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
    def withValidationRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRule")(js.undefined)
        ret
    }
  }
  
}

