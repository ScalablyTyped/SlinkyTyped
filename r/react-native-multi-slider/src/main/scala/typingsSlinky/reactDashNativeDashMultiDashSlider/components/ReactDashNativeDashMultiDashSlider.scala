package typingsSlinky.reactDashNativeDashMultiDashSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashMultiDashSlider.Anon_BorderRadius
import typingsSlinky.reactDashNativeDashMultiDashSlider.reactDashNativeDashMultiDashSliderMod.MarkerProps
import typingsSlinky.reactDashNativeDashMultiDashSlider.reactDashNativeDashMultiDashSliderMod.MultiSliderProps
import typingsSlinky.reactDashNativeDashMultiDashSlider.reactDashNativeDashMultiDashSliderMod.default
import typingsSlinky.reactDashNativeDashMultiDashSlider.reactDashNativeDashMultiDashSliderStrings.horizontal
import typingsSlinky.reactDashNativeDashMultiDashSlider.reactDashNativeDashMultiDashSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashMultiDashSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-multi-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    containerStyle: ViewStyle = null,
    customMarker: ReactComponentClass[MarkerProps] = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onValuesChange: /* change */ js.Array[Double] => Unit = null,
    onValuesChangeFinish: /* change */ js.Array[Double] => Unit = null,
    onValuesChangeStart: () => Unit = null,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    sliderOrientation: horizontal | vertical = null,
    step: Int | Double = null,
    touchDimensions: Anon_BorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    values: js.Array[Double] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (sliderOrientation != null) __obj.updateDynamic("sliderOrientation")(sliderOrientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MultiSliderProps
}

