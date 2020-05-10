package typingsSlinky.ptomasroosReactNativeMultiSlider.mod

import slinky.core.ReactComponentClass
import typingsSlinky.ptomasroosReactNativeMultiSlider.AnonBorderRadius
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSliderProps extends js.Object {
  var allowOverlap: js.UndefOr[Boolean] = js.native
  var containerStyle: js.UndefOr[ViewStyle] = js.native
  var customMarker: js.UndefOr[ReactComponentClass[MarkerProps]] = js.native
  var customMarkerLeft: js.UndefOr[ReactComponentClass[MarkerProps]] = js.native
  var customMarkerRight: js.UndefOr[ReactComponentClass[MarkerProps]] = js.native
  var enabledOne: js.UndefOr[Boolean] = js.native
  var enabledTwo: js.UndefOr[Boolean] = js.native
  var isMarkersSeparated: js.UndefOr[Boolean] = js.native
  var markerContainerStyle: js.UndefOr[ViewStyle] = js.native
  var markerOffsetX: js.UndefOr[Double] = js.native
  var markerOffsetY: js.UndefOr[Double] = js.native
  var markerStyle: js.UndefOr[ViewStyle] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onToggleOne: js.UndefOr[js.Function0[Unit]] = js.native
  var onToggleTwo: js.UndefOr[js.Function0[Unit]] = js.native
  var onValuesChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  var onValuesChangeFinish: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var optionsArray: js.UndefOr[js.Array[Double]] = js.native
  var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
  var selectedStyle: js.UndefOr[ViewStyle] = js.native
  var sliderLength: js.UndefOr[Double] = js.native
  var snapped: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
  var touchDimensions: js.UndefOr[AnonBorderRadius] = js.native
  var trackStyle: js.UndefOr[ViewStyle] = js.native
  var unselectedStyle: js.UndefOr[ViewStyle] = js.native
  var valuePrefix: js.UndefOr[String] = js.native
  var valueSuffix: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object MultiSliderProps {
  @scala.inline
  def apply(): MultiSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSliderProps]
  }
  @scala.inline
  implicit class MultiSliderPropsOps[Self <: MultiSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMarkerFunctionComponent(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarkerComponentClass(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarker(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMarkerLeftFunctionComponent(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarkerLeftComponentClass(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarkerLeft(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMarkerLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMarkerRightFunctionComponent(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarkerRightComponentClass(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMarkerRight(value: ReactComponentClass[MarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMarkerRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMarkerRight")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledOne")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledTwo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledTwo")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMarkersSeparated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMarkersSeparated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMarkersSeparated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMarkersSeparated")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerContainerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleOne(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleOne")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnToggleOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleOne")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleTwo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleTwo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnToggleTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleTwo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChange(value: /* values */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChangeFinish(value: /* values */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChangeFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChangeFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChangeStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChangeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsArray")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedMarkerStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedMarkerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedMarkerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapped")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchDimensions(value: AnonBorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

