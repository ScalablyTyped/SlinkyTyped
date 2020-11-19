package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the page orientation.
  */
@js.native
trait ChangePageOrientationCommand extends CommandBase {
  
  /**
    * Executes the ChangePageOrientationCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param orientation The page orientation.
    */
  def execute(orientation: Orientation): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Orientation] = js.native
}
object ChangePageOrientationCommand {
  
  @scala.inline
  def apply(execute: Orientation => Boolean, getState: () => CommandState[Orientation]): ChangePageOrientationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangePageOrientationCommand]
  }
  
  @scala.inline
  implicit class ChangePageOrientationCommandOps[Self <: ChangePageOrientationCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: Orientation => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Orientation]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
