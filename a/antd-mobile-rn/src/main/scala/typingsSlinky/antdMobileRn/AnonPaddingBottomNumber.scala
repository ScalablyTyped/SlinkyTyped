package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaddingBottomNumber extends js.Object {
  var paddingBottom: Double = js.native
  var paddingHorizontal: Double = js.native
}

object AnonPaddingBottomNumber {
  @scala.inline
  def apply(paddingBottom: Double, paddingHorizontal: Double): AnonPaddingBottomNumber = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaddingBottomNumber]
  }
  @scala.inline
  implicit class AnonPaddingBottomNumberOps[Self <: AnonPaddingBottomNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

