package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutlineWidth extends js.Object {
  var outlineWidth: Double = js.native
}

object AnonOutlineWidth {
  @scala.inline
  def apply(outlineWidth: Double): AnonOutlineWidth = {
    val __obj = js.Dynamic.literal(outlineWidth = outlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutlineWidth]
  }
  @scala.inline
  implicit class AnonOutlineWidthOps[Self <: AnonOutlineWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

