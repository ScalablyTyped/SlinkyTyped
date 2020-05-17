package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftWidth extends js.Object {
  var borderLeftWidth: Double = js.native
  var borderRadius: Double = js.native
  var borderRightWidth: Double = js.native
}

object BorderLeftWidth {
  @scala.inline
  def apply(borderLeftWidth: Double, borderRadius: Double, borderRightWidth: Double): BorderLeftWidth = {
    val __obj = js.Dynamic.literal(borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftWidth]
  }
  @scala.inline
  implicit class BorderLeftWidthOps[Self <: BorderLeftWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderLeftWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRightWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

