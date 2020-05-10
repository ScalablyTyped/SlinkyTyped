package typingsSlinky.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPyong extends js.Object {
  var pyong: Boolean = js.native
}

object AnonPyong {
  @scala.inline
  def apply(pyong: Boolean): AnonPyong = {
    val __obj = js.Dynamic.literal(pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPyong]
  }
  @scala.inline
  implicit class AnonPyongOps[Self <: AnonPyong] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPyong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

