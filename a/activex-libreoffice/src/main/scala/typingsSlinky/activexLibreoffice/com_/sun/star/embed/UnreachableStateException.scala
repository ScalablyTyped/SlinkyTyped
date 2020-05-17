package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception can be thrown in case specified state can not be reached. */
@js.native
trait UnreachableStateException extends Exception {
  /** The current state of the object. */
  var CurrentState: Double = js.native
  /** The state that could not be reached. */
  var NextState: Double = js.native
}

object UnreachableStateException {
  @scala.inline
  def apply(Context: XInterface, CurrentState: Double, Message: String, NextState: Double): UnreachableStateException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], CurrentState = CurrentState.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextState = NextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnreachableStateException]
  }
  @scala.inline
  implicit class UnreachableStateExceptionOps[Self <: UnreachableStateException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

