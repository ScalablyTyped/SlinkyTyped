package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
@js.native
trait MalformedNumberFormatException extends Exception {
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: Double = js.native
}

object MalformedNumberFormatException {
  @scala.inline
  def apply(CheckPos: Double, Context: XInterface, Message: String): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
  @scala.inline
  implicit class MalformedNumberFormatExceptionOps[Self <: MalformedNumberFormatException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

