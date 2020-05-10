package typingsSlinky.jqueryui

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnselecting extends js.Object {
  var unselecting: Element = js.native
}

object AnonUnselecting {
  @scala.inline
  def apply(unselecting: Element): AnonUnselecting = {
    val __obj = js.Dynamic.literal(unselecting = unselecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnselecting]
  }
  @scala.inline
  implicit class AnonUnselectingOps[Self <: AnonUnselecting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnselecting(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselecting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

