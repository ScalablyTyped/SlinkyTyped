package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown to indicate that the creation of a UCB content failed.
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait ContentCreationException extends Exception {
  /** An error code. */
  var eError: ContentCreationError = js.native
}

object ContentCreationException {
  @scala.inline
  def apply(Context: XInterface, Message: String, eError: ContentCreationError): ContentCreationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], eError = eError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCreationException]
  }
  @scala.inline
  implicit class ContentCreationExceptionOps[Self <: ContentCreationException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEError(value: ContentCreationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

