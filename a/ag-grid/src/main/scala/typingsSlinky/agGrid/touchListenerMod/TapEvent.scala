package typingsSlinky.agGrid.touchListenerMod

import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapEvent extends AgEvent {
  var touchStart: Touch
}

object TapEvent {
  @scala.inline
  def apply(touchStart: Touch, `type`: String): TapEvent = {
    val __obj = js.Dynamic.literal(touchStart = touchStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapEvent]
  }
}

