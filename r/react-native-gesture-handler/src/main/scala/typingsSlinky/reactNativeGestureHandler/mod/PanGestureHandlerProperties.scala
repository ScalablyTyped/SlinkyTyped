package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanGestureHandlerProperties extends GestureHandlerProperties {
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  var avgTouches: js.UndefOr[Boolean] = js.native
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  /** @deprecated  use failOffsetX*/
  var maxDeltaX: js.UndefOr[Double] = js.native
  /** @deprecated  use failOffsetY*/
  var maxDeltaY: js.UndefOr[Double] = js.native
  var maxPointers: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetX*/
  var minDeltaX: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetY*/
  var minDeltaY: js.UndefOr[Double] = js.native
  var minDist: js.UndefOr[Double] = js.native
  /** @deprecated  use activeOffsetX*/
  var minOffsetX: js.UndefOr[Double] = js.native
  /** @deprecated  use failOffsetY*/
  var minOffsetY: js.UndefOr[Double] = js.native
  var minPointers: js.UndefOr[Double] = js.native
  var minVelocity: js.UndefOr[Double] = js.native
  var minVelocityX: js.UndefOr[Double] = js.native
  var minVelocityY: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.native
}

object PanGestureHandlerProperties {
  @scala.inline
  def apply(): PanGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanGestureHandlerProperties]
  }
  @scala.inline
  implicit class PanGestureHandlerPropertiesOps[Self <: PanGestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOffsetX(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOffsetY(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withAvgTouches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTouches")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOffsetX(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOffsetY(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetY")(js.undefined)
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
    def withMaxPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDist")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetY")(js.undefined)
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
    def withMinVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityY")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): Self = {
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
    def withOnHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): Self = {
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

