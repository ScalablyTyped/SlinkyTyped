package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseEditingTexts extends js.Object {
  /** Specifies text for a hint that appears when a user pauses on the global "Add" button. Applies only if editing.allowAdding is true. */
  var addRow: js.UndefOr[String] = js.native
  /** Specifies text for a hint that appears when a user pauses on the "Discard" button. Applies only if editing.mode is "batch". */
  var cancelAllChanges: js.UndefOr[String] = js.native
  /** Specifies text for a button that cancels changes in a row. Applies only if editing.allowUpdating is true and editing.mode is "row". */
  var cancelRowChanges: js.UndefOr[String] = js.native
  /** Specifies a message that prompts a user to confirm deletion. */
  var confirmDeleteMessage: js.UndefOr[String] = js.native
  /** Specifies a title for the window that asks a user to confirm deletion. */
  var confirmDeleteTitle: js.UndefOr[String] = js.native
  /** Specifies text for buttons that delete rows. Applies only if allowDeleting is true. */
  var deleteRow: js.UndefOr[String] = js.native
  /** Specifies text for buttons that switch rows into the editing state. Applies only if allowUpdating is true. */
  var editRow: js.UndefOr[String] = js.native
  /** Specifies text for a hint that appears when a user pauses on the global "Save" button. Applies only if editing.mode is "batch". */
  var saveAllChanges: js.UndefOr[String] = js.native
  /** Specifies text for a button that saves changes made in a row. Applies only if allowUpdating is true. */
  var saveRowChanges: js.UndefOr[String] = js.native
  /** Specifies text for buttons that recover deleted rows. Applies only if allowDeleting is true and editing.mode is "batch". */
  var undeleteRow: js.UndefOr[String] = js.native
  /** Specifies text for a hint appearing when a user pauses on the button that cancels changes in a cell. Applies only if editing.mode is "cell" and data validation is enabled. */
  var validationCancelChanges: js.UndefOr[String] = js.native
}

object GridBaseEditingTexts {
  @scala.inline
  def apply(): GridBaseEditingTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseEditingTexts]
  }
  @scala.inline
  implicit class GridBaseEditingTextsOps[Self <: GridBaseEditingTexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelAllChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAllChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelAllChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAllChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelRowChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRowChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelRowChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRowChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmDeleteMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmDeleteMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmDeleteMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmDeleteMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmDeleteTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmDeleteTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmDeleteTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmDeleteTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRow")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAllChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAllChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAllChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAllChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveRowChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRowChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveRowChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRowChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withUndeleteRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationCancelChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCancelChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationCancelChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationCancelChanges")(js.undefined)
        ret
    }
  }
  
}

