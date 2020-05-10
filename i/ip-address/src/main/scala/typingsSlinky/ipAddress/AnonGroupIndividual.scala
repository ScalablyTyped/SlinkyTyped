package typingsSlinky.ipAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupIndividual extends js.Object {
  var groupIndividual: Boolean = js.native
  var nonce: String = js.native
  var reserved: Boolean = js.native
  var universalLocal: Boolean = js.native
}

object AnonGroupIndividual {
  @scala.inline
  def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): AnonGroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], universalLocal = universalLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupIndividual]
  }
  @scala.inline
  implicit class AnonGroupIndividualOps[Self <: AnonGroupIndividual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupIndividual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndividual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniversalLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalLocal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

