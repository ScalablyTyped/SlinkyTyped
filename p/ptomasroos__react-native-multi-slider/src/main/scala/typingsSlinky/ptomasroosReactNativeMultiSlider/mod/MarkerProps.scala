package typingsSlinky.ptomasroosReactNativeMultiSlider.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerProps extends js.Object {
  var currentValue: Double = js.native
  var enabled: Boolean = js.native
  var markerStyle: ViewStyle = js.native
  var pressed: Boolean = js.native
  var pressedMarkerStyle: ViewStyle = js.native
  var valuePrefix: String = js.native
  var valueSuffix: String = js.native
}

object MarkerProps {
  @scala.inline
  def apply(
    currentValue: Double,
    enabled: Boolean,
    markerStyle: ViewStyle,
    pressed: Boolean,
    pressedMarkerStyle: ViewStyle,
    valuePrefix: String,
    valueSuffix: String
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], markerStyle = markerStyle.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], pressedMarkerStyle = pressedMarkerStyle.asInstanceOf[js.Any], valuePrefix = valuePrefix.asInstanceOf[js.Any], valueSuffix = valueSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressedMarkerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedMarkerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

