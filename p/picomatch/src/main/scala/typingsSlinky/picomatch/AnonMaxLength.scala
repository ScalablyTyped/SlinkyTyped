package typingsSlinky.picomatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxLength extends js.Object {
  var maxLength: Double = js.native
}

object AnonMaxLength {
  @scala.inline
  def apply(maxLength: Double): AnonMaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxLength]
  }
  @scala.inline
  implicit class AnonMaxLengthOps[Self <: AnonMaxLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

