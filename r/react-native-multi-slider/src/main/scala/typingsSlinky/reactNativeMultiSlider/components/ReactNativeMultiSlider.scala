package typingsSlinky.reactNativeMultiSlider.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMultiSlider.anon.BorderRadius
import typingsSlinky.reactNativeMultiSlider.mod.MarkerProps
import typingsSlinky.reactNativeMultiSlider.mod.MultiSliderProps
import typingsSlinky.reactNativeMultiSlider.mod.default
import typingsSlinky.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typingsSlinky.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMultiSlider {
  
  @JSImport("react-native-multi-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customMarkerFunctionComponent(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customMarkerComponentClass(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customMarker(value: ReactComponentClass[MarkerProps]): this.type = set("customMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerStyle(value: ViewStyle): this.type = set("markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onValuesChange(value: /* change */ js.Array[Double] => Unit): this.type = set("onValuesChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValuesChangeFinish(value: /* change */ js.Array[Double] => Unit): this.type = set("onValuesChangeFinish", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValuesChangeStart(value: () => Unit): this.type = set("onValuesChangeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def optionsArrayVarargs(value: Double*): this.type = set("optionsArray", js.Array(value :_*))
    
    @scala.inline
    def optionsArray(value: js.Array[Double]): this.type = set("optionsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pressedMarkerStyle(value: ViewStyle): this.type = set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedStyle(value: ViewStyle): this.type = set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sliderLength(value: Double): this.type = set("sliderLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sliderOrientation(value: horizontal | vertical): this.type = set("sliderOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchDimensions(value: BorderRadius): this.type = set("touchDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyle(value: ViewStyle): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectedStyle(value: ViewStyle): this.type = set("unselectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valuesVarargs(value: Double*): this.type = set("values", js.Array(value :_*))
    
    @scala.inline
    def values(value: js.Array[Double]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeMultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
