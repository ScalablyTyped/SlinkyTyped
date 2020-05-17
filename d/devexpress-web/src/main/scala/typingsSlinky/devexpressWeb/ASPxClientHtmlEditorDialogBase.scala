package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorDialogBase extends js.Object {
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  def GetCancelButton(): ASPxClientButton = js.native
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  def GetFormLayout(): ASPxClientFormLayout = js.native
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  def GetOkButton(): ASPxClientButton = js.native
}

object ASPxClientHtmlEditorDialogBase {
  @scala.inline
  def apply(
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton
  ): ASPxClientHtmlEditorDialogBase = {
    val __obj = js.Dynamic.literal(GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton))
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogBase]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogBaseOps[Self <: ASPxClientHtmlEditorDialogBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCancelButton(value: () => ASPxClientButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCancelButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormLayout(value: () => ASPxClientFormLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFormLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOkButton(value: () => ASPxClientButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOkButton")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

