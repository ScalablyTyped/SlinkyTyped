package typingsSlinky.recharts.anon

import typingsSlinky.recharts.mod.AllowEscapeViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XBoolean extends AllowEscapeViewBox {
  var x: Boolean = js.native
}

object XBoolean {
  @scala.inline
  def apply(x: Boolean): XBoolean = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBoolean]
  }
  @scala.inline
  implicit class XBooleanOps[Self <: XBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

