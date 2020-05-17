package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is used to indicate that the requested {@link OpenMode} is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such an open mode.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
@js.native
trait UnsupportedOpenModeException extends Exception {
  /** contains the {@link OpenMode} that is not supported. */
  var Mode: Double = js.native
}

object UnsupportedOpenModeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Mode: Double): UnsupportedOpenModeException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOpenModeException]
  }
  @scala.inline
  implicit class UnsupportedOpenModeExceptionOps[Self <: UnsupportedOpenModeException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

