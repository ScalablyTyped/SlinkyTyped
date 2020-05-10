package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinchGestureHandlerProperties extends GestureHandlerProperties {
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerStateChangeEvent, Unit]] = js.native
}

object PinchGestureHandlerProperties {
  @scala.inline
  def apply(): PinchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchGestureHandlerProperties]
  }
  @scala.inline
  implicit class PinchGestureHandlerPropertiesOps[Self <: PinchGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGestureEvent(value: /* event */ PinchGestureHandlerGestureEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGestureEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGestureEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGestureEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHandlerStateChange(value: /* event */ PinchGestureHandlerStateChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHandlerStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandlerStateChange")(js.undefined)
        ret
    }
  }
  
}

