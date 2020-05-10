package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTooltipInitConfig extends js.Object {
  var preventAnimation: Boolean = js.native
  var tooltipClass: String = js.native
}

object UiTooltipInitConfig {
  @scala.inline
  def apply(preventAnimation: Boolean, tooltipClass: String): UiTooltipInitConfig = {
    val __obj = js.Dynamic.literal(preventAnimation = preventAnimation.asInstanceOf[js.Any], tooltipClass = tooltipClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTooltipInitConfig]
  }
  @scala.inline
  implicit class UiTooltipInitConfigOps[Self <: UiTooltipInitConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

