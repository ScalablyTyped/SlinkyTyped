package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input/output error with arguments. */
@js.native
trait InteractiveAugmentedIOException extends InteractiveIOException {
  /**
    * Additional arguments.
    *
    * See {@link com.sun.star.task.InteractionHandler} for a description of well-known arguments.
    */
  var Arguments: SafeArray[_] = js.native
}

object InteractiveAugmentedIOException {
  @scala.inline
  def apply(
    Arguments: SafeArray[_],
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    Message: String
  ): InteractiveAugmentedIOException = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveAugmentedIOException]
  }
  @scala.inline
  implicit class InteractiveAugmentedIOExceptionOps[Self <: InteractiveAugmentedIOException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

