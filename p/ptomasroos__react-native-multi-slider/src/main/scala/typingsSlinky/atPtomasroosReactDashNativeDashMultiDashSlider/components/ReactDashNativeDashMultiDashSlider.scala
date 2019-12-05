package typingsSlinky.atPtomasroosReactDashNativeDashMultiDashSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.atPtomasroosReactDashNativeDashMultiDashSlider.Anon_BorderRadius
import typingsSlinky.atPtomasroosReactDashNativeDashMultiDashSlider.atPtomasroosReactDashNativeDashMultiDashSliderMod.MarkerProps
import typingsSlinky.atPtomasroosReactDashNativeDashMultiDashSlider.atPtomasroosReactDashNativeDashMultiDashSliderMod.MultiSliderProps
import typingsSlinky.atPtomasroosReactDashNativeDashMultiDashSlider.atPtomasroosReactDashNativeDashMultiDashSliderMod.default
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashMultiDashSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    containerStyle: ViewStyle = null,
    customMarker: ReactComponentClass[MarkerProps] = null,
    customMarkerLeft: ReactComponentClass[MarkerProps] = null,
    customMarkerRight: ReactComponentClass[MarkerProps] = null,
    enabledOne: js.UndefOr[Boolean] = js.undefined,
    enabledTwo: js.UndefOr[Boolean] = js.undefined,
    isMarkersSeparated: js.UndefOr[Boolean] = js.undefined,
    markerContainerStyle: ViewStyle = null,
    markerOffsetX: Int | Double = null,
    markerOffsetY: Int | Double = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onToggleOne: () => Unit = null,
    onToggleTwo: () => Unit = null,
    onValuesChange: /* values */ js.Array[Double] => Unit = null,
    onValuesChangeFinish: /* values */ js.Array[Double] => Unit = null,
    onValuesChangeStart: () => Unit = null,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    snapped: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    touchDimensions: Anon_BorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    valuePrefix: String = null,
    valueSuffix: String = null,
    values: js.Array[Double] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (customMarkerLeft != null) __obj.updateDynamic("customMarkerLeft")(customMarkerLeft.asInstanceOf[js.Any])
    if (customMarkerRight != null) __obj.updateDynamic("customMarkerRight")(customMarkerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledOne)) __obj.updateDynamic("enabledOne")(enabledOne.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledTwo)) __obj.updateDynamic("enabledTwo")(enabledTwo.asInstanceOf[js.Any])
    if (!js.isUndefined(isMarkersSeparated)) __obj.updateDynamic("isMarkersSeparated")(isMarkersSeparated.asInstanceOf[js.Any])
    if (markerContainerStyle != null) __obj.updateDynamic("markerContainerStyle")(markerContainerStyle.asInstanceOf[js.Any])
    if (markerOffsetX != null) __obj.updateDynamic("markerOffsetX")(markerOffsetX.asInstanceOf[js.Any])
    if (markerOffsetY != null) __obj.updateDynamic("markerOffsetY")(markerOffsetY.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onToggleOne != null) __obj.updateDynamic("onToggleOne")(js.Any.fromFunction0(onToggleOne))
    if (onToggleTwo != null) __obj.updateDynamic("onToggleTwo")(js.Any.fromFunction0(onToggleTwo))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (!js.isUndefined(snapped)) __obj.updateDynamic("snapped")(snapped.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix.asInstanceOf[js.Any])
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MultiSliderProps
}

