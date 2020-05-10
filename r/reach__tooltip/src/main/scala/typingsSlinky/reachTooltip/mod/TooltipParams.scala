package typingsSlinky.reachTooltip.mod

import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipParams extends js.Object {
  var id: String = js.native
  var isVisible: Boolean = js.native
  var triggerRect: DOMRect = js.native
}

object TooltipParams {
  @scala.inline
  def apply(id: String, isVisible: Boolean, triggerRect: DOMRect): TooltipParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], triggerRect = triggerRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipParams]
  }
  @scala.inline
  implicit class TooltipParamsOps[Self <: TooltipParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerRect(value: DOMRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

