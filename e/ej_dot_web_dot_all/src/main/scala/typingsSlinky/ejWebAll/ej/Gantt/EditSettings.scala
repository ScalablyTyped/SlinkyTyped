package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettings extends js.Object {
  /** Enables or disables add record icon in Gantt toolbar
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.native
  /** Enables or disables delete icon in Gantt toolbar
    * @Default {false}
    */
  var allowDeleting: js.UndefOr[Boolean] = js.native
  /** Specifies the option for enabling or disabling editing in Gantt grid part
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Specifies the option for enabling or disabling indent action in Gantt.
    * @Default {false}
    */
  var allowIndent: js.UndefOr[Boolean] = js.native
  /** Specifies the mouse action whether single click or double click to begin the editing
    * @Default {ej.Gantt.BeginEditAction.DblClick}
    */
  var beginEditAction: js.UndefOr[BeginEditAction | String] = js.native
  /** Specifies the edit mode in Gantt, &quot;normal&quot; is for dialog editing ,&quot;cellEditing&quot; is for cell type editing
    * @Default {normal}
    */
  var editMode: js.UndefOr[String] = js.native
  /** Specifies the position where the new row has to be added.
    * @Default {ej.Gantt.RowPosition.BelowSelectedRow}
    */
  var rowPosition: js.UndefOr[RowPosition | String] = js.native
  /** Enable or disable the confirmation dialog while deleting the record.
    * @Default {false}
    */
  var showDeleteConfirmDialog: js.UndefOr[Boolean] = js.native
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
    def withAllowIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEditAction(value: BeginEditAction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEditAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginEditAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEditAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: String): Self = {
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
  }
  
}

