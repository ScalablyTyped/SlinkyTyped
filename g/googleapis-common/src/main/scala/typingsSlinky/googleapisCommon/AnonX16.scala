package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonX16 extends js.Object {
  var x16: String = js.native
  var x32: String = js.native
}

object AnonX16 {
  @scala.inline
  def apply(x16: String, x32: String): AnonX16 = {
    val __obj = js.Dynamic.literal(x16 = x16.asInstanceOf[js.Any], x32 = x32.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX16]
  }
  @scala.inline
  implicit class AnonX16Ops[Self <: AnonX16] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x32")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

