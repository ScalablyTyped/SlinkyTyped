package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingLeft extends js.Object {
  var height: Double = js.native
  var paddingLeft: Double = js.native
  var paddingRight: Double = js.native
}

object PaddingLeft {
  @scala.inline
  def apply(height: Double, paddingLeft: Double, paddingRight: Double): PaddingLeft = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeft]
  }
  @scala.inline
  implicit class PaddingLeftOps[Self <: PaddingLeft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

