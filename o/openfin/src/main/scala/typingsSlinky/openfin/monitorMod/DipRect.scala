package typingsSlinky.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DipRect extends Rect {
  var dipRect: Rect = js.native
  var scaledRect: Rect = js.native
}

object DipRect {
  @scala.inline
  def apply(bottom: Double, dipRect: Rect, left: Double, right: Double, scaledRect: Rect, top: Double): DipRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dipRect = dipRect.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[DipRect]
  }
  @scala.inline
  implicit class DipRectOps[Self <: DipRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDipRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaledRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

