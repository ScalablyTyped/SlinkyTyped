package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.anon.Height
import typingsSlinky.reactNativeElements.mod.SliderProps
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.horizontal
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.spring
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.timing
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("react-native-elements", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Slider] {
    
    @scala.inline
    def allowTouchTrack(value: Boolean): this.type = set("allowTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateTransitions(value: Boolean): this.type = set("animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationConfig(value: TimingAnimationConfig | SpringAnimationConfig): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationType(value: spring | timing): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debugTouchArea(value: Boolean): this.type = set("debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumTrackTintColor(value: String): this.type = set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumValue(value: Double): this.type = set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumTrackTintColor(value: String): this.type = set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumValue(value: Double): this.type = set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSlidingComplete(value: /* value */ Double => Unit): this.type = set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlidingStart(value: /* value */ Double => Unit): this.type = set("onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* value */ Double => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def thumbProps(value: js.Any): this.type = set("thumbProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyleNull: this.type = set("thumbStyle", null)
    
    @scala.inline
    def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbTouchSize(value: Height): this.type = set("thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyle(value: StyleProp[ViewStyle]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyleNull: this.type = set("trackStyle", null)
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
