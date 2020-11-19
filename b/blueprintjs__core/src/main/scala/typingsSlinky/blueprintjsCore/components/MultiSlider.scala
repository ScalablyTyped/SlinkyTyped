package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.handlePropsMod.IHandleProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiSlider {
  
  @JSImport("@blueprintjs/core", "MultiSlider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.MultiSlider] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTrackIntent(value: Intent): this.type = set("defaultTrackIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPrecision(value: Double): this.type = set("labelPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRendererFunction1(value: /* value */ Double => String | ReactElement): this.type = set("labelRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | ReactElement])): this.type = set("labelRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStepSize(value: Double): this.type = set("labelStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* values */ js.Array[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRelease(value: /* values */ js.Array[Double] => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def showTrackFill(value: Boolean): this.type = set("showTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Handle {
    
    @JSImport("@blueprintjs/core", "MultiSlider.Handle")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: /* newValue */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRelease(value: /* newValue */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def trackStyleAfter(value: CSSProperties): this.type = set("trackStyleAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackStyleBefore(value: CSSProperties): this.type = set("trackStyleBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: IHandleProps): typingsSlinky.blueprintjsCore.components.MultiSlider.Handle.Builder = new typingsSlinky.blueprintjsCore.components.MultiSlider.Handle.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(value: Double): typingsSlinky.blueprintjsCore.components.MultiSlider.Handle.Builder = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new typingsSlinky.blueprintjsCore.components.MultiSlider.Handle.Builder(js.Array(this.component, __props.asInstanceOf[IHandleProps]))
    }
  }
}
