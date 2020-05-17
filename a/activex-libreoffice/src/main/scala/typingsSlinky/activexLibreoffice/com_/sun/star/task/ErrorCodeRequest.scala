package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 1.1.2
  */
@js.native
trait ErrorCodeRequest extends Exception {
  /** specifies the error code. */
  var ErrCode: Double = js.native
}

object ErrorCodeRequest {
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeRequest]
  }
  @scala.inline
  implicit class ErrorCodeRequestOps[Self <: ErrorCodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

