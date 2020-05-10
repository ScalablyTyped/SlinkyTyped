package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaddingTopNumber extends js.Object {
  var paddingTop: Double = js.native
}

object AnonPaddingTopNumber {
  @scala.inline
  def apply(paddingTop: Double): AnonPaddingTopNumber = {
    val __obj = js.Dynamic.literal(paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaddingTopNumber]
  }
  @scala.inline
  implicit class AnonPaddingTopNumberOps[Self <: AnonPaddingTopNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

