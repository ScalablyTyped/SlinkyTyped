package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutline extends js.Object {
  var outline: String = js.native
}

object AnonOutline {
  @scala.inline
  def apply(outline: String): AnonOutline = {
    val __obj = js.Dynamic.literal(outline = outline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutline]
  }
  @scala.inline
  implicit class AnonOutlineOps[Self <: AnonOutline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

