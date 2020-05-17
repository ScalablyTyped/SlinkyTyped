package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters used in the ASPxHtmlEditor's client-side commands.
  */
@js.native
trait ASPxClientHtmlEditorCommandArguments extends js.Object {
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  var selectedElement: js.Any = js.native
}

object ASPxClientHtmlEditorCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Any): ASPxClientHtmlEditorCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandArgumentsOps[Self <: ASPxClientHtmlEditorCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

