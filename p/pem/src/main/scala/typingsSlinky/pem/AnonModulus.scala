package typingsSlinky.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModulus extends js.Object {
  var modulus: js.Any = js.native
}

object AnonModulus {
  @scala.inline
  def apply(modulus: js.Any): AnonModulus = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModulus]
  }
  @scala.inline
  implicit class AnonModulusOps[Self <: AnonModulus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModulus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

