package typingsSlinky.agDashGrid.distLibWidgetsTouchListenerMod

import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.agDashGrid.distLibEventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongTapEvent extends AgEvent {
  var touchEvent: TouchEvent
  var touchStart: Touch
}

object LongTapEvent {
  @scala.inline
  def apply(touchEvent: TouchEvent, touchStart: Touch, `type`: String): LongTapEvent = {
    val __obj = js.Dynamic.literal(touchEvent = touchEvent.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongTapEvent]
  }
}

