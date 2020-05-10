package typingsSlinky.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPkcs12 extends js.Object {
  var pkcs12: js.Any = js.native
}

object AnonPkcs12 {
  @scala.inline
  def apply(pkcs12: js.Any): AnonPkcs12 = {
    val __obj = js.Dynamic.literal(pkcs12 = pkcs12.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPkcs12]
  }
  @scala.inline
  implicit class AnonPkcs12Ops[Self <: AnonPkcs12] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPkcs12(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkcs12")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

