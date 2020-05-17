package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error related to locking operations.
  *
  * Various meaningful errors are derived from this exception.
  * @since OOo 3.3
  */
@js.native
trait InteractiveLockingException extends ClassifiedInteractionRequest {
  /** The Url of the resource this exception is related to. */
  var Url: String = js.native
}

object InteractiveLockingException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Url: String): InteractiveLockingException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLockingException]
  }
  @scala.inline
  implicit class InteractiveLockingExceptionOps[Self <: InteractiveLockingException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

