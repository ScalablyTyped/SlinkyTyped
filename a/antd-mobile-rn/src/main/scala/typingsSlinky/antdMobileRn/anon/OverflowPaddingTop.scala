package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowPaddingTop extends js.Object {
  var borderRadius: Double = js.native
  var overflow: String = js.native
  var paddingTop: Double = js.native
  var width: Double = js.native
}

object OverflowPaddingTop {
  @scala.inline
  def apply(borderRadius: Double, overflow: String, paddingTop: Double, width: Double): OverflowPaddingTop = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowPaddingTop]
  }
  @scala.inline
  implicit class OverflowPaddingTopOps[Self <: OverflowPaddingTop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

