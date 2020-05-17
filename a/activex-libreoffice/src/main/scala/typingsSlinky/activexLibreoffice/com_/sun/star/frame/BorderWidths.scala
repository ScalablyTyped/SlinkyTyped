package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a border area by offsets from each side. */
@js.native
trait BorderWidths extends js.Object {
  /** specifies the offset from bottom border. */
  var Bottom: Double = js.native
  /** specifies the offset from left border. */
  var Left: Double = js.native
  /** specifies the offset from right border. */
  var Right: Double = js.native
  /** specifies the offset from top border. */
  var Top: Double = js.native
}

object BorderWidths {
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): BorderWidths = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidths]
  }
  @scala.inline
  implicit class BorderWidthsOps[Self <: BorderWidths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

