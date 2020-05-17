package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
@js.native
trait ASPxClientHtmlEditorDialogCloseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the dialog object related to the event.
    */
  var dialog: ASPxClientHtmlEditorDialogBase = js.native
  /**
    * Gets the dialog name related to the event.
    */
  var dialogName: String = js.native
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: js.Any = js.native
}

object ASPxClientHtmlEditorDialogCloseEventArgs {
  @scala.inline
  def apply(dialog: ASPxClientHtmlEditorDialogBase, dialogName: String, parameter: js.Any): ASPxClientHtmlEditorDialogCloseEventArgs = {
    val __obj = js.Dynamic.literal(dialog = dialog.asInstanceOf[js.Any], dialogName = dialogName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogCloseEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorDialogCloseEventArgsOps[Self <: ASPxClientHtmlEditorDialogCloseEventArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withParameter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

