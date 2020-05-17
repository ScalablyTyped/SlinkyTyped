package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.DialogInitialized client event.
  */
@js.native
trait ASPxClientHtmlEditorDialogInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the name of the dialog that has been initialized.
    */
  var dialogName: String = js.native
}

object ASPxClientHtmlEditorDialogInitializedEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String): ASPxClientHtmlEditorDialogInitializedEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogInitializedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogInitializedEventArgsOps[Self <: ASPxClientHtmlEditorDialogInitializedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialog(value: ASPxClientHtmlEditorDialogBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

