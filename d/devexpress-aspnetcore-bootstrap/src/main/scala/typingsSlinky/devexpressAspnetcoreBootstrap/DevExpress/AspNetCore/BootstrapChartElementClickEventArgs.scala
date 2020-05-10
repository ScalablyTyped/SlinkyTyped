package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapChartElementClickEventArgs extends BootstrapChartElementActionEventArgs {
  val jQueryEvent: js.Any = js.native
}

object BootstrapChartElementClickEventArgs {
  @scala.inline
  def apply(component: js.Any, element: js.Any, jQueryEvent: js.Any, sender: Control, target: js.Any): BootstrapChartElementClickEventArgs = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], jQueryEvent = jQueryEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapChartElementClickEventArgs]
  }
  @scala.inline
  implicit class BootstrapChartElementClickEventArgsOps[Self <: BootstrapChartElementClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJQueryEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQueryEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

