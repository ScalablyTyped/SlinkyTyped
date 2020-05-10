package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarCancelPressedEvent extends ComponentEvent {
  var componentName: js.UndefOr[String] = js.native
}

object SearchBarCancelPressedEvent {
  @scala.inline
  def apply(componentId: String): SearchBarCancelPressedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarCancelPressedEvent]
  }
  @scala.inline
  implicit class SearchBarCancelPressedEventOps[Self <: SearchBarCancelPressedEvent] (val x: Self) extends AnyVal {
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
    def withoutComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(js.undefined)
        ret
    }
  }
  
}

