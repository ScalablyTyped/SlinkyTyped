package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for Table dialogs within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableElementPropertiesDialog extends ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Horizontal" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetHorizontalAlignmentComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Vertical" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetVerticalAlignmentComboBox(): ASPxClientComboBox = js.native
}

object ASPxClientHtmlEditorTableElementPropertiesDialog {
  @scala.inline
  def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHorizontalAlignmentComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetVerticalAlignmentComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableElementPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHorizontalAlignmentComboBox = js.Any.fromFunction0(GetHorizontalAlignmentComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetVerticalAlignmentComboBox = js.Any.fromFunction0(GetVerticalAlignmentComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableElementPropertiesDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableElementPropertiesDialogOps[Self <: ASPxClientHtmlEditorTableElementPropertiesDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHorizontalAlignmentComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHorizontalAlignmentComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVerticalAlignmentComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVerticalAlignmentComboBox")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

