package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUtf8 extends js.Object {
  var utf8: String = js.native
}

object AnonUtf8 {
  @scala.inline
  def apply(utf8: String): AnonUtf8 = {
    val __obj = js.Dynamic.literal(utf8 = utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUtf8]
  }
  @scala.inline
  implicit class AnonUtf8Ops[Self <: AnonUtf8] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtf8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

