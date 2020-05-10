package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlexNumber extends js.Object {
  var flex: Double = js.native
}

object AnonFlexNumber {
  @scala.inline
  def apply(flex: Double): AnonFlexNumber = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlexNumber]
  }
  @scala.inline
  implicit class AnonFlexNumberOps[Self <: AnonFlexNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

