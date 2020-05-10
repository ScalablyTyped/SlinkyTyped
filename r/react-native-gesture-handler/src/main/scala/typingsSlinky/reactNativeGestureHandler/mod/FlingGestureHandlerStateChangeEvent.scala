package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_FlingGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra = js.native
}

object FlingGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra): FlingGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlingGestureHandlerStateChangeEvent]
  }
  @scala.inline
  implicit class FlingGestureHandlerStateChangeEventOps[Self <: FlingGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

