package typingsSlinky.activexLibreoffice.com_.sun.star.uno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the base of all UNO exceptions
  *
  * All exceptions defined in UNO idl should derive from this exception.
  */
@js.native
trait Exception extends js.Object {
  /**
    * should contain a reference to the original, which raised the exception.
    *
    * May be NULL.
    */
  var Context: XInterface = js.native
  /**
    * gives a detailed description of the reason, why the exception was thrown.
    *
    * The description should be as detailed as possible.
    */
  var Message: String = js.native
}

object Exception {
  @scala.inline
  def apply(Context: XInterface, Message: String): Exception = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

