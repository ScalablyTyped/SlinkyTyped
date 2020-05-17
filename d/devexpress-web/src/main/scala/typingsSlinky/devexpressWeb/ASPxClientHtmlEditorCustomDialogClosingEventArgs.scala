package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosing client event.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogClosingEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

object ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  @scala.inline
  def apply(handled: Boolean, name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogClosingEventArgsOps[Self <: ASPxClientHtmlEditorCustomDialogClosingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

