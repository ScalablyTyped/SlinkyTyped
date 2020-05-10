package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDidAppearEvent extends ComponentEvent {
  var componentName: String = js.native
  var passProps: js.UndefOr[js.Object] = js.native
}

object ComponentDidAppearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String): ComponentDidAppearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
  @scala.inline
  implicit class ComponentDidAppearEventOps[Self <: ComponentDidAppearEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPassProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(js.undefined)
        ret
    }
  }
  
}

