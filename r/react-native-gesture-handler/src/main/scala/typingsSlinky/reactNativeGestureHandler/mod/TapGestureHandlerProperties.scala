package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapGestureHandlerProperties extends GestureHandlerProperties {
  var maxDelayMs: js.UndefOr[Double] = js.native
  var maxDeltaX: js.UndefOr[Double] = js.native
  var maxDeltaY: js.UndefOr[Double] = js.native
  var maxDist: js.UndefOr[Double] = js.native
  var maxDurationMs: js.UndefOr[Double] = js.native
  var minPointers: js.UndefOr[Double] = js.native
  var numberOfTaps: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ TapGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ TapGestureHandlerStateChangeEvent, Unit]] = js.native
}

object TapGestureHandlerProperties {
  @scala.inline
  def apply(): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
  @scala.inline
  implicit class TapGestureHandlerPropertiesOps[Self <: TapGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDist")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDurationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDurationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDurationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTaps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfTaps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGestureEvent(value: /* event */ TapGestureHandlerGestureEvent => Unit): Self = {
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
    def withOnHandlerStateChange(value: /* event */ TapGestureHandlerStateChangeEvent => Unit): Self = {
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

