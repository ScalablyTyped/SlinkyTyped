package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarginLeftNumber extends js.Object {
  var marginLeft: Double = js.native
}

object AnonMarginLeftNumber {
  @scala.inline
  def apply(marginLeft: Double): AnonMarginLeftNumber = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarginLeftNumber]
  }
  @scala.inline
  implicit class AnonMarginLeftNumberOps[Self <: AnonMarginLeftNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

