package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the state of a command.
  */
@js.native
trait CommandState[T] extends SimpleCommandState {
  /**
    * Specifies a command value.
    */
  var value: T = js.native
}

object CommandState {
  @scala.inline
  def apply[T](enabled: Boolean, value: T, visible: Boolean): CommandState[T] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandState[T]]
  }
  @scala.inline
  implicit class CommandStateOps[Self[t] <: CommandState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

