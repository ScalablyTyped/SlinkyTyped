package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.BeforePaste event.
  */
@js.native
trait ASPxClientHtmlEditorBeforePasteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    */
  var html: String = js.native
}

object ASPxClientHtmlEditorBeforePasteEventArgs {
  @scala.inline
  def apply(commandName: String, html: String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorBeforePasteEventArgsOps[Self <: ASPxClientHtmlEditorBeforePasteEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

