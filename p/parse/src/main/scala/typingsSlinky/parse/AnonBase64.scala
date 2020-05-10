package typingsSlinky.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBase64 extends js.Object {
  var base64: String = js.native
}

object AnonBase64 {
  @scala.inline
  def apply(base64: String): AnonBase64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase64]
  }
  @scala.inline
  implicit class AnonBase64Ops[Self <: AnonBase64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

