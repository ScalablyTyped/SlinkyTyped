package typingsSlinky.materialDialog

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClickOutsideDeactivates extends js.Object {
  var clickOutsideDeactivates: Boolean = js.native
  var initialFocus: Element = js.native
}

object AnonClickOutsideDeactivates {
  @scala.inline
  def apply(clickOutsideDeactivates: Boolean, initialFocus: Element): AnonClickOutsideDeactivates = {
    val __obj = js.Dynamic.literal(clickOutsideDeactivates = clickOutsideDeactivates.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClickOutsideDeactivates]
  }
  @scala.inline
  implicit class AnonClickOutsideDeactivatesOps[Self <: AnonClickOutsideDeactivates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickOutsideDeactivates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutsideDeactivates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialFocus(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

