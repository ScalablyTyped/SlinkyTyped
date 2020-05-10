package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarginLeftMarginRight extends js.Object {
  var marginLeft: Double = js.native
  var marginRight: Double = js.native
}

object AnonMarginLeftMarginRight {
  @scala.inline
  def apply(marginLeft: Double, marginRight: Double): AnonMarginLeftMarginRight = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarginLeftMarginRight]
  }
  @scala.inline
  implicit class AnonMarginLeftMarginRightOps[Self <: AnonMarginLeftMarginRight] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

