package typingsSlinky.popmotionPose

import typingsSlinky.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonElementStyler extends js.Object {
  var elementStyler: Styler = js.native
}

object AnonElementStyler {
  @scala.inline
  def apply(elementStyler: Styler): AnonElementStyler = {
    val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementStyler]
  }
  @scala.inline
  implicit class AnonElementStylerOps[Self <: AnonElementStyler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementStyler(value: Styler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

