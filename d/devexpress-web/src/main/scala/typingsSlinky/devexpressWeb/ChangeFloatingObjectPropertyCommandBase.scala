package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base class for commands that modify floating object settings.
  */
@js.native
trait ChangeFloatingObjectPropertyCommandBase[T] extends js.Object {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  def execute(settings: T): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[T] = js.native
}

object ChangeFloatingObjectPropertyCommandBase {
  @scala.inline
  def apply[T](execute: T => Boolean, getState: () => CommandState[T]): ChangeFloatingObjectPropertyCommandBase[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectPropertyCommandBase[T]]
  }
  @scala.inline
  implicit class ChangeFloatingObjectPropertyCommandBaseOps[Self[t] <: ChangeFloatingObjectPropertyCommandBase[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExecute(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => CommandState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

