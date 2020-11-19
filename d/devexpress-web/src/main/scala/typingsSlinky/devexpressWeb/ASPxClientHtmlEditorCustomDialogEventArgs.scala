package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to custom dialog operations.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  var name: String = js.native
}
object ASPxClientHtmlEditorCustomDialogEventArgs {
  
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorCustomDialogEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogEventArgsOps[Self <: ASPxClientHtmlEditorCustomDialogEventArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
