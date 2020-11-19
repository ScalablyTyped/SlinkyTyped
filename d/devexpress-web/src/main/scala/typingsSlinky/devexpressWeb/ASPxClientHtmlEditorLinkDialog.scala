package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Link dialog within the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorLinkDialog extends ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "E-mail to" text box in the Html Editor's Link dialog.
    */
  def GetEmailTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the file manager used in the Link dialog's "Select Document" popup window.
    */
  def GetFileManager(): ASPxClientFileManager = js.native
  
  /**
    * Provides access to the client radio button list object used to specify the link type in the Html Editor's Link dialog.
    */
  def GetLinkTypeRadioButtonList(): ASPxClientRadioButtonList = js.native
  
  /**
    * Provides access to the client object of the "Open in new window" check box in the Html Editor's Link dialog.
    */
  def GetOpenInNewWindowCheckBox(): ASPxClientCheckBox = js.native
  
  /**
    * Provides access to the client object of the "Cancel" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupCancelButton(): ASPxClientButton = js.native
  
  /**
    * Provides access to the client popup control object that is the "Select Document" popup window in the Html Editor's Link dialog.
    */
  def GetSelectDocumentPopupControl(): ASPxClientPopupControl = js.native
  
  /**
    * Provides access to the client object of the "Select" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupSelectButton(): ASPxClientButton = js.native
  
  /**
    * Provides access to the client object of the "Subject" text box in the Html Editor's Link dialog.
    */
  def GetSubjectTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "Text" text box in the Html Editor's Link dialog.
    */
  def GetTextTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "ToolTip" text box in the Html Editor's Link dialog.
    */
  def GetTooltipTextBox(): ASPxClientTextBox = js.native
  
  /**
    * Provides access to the client object of the "URL" text box in the Html Editor's Link dialog.
    */
  def GetUrlTextBox(): ASPxClientTextBox = js.native
}
object ASPxClientHtmlEditorLinkDialog {
  
  @scala.inline
  def apply(
    GetCancelButton: () => ASPxClientButton,
    GetEmailTextBox: () => ASPxClientTextBox,
    GetFileManager: () => ASPxClientFileManager,
    GetFormLayout: () => ASPxClientFormLayout,
    GetLinkTypeRadioButtonList: () => ASPxClientRadioButtonList,
    GetOkButton: () => ASPxClientButton,
    GetOpenInNewWindowCheckBox: () => ASPxClientCheckBox,
    GetSelectDocumentPopupCancelButton: () => ASPxClientButton,
    GetSelectDocumentPopupControl: () => ASPxClientPopupControl,
    GetSelectDocumentPopupSelectButton: () => ASPxClientButton,
    GetSubjectTextBox: () => ASPxClientTextBox,
    GetTextTextBox: () => ASPxClientTextBox,
    GetTooltipTextBox: () => ASPxClientTextBox,
    GetUrlTextBox: () => ASPxClientTextBox
  ): ASPxClientHtmlEditorLinkDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetEmailTextBox = js.Any.fromFunction0(GetEmailTextBox), GetFileManager = js.Any.fromFunction0(GetFileManager), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetLinkTypeRadioButtonList = js.Any.fromFunction0(GetLinkTypeRadioButtonList), GetOkButton = js.Any.fromFunction0(GetOkButton), GetOpenInNewWindowCheckBox = js.Any.fromFunction0(GetOpenInNewWindowCheckBox), GetSelectDocumentPopupCancelButton = js.Any.fromFunction0(GetSelectDocumentPopupCancelButton), GetSelectDocumentPopupControl = js.Any.fromFunction0(GetSelectDocumentPopupControl), GetSelectDocumentPopupSelectButton = js.Any.fromFunction0(GetSelectDocumentPopupSelectButton), GetSubjectTextBox = js.Any.fromFunction0(GetSubjectTextBox), GetTextTextBox = js.Any.fromFunction0(GetTextTextBox), GetTooltipTextBox = js.Any.fromFunction0(GetTooltipTextBox), GetUrlTextBox = js.Any.fromFunction0(GetUrlTextBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorLinkDialog]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorLinkDialogOps[Self <: ASPxClientHtmlEditorLinkDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEmailTextBox(value: () => ASPxClientTextBox): Self = this.set("GetEmailTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileManager(value: () => ASPxClientFileManager): Self = this.set("GetFileManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkTypeRadioButtonList(value: () => ASPxClientRadioButtonList): Self = this.set("GetLinkTypeRadioButtonList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenInNewWindowCheckBox(value: () => ASPxClientCheckBox): Self = this.set("GetOpenInNewWindowCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectDocumentPopupCancelButton(value: () => ASPxClientButton): Self = this.set("GetSelectDocumentPopupCancelButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectDocumentPopupControl(value: () => ASPxClientPopupControl): Self = this.set("GetSelectDocumentPopupControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectDocumentPopupSelectButton(value: () => ASPxClientButton): Self = this.set("GetSelectDocumentPopupSelectButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubjectTextBox(value: () => ASPxClientTextBox): Self = this.set("GetSubjectTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextTextBox(value: () => ASPxClientTextBox): Self = this.set("GetTextTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltipTextBox(value: () => ASPxClientTextBox): Self = this.set("GetTooltipTextBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrlTextBox(value: () => ASPxClientTextBox): Self = this.set("GetUrlTextBox", js.Any.fromFunction0(value))
  }
}
