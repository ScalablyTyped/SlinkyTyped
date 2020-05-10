package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_TapGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra = js.native
}

object TapGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra): TapGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerGestureEvent]
  }
  @scala.inline
  implicit class TapGestureHandlerGestureEventOps[Self <: TapGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

