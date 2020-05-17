package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaintextLength extends js.Object {
  var plaintextLength: Double = js.native
}

object PlaintextLength {
  @scala.inline
  def apply(plaintextLength: Double): PlaintextLength = {
    val __obj = js.Dynamic.literal(plaintextLength = plaintextLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaintextLength]
  }
  @scala.inline
  implicit class PlaintextLengthOps[Self <: PlaintextLength] (val x: Self) extends AnyVal {
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

