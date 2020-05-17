package typingsSlinky.akamaiEdgeworkers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToUTCString extends js.Object {
  def toUTCString(): String = js.native
}

object ToUTCString {
  @scala.inline
  def apply(toUTCString: () => String): ToUTCString = {
    val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
    __obj.asInstanceOf[ToUTCString]
  }
  @scala.inline
  implicit class ToUTCStringOps[Self <: ToUTCString] (val x: Self) extends AnyVal {
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

