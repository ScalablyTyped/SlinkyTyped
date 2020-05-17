package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception is thrown to indicate that a type conversion can not be performed. */
@js.native
trait CannotConvertException extends Exception {
  /** If the conversion of a method argument fails, this is the index of the value in the "IN" argument list. [optional] */
  var ArgumentIndex: Double = js.native
  /** This member contains the class of the type to which the value should be converted. */
  var DestinationTypeClass: TypeClass = js.native
  /** This member contains the reason that the conversion failed. Have a look at {@link FailReason} . */
  var Reason: Double = js.native
}

object CannotConvertException {
  @scala.inline
  def apply(
    ArgumentIndex: Double,
    Context: XInterface,
    DestinationTypeClass: TypeClass,
    Message: String,
    Reason: Double
  ): CannotConvertException = {
    val __obj = js.Dynamic.literal(ArgumentIndex = ArgumentIndex.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], DestinationTypeClass = DestinationTypeClass.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CannotConvertException]
  }
  @scala.inline
  implicit class CannotConvertExceptionOps[Self <: CannotConvertException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArgumentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationTypeClass(value: TypeClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationTypeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

