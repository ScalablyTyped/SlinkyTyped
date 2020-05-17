package typingsSlinky.ptomasroosReactNativeMultiSlider.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ptomasroosReactNativeMultiSlider.anon.BorderRadius
import typingsSlinky.ptomasroosReactNativeMultiSlider.mod.MarkerProps
import typingsSlinky.ptomasroosReactNativeMultiSlider.mod.MultiSliderProps
import typingsSlinky.ptomasroosReactNativeMultiSlider.mod.default
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMultiSlider {
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowOverlap(value: Boolean): this.type = set("allowOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerFunctionComponent(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerComponentClass(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarker(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerLeftFunctionComponent(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerLeftComponentClass(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerLeft(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerRightFunctionComponent(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerRightComponentClass(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def customMarkerRight(value: ReactComponentClass[MarkerProps]): this.type = set("customMarkerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def enabledOne(value: Boolean): this.type = set("enabledOne", value.asInstanceOf[js.Any])
    @scala.inline
    def enabledTwo(value: Boolean): this.type = set("enabledTwo", value.asInstanceOf[js.Any])
    @scala.inline
    def isMarkersSeparated(value: Boolean): this.type = set("isMarkersSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def markerContainerStyle(value: ViewStyle): this.type = set("markerContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def markerOffsetX(value: Double): this.type = set("markerOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def markerOffsetY(value: Double): this.type = set("markerOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def markerStyle(value: ViewStyle): this.type = set("markerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onToggleOne(value: () => Unit): this.type = set("onToggleOne", js.Any.fromFunction0(value))
    @scala.inline
    def onToggleTwo(value: () => Unit): this.type = set("onToggleTwo", js.Any.fromFunction0(value))
    @scala.inline
    def onValuesChange(value: /* values */ js.Array[Double] => Unit): this.type = set("onValuesChange", js.Any.fromFunction1(value))
    @scala.inline
    def onValuesChangeFinish(value: /* values */ js.Array[Double] => Unit): this.type = set("onValuesChangeFinish", js.Any.fromFunction1(value))
    @scala.inline
    def onValuesChangeStart(value: () => Unit): this.type = set("onValuesChangeStart", js.Any.fromFunction0(value))
    @scala.inline
    def optionsArray(value: js.Array[Double]): this.type = set("optionsArray", value.asInstanceOf[js.Any])
    @scala.inline
    def pressedMarkerStyle(value: ViewStyle): this.type = set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedStyle(value: ViewStyle): this.type = set("selectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def sliderLength(value: Double): this.type = set("sliderLength", value.asInstanceOf[js.Any])
    @scala.inline
    def snapped(value: Boolean): this.type = set("snapped", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def touchDimensions(value: BorderRadius): this.type = set("touchDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def trackStyle(value: ViewStyle): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectedStyle(value: ViewStyle): this.type = set("unselectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def valuePrefix(value: String): this.type = set("valuePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def valueSuffix(value: String): this.type = set("valueSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeMultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

