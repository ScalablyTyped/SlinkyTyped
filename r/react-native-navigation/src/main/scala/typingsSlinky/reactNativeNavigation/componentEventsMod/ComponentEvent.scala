package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentEvent extends js.Object {
  var componentId: String = js.native
}

object ComponentEvent {
  @scala.inline
  def apply(componentId: String): ComponentEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentEvent]
  }
  @scala.inline
  implicit class ComponentEventOps[Self <: ComponentEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

