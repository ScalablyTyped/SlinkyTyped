package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingGestureHandlerProperties extends GestureHandlerProperties {
  var direction: js.UndefOr[Double] = js.native
  var numberOfPointers: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerStateChangeEvent, Unit]] = js.native
}

object FlingGestureHandlerProperties {
  @scala.inline
  def apply(): FlingGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlingGestureHandlerProperties]
  }
  @scala.inline
  implicit class FlingGestureHandlerPropertiesOps[Self <: FlingGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGestureEvent(value: /* event */ FlingGestureHandlerGestureEvent => Unit): Self = {
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
    def withOnHandlerStateChange(value: /* event */ FlingGestureHandlerStateChangeEvent => Unit): Self = {
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

