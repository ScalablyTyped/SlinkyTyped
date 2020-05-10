package typingsSlinky.akamaiEdgeworkers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToUTCString extends js.Object {
  def toUTCString(): String = js.native
}

object AnonToUTCString {
  @scala.inline
  def apply(toUTCString: () => String): AnonToUTCString = {
    val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
    __obj.asInstanceOf[AnonToUTCString]
  }
  @scala.inline
  implicit class AnonToUTCStringOps[Self <: AnonToUTCString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToUTCString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUTCString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

