package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ASPxClientHtmlEditorTableColumnPropertiesDialogMutableBuilder[Self <: ASPxClientHtmlEditorTableColumnPropertiesDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWidthTypeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetWidthTypeComboBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidthValueSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetWidthValueSpinEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidthValueTypeComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetWidthValueTypeComboBox", js.Any.fromFunction0(value))
  }
}
