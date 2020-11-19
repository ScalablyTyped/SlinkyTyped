package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.CustomCommandExecuted event.
  */
@js.native
trait ASPxClientRichEditCustomCommandExecutedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any = js.native
}
object ASPxClientRichEditCustomCommandExecutedEventArgs {
  
  @scala.inline
  def apply(commandName: String, parameter: js.Any): ASPxClientRichEditCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCustomCommandExecutedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditCustomCommandExecutedEventArgsOps[Self <: ASPxClientRichEditCustomCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: js.Any): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
}
