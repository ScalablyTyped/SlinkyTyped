package typingsSlinky.ngCommand.ngCommand

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	* Command proxy object.
	*/
@js.native
trait ICommand extends js.Object {
  /**
  		* Determines whether the command can execute or not.
  		*/
  var canExecute: Boolean = js.native
  /**
  		* Determines whether the command is currently executing.
  		*/
  var isExecuting: Boolean = js.native
  /**
  		* Executes the command function.
  		*/
  def execute(): js.Any = js.native
}

object ICommand {
  @scala.inline
  def apply(canExecute: Boolean, execute: () => js.Any, isExecuting: Boolean): ICommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommand]
  }
  @scala.inline
  implicit class ICommandOps[Self <: ICommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanExecute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExecuting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExecuting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

