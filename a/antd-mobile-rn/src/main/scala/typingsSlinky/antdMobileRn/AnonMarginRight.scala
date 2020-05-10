package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarginRight extends js.Object {
  var marginRight: Double = js.native
}

object AnonMarginRight {
  @scala.inline
  def apply(marginRight: Double): AnonMarginRight = {
    val __obj = js.Dynamic.literal(marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarginRight]
  }
  @scala.inline
  implicit class AnonMarginRightOps[Self <: AnonMarginRight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

