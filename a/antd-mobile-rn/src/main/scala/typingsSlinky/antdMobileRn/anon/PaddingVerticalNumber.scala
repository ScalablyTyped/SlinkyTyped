package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingVerticalNumber extends js.Object {
  var paddingVertical: Double = js.native
}

object PaddingVerticalNumber {
  @scala.inline
  def apply(paddingVertical: Double): PaddingVerticalNumber = {
    val __obj = js.Dynamic.literal(paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingVerticalNumber]
  }
  @scala.inline
  implicit class PaddingVerticalNumberOps[Self <: PaddingVerticalNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

