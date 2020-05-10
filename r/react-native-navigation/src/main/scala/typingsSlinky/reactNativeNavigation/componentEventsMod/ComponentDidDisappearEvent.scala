package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDidDisappearEvent extends ComponentEvent {
  var componentName: String = js.native
}

object ComponentDidDisappearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String): ComponentDidDisappearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDidDisappearEvent]
  }
  @scala.inline
  implicit class ComponentDidDisappearEventOps[Self <: ComponentDidDisappearEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

