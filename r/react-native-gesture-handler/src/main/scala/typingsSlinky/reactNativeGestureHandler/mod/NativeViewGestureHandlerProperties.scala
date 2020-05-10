package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeViewGestureHandlerProperties extends GestureHandlerProperties {
  var disallowInterruption: js.UndefOr[Boolean] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.native
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.native
}

object NativeViewGestureHandlerProperties {
  @scala.inline
  def apply(): NativeViewGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeViewGestureHandlerProperties]
  }
  @scala.inline
  implicit class NativeViewGestureHandlerPropertiesOps[Self <: NativeViewGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisallowInterruption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowInterruption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowInterruption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowInterruption")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): Self = {
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
    def withOnHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): Self = {
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
    @scala.inline
    def withShouldActivateOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldActivateOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldActivateOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldActivateOnStart")(js.undefined)
        ret
    }
  }
  
}

