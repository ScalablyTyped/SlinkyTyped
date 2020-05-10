package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditModeExitingEventUIParam extends js.Object {
  /**
  	 * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
  	 */
  var acceptChanges: js.UndefOr[Boolean] = js.native
  /**
  	 * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
  	 */
  var canCancel: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the cell for which the control is exiting edit mode.
  	 */
  var cell: js.UndefOr[String] = js.native
  /**
  	 * Gets the edit text that will be used to update the cell(s).
  	 */
  var editText: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object EditModeExitingEventUIParam {
  @scala.inline
  def apply(): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
  @scala.inline
  implicit class EditModeExitingEventUIParamOps[Self <: EditModeExitingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCanCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancel")(js.undefined)
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
    def withEditText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editText")(js.undefined)
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

