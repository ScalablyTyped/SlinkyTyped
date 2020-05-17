package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Column Properties dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableColumnPropertiesDialog extends ASPxClientHtmlEditorTableElementPropertiesDialog {
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the spin editor that allows you to set the column width value in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the combo box that allows you to specify the column width measurement unit in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox = js.native
}

object ASPxClientHtmlEditorTableColumnPropertiesDialog {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHorizontalAlignmentComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetVerticalAlignmentComboBox: () => ASPxClientComboBox,
    GetWidthTypeComboBox: () => ASPxClientComboBox,
    GetWidthValueSpinEdit: () => ASPxClientSpinEdit,
    GetWidthValueTypeComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableColumnPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHorizontalAlignmentComboBox = js.Any.fromFunction0(GetHorizontalAlignmentComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetVerticalAlignmentComboBox = js.Any.fromFunction0(GetVerticalAlignmentComboBox), GetWidthTypeComboBox = js.Any.fromFunction0(GetWidthTypeComboBox), GetWidthValueSpinEdit = js.Any.fromFunction0(GetWidthValueSpinEdit), GetWidthValueTypeComboBox = js.Any.fromFunction0(GetWidthValueTypeComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableColumnPropertiesDialogOps[Self <: ASPxClientHtmlEditorTableColumnPropertiesDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetWidthTypeComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWidthTypeComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidthValueSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWidthValueSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidthValueTypeComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWidthValueTypeComboBox")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

