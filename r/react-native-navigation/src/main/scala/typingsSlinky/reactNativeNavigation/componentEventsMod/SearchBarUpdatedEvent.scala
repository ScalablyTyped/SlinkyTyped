package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarUpdatedEvent extends ComponentEvent {
  var isFocused: Boolean = js.native
  var text: String = js.native
}

object SearchBarUpdatedEvent {
  @scala.inline
  def apply(componentId: String, isFocused: Boolean, text: String): SearchBarUpdatedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarUpdatedEvent]
  }
  @scala.inline
  implicit class SearchBarUpdatedEventOps[Self <: SearchBarUpdatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

