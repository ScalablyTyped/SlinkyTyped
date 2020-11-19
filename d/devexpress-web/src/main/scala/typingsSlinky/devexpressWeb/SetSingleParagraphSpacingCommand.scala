package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to format a current paragraph with single line spacing.
  */
@js.native
trait SetSingleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the SetSingleParagraphSpacingCommand command.
    */
  def execute(): Boolean = js.native
}
object SetSingleParagraphSpacingCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetSingleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetSingleParagraphSpacingCommand]
  }
  
  @scala.inline
  implicit class SetSingleParagraphSpacingCommandOps[Self <: SetSingleParagraphSpacingCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: () => Boolean): Self = this.set("execute", js.Any.fromFunction0(value))
  }
}
