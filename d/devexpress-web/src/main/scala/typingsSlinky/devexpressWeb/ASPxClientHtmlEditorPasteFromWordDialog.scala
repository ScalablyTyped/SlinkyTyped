package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Paste From Word dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorPasteFromWordDialog extends ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Remove font family" check box in the Html Editor's Flash dialog.
    */
  def GetRemoveFontFamilyCheckBox(): ASPxClientCheckBox = js.native
}
object ASPxClientHtmlEditorPasteFromWordDialog {
  
  @scala.inline
  def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton,
    GetRemoveFontFamilyCheckBox: () => ASPxClientCheckBox
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRemoveFontFamilyCheckBox = js.Any.fromFunction0(GetRemoveFontFamilyCheckBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorPasteFromWordDialogMutableBuilder[Self <: ASPxClientHtmlEditorPasteFromWordDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRemoveFontFamilyCheckBox(value: () => ASPxClientCheckBox): Self = StObject.set(x, "GetRemoveFontFamilyCheckBox", js.Any.fromFunction0(value))
  }
}
