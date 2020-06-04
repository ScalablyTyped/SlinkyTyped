package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  var duration: Double
  var easing: KeyboardEventEasing
  var endCoordinates: ScreenRect
  var isEventFromThisApp: Boolean
  var startCoordinates: ScreenRect
}

object KeyboardEvent {
  @scala.inline
  def apply(
    duration: Double,
    easing: KeyboardEventEasing,
    endCoordinates: ScreenRect,
    isEventFromThisApp: Boolean,
    startCoordinates: ScreenRect
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endCoordinates = endCoordinates.asInstanceOf[js.Any], isEventFromThisApp = isEventFromThisApp.asInstanceOf[js.Any], startCoordinates = startCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: KeyboardEventEasing): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCoordinates(value: ScreenRect): Self = this.set("endCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEventFromThisApp(value: Boolean): Self = this.set("isEventFromThisApp", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartCoordinates(value: ScreenRect): Self = this.set("startCoordinates", value.asInstanceOf[js.Any])
  }
  
}

