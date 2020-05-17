package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Table dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorTableDialog extends ASPxClientHtmlEditorTableDialogBase {
  /**
    * Provides access to the client object of the "Accessibility" check box related to the Html Editor's Table dialogs.
    */
  def GetAccessibilityCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Alignment" combo box in the Html Editor's Table dialogs.
    */
  def GetAlignmentComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Border Color" color editor in the Html Editor's Table dialogs.
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit = js.native
  /**
    * Provides access to the client object of the "Border size" spin editor in the Html Editor's Table dialogs.
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Caption" text box in the Html Editor's Table dialogs.
    */
  def GetCaptionTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Cell padding" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellPaddingSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Cell spacing" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellSpacingSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Headers" combo box in the Html Editor's Table dialogs.
    */
  def GetHeadersComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's Table dialogs.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you specify the table height value.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table height measurement unit.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Summary" text box in the Html Editor's Table dialogs.
    */
  def GetSummaryTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's Table dialogs.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you to specify the table width value.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table width measurement unit.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox = js.native
}

object ASPxClientHtmlEditorTableDialog {
  @scala.inline
  def apply(
    GetAccessibilityCheckBox: () => ASPxClientCheckBox,
    GetAlignmentComboBox: () => ASPxClientComboBox,
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetCancelButton: () => ASPxClientButton,
    GetCaptionTextBox: () => ASPxClientTextBox,
    GetCellPaddingSpinEdit: () => ASPxClientSpinEdit,
    GetCellSpacingSpinEdit: () => ASPxClientSpinEdit,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeadersComboBox: () => ASPxClientComboBox,
    GetHeightTypeComboBox: () => ASPxClientComboBox,
    GetHeightValueSpinEdit: () => ASPxClientSpinEdit,
    GetHeightValueTypeComboBox: () => ASPxClientComboBox,
    GetOkButton: () => ASPxClientButton,
    GetSummaryTextBox: () => ASPxClientTextBox,
    GetWidthTypeComboBox: () => ASPxClientComboBox,
    GetWidthValueSpinEdit: () => ASPxClientSpinEdit,
    GetWidthValueTypeComboBox: () => ASPxClientComboBox
  ): ASPxClientHtmlEditorTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = js.Any.fromFunction0(GetAccessibilityCheckBox), GetAlignmentComboBox = js.Any.fromFunction0(GetAlignmentComboBox), GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCaptionTextBox = js.Any.fromFunction0(GetCaptionTextBox), GetCellPaddingSpinEdit = js.Any.fromFunction0(GetCellPaddingSpinEdit), GetCellSpacingSpinEdit = js.Any.fromFunction0(GetCellSpacingSpinEdit), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeadersComboBox = js.Any.fromFunction0(GetHeadersComboBox), GetHeightTypeComboBox = js.Any.fromFunction0(GetHeightTypeComboBox), GetHeightValueSpinEdit = js.Any.fromFunction0(GetHeightValueSpinEdit), GetHeightValueTypeComboBox = js.Any.fromFunction0(GetHeightValueTypeComboBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetSummaryTextBox = js.Any.fromFunction0(GetSummaryTextBox), GetWidthTypeComboBox = js.Any.fromFunction0(GetWidthTypeComboBox), GetWidthValueSpinEdit = js.Any.fromFunction0(GetWidthValueSpinEdit), GetWidthValueTypeComboBox = js.Any.fromFunction0(GetWidthValueTypeComboBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorTableDialogOps[Self <: ASPxClientHtmlEditorTableDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccessibilityCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAccessibilityCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlignmentComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlignmentComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBorderColorColorEdit(value: () => ASPxClientColorEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBorderColorColorEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBorderWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBorderWidthSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCaptionTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCaptionTextBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCellPaddingSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCellPaddingSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCellSpacingSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCellSpacingSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeadersComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeadersComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeightTypeComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeightTypeComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeightValueSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeightValueSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeightValueTypeComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeightValueTypeComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSummaryTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSummaryTextBox")(js.Any.fromFunction0(value))
        ret
    }
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

