package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for Html Editor dialogs operated with its elements.
  */
@js.native
trait ASPxClientHtmlEditorEditElementDialog extends ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Border color" color editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit = js.native
  
  /**
    * Provides access to the client object of the "Border style" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderStyleComboBox(): ASPxClientComboBox = js.native
  
  /**
    * Provides access to the client object of the "Border width" spin editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit = js.native
  
  /**
    * Provides access to the client object of the "Bottom margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetBottomMarginTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "CSS class" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetCssClassNameComboBox(): ASPxClientComboBox = js.native
  
  /**
    * Provides access to the client object of the "Left margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetLeftMarginTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "Right margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetRightMarginTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "Top margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetTopMarginTextBox(): ASPxClientTextBox = js.native
}
object ASPxClientHtmlEditorEditElementDialog {
  
  @scala.inline
  def apply(
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetOkButton: () => ASPxClientButton,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox
  ): ASPxClientHtmlEditorEditElementDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorEditElementDialogMutableBuilder[Self <: ASPxClientHtmlEditorEditElementDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBorderColorColorEdit(value: () => ASPxClientColorEdit): Self = StObject.set(x, "GetBorderColorColorEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBorderStyleComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetBorderStyleComboBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBorderWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = StObject.set(x, "GetBorderWidthSpinEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBottomMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetBottomMarginTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCssClassNameComboBox(value: () => ASPxClientComboBox): Self = StObject.set(x, "GetCssClassNameComboBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLeftMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetLeftMarginTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRightMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetRightMarginTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTopMarginTextBox(value: () => ASPxClientTextBox): Self = StObject.set(x, "GetTopMarginTextBox", js.Any.fromFunction0(value))
  }
}
