package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaddingHorizontalPaddingVertical extends js.Object {
  var paddingHorizontal: Double = js.native
  var paddingVertical: Double = js.native
}

object AnonPaddingHorizontalPaddingVertical {
  @scala.inline
  def apply(paddingHorizontal: Double, paddingVertical: Double): AnonPaddingHorizontalPaddingVertical = {
    val __obj = js.Dynamic.literal(paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaddingHorizontalPaddingVertical]
  }
  @scala.inline
  implicit class AnonPaddingHorizontalPaddingVerticalOps[Self <: AnonPaddingHorizontalPaddingVertical] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

