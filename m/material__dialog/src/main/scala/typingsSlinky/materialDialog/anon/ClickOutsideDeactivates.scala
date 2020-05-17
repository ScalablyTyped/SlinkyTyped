package typingsSlinky.materialDialog.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickOutsideDeactivates extends js.Object {
  var clickOutsideDeactivates: Boolean = js.native
  var initialFocus: Element = js.native
}

object ClickOutsideDeactivates {
  @scala.inline
  def apply(clickOutsideDeactivates: Boolean, initialFocus: Element): ClickOutsideDeactivates = {
    val __obj = js.Dynamic.literal(clickOutsideDeactivates = clickOutsideDeactivates.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOutsideDeactivates]
  }
  @scala.inline
  implicit class ClickOutsideDeactivatesOps[Self <: ClickOutsideDeactivates] (val x: Self) extends AnyVal {
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

