package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosed client event.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogClosedEventArgs extends ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  /**
    * Gets an object associated with the closed dialog.
    */
  var data: js.Any = js.native
}

object ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  @scala.inline
  def apply(data: js.Any, name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogClosedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogClosedEventArgsOps[Self <: ASPxClientHtmlEditorCustomDialogClosedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

