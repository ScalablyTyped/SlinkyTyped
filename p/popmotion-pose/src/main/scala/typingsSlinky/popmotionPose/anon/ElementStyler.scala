package typingsSlinky.popmotionPose.anon

import typingsSlinky.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementStyler extends js.Object {
  var elementStyler: Styler = js.native
}

object ElementStyler {
  @scala.inline
  def apply(elementStyler: Styler): ElementStyler = {
    val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStyler]
  }
  @scala.inline
  implicit class ElementStylerOps[Self <: ElementStyler] (val x: Self) extends AnyVal {
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

