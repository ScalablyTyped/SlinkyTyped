package typingsSlinky.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modulus extends js.Object {
  var modulus: js.Any = js.native
}

object Modulus {
  @scala.inline
  def apply(modulus: js.Any): Modulus = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modulus]
  }
  @scala.inline
  implicit class ModulusOps[Self <: Modulus] (val x: Self) extends AnyVal {
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

