package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaddingLeftNumber extends js.Object {
  var paddingLeft: Double = js.native
}

object AnonPaddingLeftNumber {
  @scala.inline
  def apply(paddingLeft: Double): AnonPaddingLeftNumber = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaddingLeftNumber]
  }
  @scala.inline
  implicit class AnonPaddingLeftNumberOps[Self <: AnonPaddingLeftNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

