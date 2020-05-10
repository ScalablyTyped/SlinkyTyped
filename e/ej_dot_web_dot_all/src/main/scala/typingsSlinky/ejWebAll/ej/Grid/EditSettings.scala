package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable insert action in the editing mode.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the delete action in the editing mode.
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the editing action while double click on the record
    * @Default {true}
    */
  var allowEditOnDblClick: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the edit action in the editing mode.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Dialog Box
    * @Default {null}
    */
  var dialogEditorTemplateID: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the mode of editing See editMode
    * @Default {ej.Grid.EditMode.Normal}
    */
  var editMode: js.UndefOr[EditMode | String] = js.native
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the External edit form
    * @Default {null}
    */
  var externalFormTemplateID: js.UndefOr[String] = js.native
  /** This specifies to set the position of an External edit form either in the top-right or bottom-left of the grid. See formPosition
    * @Default {ej.Grid.FormPosition.BottomLeft}
    */
  var formPosition: js.UndefOr[FormPosition | String] = js.native
  /** This specifies the id of the template. This template can be used to display the data that you require to be edited using the Inline edit form
    * @Default {null}
    */
  var inlineFormTemplateID: js.UndefOr[String] = js.native
  /** This specifies to set the position of an adding new row either in the top or bottom of the grid. See rowPosition
    * @Default {ej.Grid.RowPosition.Top}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.native
  /** Gets or sets a value that indicates whether to display the add new form by default in the grid.
    * @Default {false}
    */
  var showAddNewRow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while saving or discarding the batch changes
    * @Default {true}
    */
  var showConfirmDialog: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the confirm dialog has to be shown while deleting record
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the title for edit form is different from the primarykey column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.native
}

object EditSettings {
  @scala.inline
  def apply(): EditSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSettings]
  }
  @scala.inline
  implicit class EditSettingsOps[Self <: EditSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditOnDblClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditOnDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditOnDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogEditorTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogEditorTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogEditorTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogEditorTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: EditMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalFormTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalFormTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalFormTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalFormTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withFormPosition(value: FormPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFormTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFormTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineFormTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFormTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withRowPosition(value: RowPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAddNewRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddNewRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAddNewRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddNewRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConfirmDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConfirmDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDeleteConfirmDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleteConfirmDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDeleteConfirmDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeleteConfirmDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColumn")(js.undefined)
        ret
    }
  }
  
}

