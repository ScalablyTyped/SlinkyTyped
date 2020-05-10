package typingsSlinky.jqueryui

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnselected extends js.Object {
  var unselected: Element = js.native
}

object AnonUnselected {
  @scala.inline
  def apply(unselected: Element): AnonUnselected = {
    val __obj = js.Dynamic.literal(unselected = unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnselected]
  }
  @scala.inline
  implicit class AnonUnselectedOps[Self <: AnonUnselected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnselected(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

