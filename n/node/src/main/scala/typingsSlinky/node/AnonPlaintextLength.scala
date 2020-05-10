package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlaintextLength extends js.Object {
  var plaintextLength: Double = js.native
}

object AnonPlaintextLength {
  @scala.inline
  def apply(plaintextLength: Double): AnonPlaintextLength = {
    val __obj = js.Dynamic.literal(plaintextLength = plaintextLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaintextLength]
  }
  @scala.inline
  implicit class AnonPlaintextLengthOps[Self <: AnonPlaintextLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaintextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintextLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

