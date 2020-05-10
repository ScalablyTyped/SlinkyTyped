package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent extends js.Object {
  var duration: Double = js.native
  var easing: KeyboardEventEasing = js.native
  var endCoordinates: ScreenRect = js.native
  var isEventFromThisApp: Boolean = js.native
  var startCoordinates: ScreenRect = js.native
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: KeyboardEventEasing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCoordinates(value: ScreenRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEventFromThisApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEventFromThisApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartCoordinates(value: ScreenRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

