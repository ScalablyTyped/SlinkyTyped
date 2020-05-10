package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceTouchGestureHandlerProperties extends GestureHandlerProperties {
  var feedbackOnActivation: js.UndefOr[Boolean] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var minForce: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerStateChangeEvent, Unit]] = js.native
}

object ForceTouchGestureHandlerProperties {
  @scala.inline
  def apply(): ForceTouchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceTouchGestureHandlerProperties]
  }
  @scala.inline
  implicit class ForceTouchGestureHandlerPropertiesOps[Self <: ForceTouchGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedbackOnActivation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackOnActivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackOnActivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackOnActivation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(js.undefined)
        ret
    }
    @scala.inline
    def withMinForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minForce")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGestureEvent(value: /* event */ ForceTouchGestureHandlerGestureEvent => Unit): Self = {
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
    def withOnHandlerStateChange(value: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit): Self = {
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

