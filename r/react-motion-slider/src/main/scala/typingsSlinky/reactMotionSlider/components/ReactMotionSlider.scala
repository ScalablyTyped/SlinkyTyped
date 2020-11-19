package typingsSlinky.reactMotionSlider.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.OpaqueConfig
import typingsSlinky.reactMotionSlider.mod.SliderProps
import typingsSlinky.reactMotionSlider.mod.default
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.center
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.left
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.right
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMotionSlider {
  
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def afterSlide(value: /* currentIndex */ Double => Unit): this.type = set("afterSlide", js.Any.fromFunction1(value))
    
    @scala.inline
    def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit): this.type = set("beforeSlide", js.Any.fromFunction2(value))
    
    @scala.inline
    def currentIndex(value: Double): this.type = set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentKey(value: String | Double): this.type = set("currentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flickTimeout(value: Double): this.type = set("flickTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesToMove(value: Double): this.type = set("slidesToMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def springConfig(value: OpaqueConfig): this.type = set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipe(value: Boolean | touch | mouse): this.type = set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactMotionSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
