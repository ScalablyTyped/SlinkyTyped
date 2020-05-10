package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonB64 extends js.Object {
  var b64: String = js.native
}

object AnonB64 {
  @scala.inline
  def apply(b64: String): AnonB64 = {
    val __obj = js.Dynamic.literal(b64 = b64.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonB64]
  }
  @scala.inline
  implicit class AnonB64Ops[Self <: AnonB64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

