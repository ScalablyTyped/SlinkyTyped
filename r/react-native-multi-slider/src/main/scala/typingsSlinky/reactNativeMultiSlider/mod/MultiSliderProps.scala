package typingsSlinky.reactNativeMultiSlider.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMultiSlider.anon.BorderRadius
import typingsSlinky.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typingsSlinky.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSliderProps extends js.Object {
  /**
    * Style of sliders container, note be careful in applying styles that may affect the children's (i.e. the slider's) positioning
    *
    * Default { height: 30 }
    */
  var containerStyle: js.UndefOr[ViewStyle] = js.native
  var customMarker: js.UndefOr[ReactComponentClass[MarkerProps]] = js.native
  /**
    * Customise the marker's style
    *
    * Default {
    *     height:30,
    *     width: 30,
    *     borderRadius: 15,
    *     backgroundColor:'#E8E8E8',
    *     borderWidth: 0.5,
    *     borderColor: 'grey',
    * }
    */
  var markerStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Slider max value corresponding to far right
    *
    * Default 10
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Slider min value corresponding to far left
    *
    * Default 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Function called after every change in value, with current values passed in as an array.
    */
  var onValuesChange: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.native
  /**
    * Function called on end of press with final values passed in as an array
    */
  var onValuesChangeFinish: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.native
  /**
    * Function to be called at beginning of press
    */
  var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Array of values corresponding to the slider's position (left to right on slider index 0 to end respectively).
    * Values of any type can be inserted and the slider will simply give them back in the callbacks
    */
  var optionsArray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Style to be given to marker when pressed
    *
    * Default { backgroundColor:'#D3D3D3' }
    */
  var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Style for the track up to a single marker or between double markers
    *
    * Default { backgroundColor: 'blue' }
    */
  var selectedStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Width of track
    *
    * Default 280
    */
  var sliderLength: js.UndefOr[Double] = js.native
  /**
    * TODO
    */
  var sliderOrientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * The step size between values. Make sure min max range is divisible by this to get expected results
    *
    * Default 1
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Area to be touched, should enclose the whole marker.
    * Will be automatically centered and contain the marker.
    * Slip displacement If finger leaves the marker measures distance before responder cuts out and changes are no
    * longer registered, if not given marker will be active until pressed released.
    */
  var touchDimensions: js.UndefOr[BorderRadius] = js.native
  /**
    * Customise the track
    *
    * Default { borderRadius: 7, height: 3.5 }
    */
  var trackStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Style for remaining track
    *
    * Default { backgroundColor: 'grey' }
    */
  var unselectedStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * An array containing one or two values (determines one or two markers respectively) that are the initial marker values.
    * Note these must be possible values from your set up.
    *
    * Default [0]
    */
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
    def withOnValuesChange(value: /* change */ js.Array[Double] => Unit): Self = {
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
    def withOnValuesChangeFinish(value: /* change */ js.Array[Double] => Unit): Self = {
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
    def withSliderOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderOrientation")(js.undefined)
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
    def withTouchDimensions(value: BorderRadius): Self = {
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

