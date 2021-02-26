package typingsSlinky.reactSlider.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSlider.anon.Index
import typingsSlinky.reactSlider.anon.Value
import typingsSlinky.reactSlider.mod.ReactSliderProps
import typingsSlinky.reactSlider.mod.^
import typingsSlinky.reactSlider.reactSliderStrings.horizontal
import typingsSlinky.reactSlider.reactSliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSlider {
  
  object ReactSlider {
    
    @JSImport("react-slider", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^] {
      
      @scala.inline
      def ariaLabel(value: String | js.Array[String]): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ariaLabelVarargs(value: String*): this.type = set("ariaLabel", js.Array(value :_*))
      
      @scala.inline
      def ariaValuetext(value: String | (js.Function1[/* value */ Index, String])): this.type = set("ariaValuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ariaValuetextFunction1(value: /* value */ Index => String): this.type = set("ariaValuetext", js.Any.fromFunction1(value))
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: Double | js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minDistance(value: Double): this.type = set("minDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSliderClick(value: /* value */ Double => Unit): this.type = set("onSliderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pageFn(value: /* step */ Double => Double): this.type = set("pageFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def pearling(value: Boolean): this.type = set("pearling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderThumb(value: (/* props */ js.Object, /* state */ Index) => ReactElement): this.type = set("renderThumb", js.Any.fromFunction2(value))
      
      @scala.inline
      def renderTrack(value: (/* props */ js.Object, /* state */ Value) => ReactElement): this.type = set("renderTrack", js.Any.fromFunction2(value))
      
      @scala.inline
      def snapDragDisabled(value: Boolean): this.type = set("snapDragDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def thumbActiveClassName(value: String): this.type = set("thumbActiveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def thumbClassName(value: String): this.type = set("thumbClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackClassName(value: String): this.type = set("trackClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
      
      @scala.inline
      def withTracks(value: Boolean): this.type = set("withTracks", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactSlider.type): typingsSlinky.reactSlider.components.ReactSlider.ReactSlider.Builder = new typingsSlinky.reactSlider.components.ReactSlider.ReactSlider.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ReactSliderProps): typingsSlinky.reactSlider.components.ReactSlider.ReactSlider.Builder = new typingsSlinky.reactSlider.components.ReactSlider.ReactSlider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-slider", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def ariaLabel(value: String | js.Array[String]): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelVarargs(value: String*): this.type = set("ariaLabel", js.Array(value :_*))
    
    @scala.inline
    def ariaValuetext(value: String | (js.Function1[/* value */ Index, String])): this.type = set("ariaValuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaValuetextFunction1(value: /* value */ Index => String): this.type = set("ariaValuetext", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Double | js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDistance(value: Double): this.type = set("minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSliderClick(value: /* value */ Double => Unit): this.type = set("onSliderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageFn(value: /* step */ Double => Double): this.type = set("pageFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def pearling(value: Boolean): this.type = set("pearling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderThumb(value: (/* props */ js.Object, /* state */ Index) => ReactElement): this.type = set("renderThumb", js.Any.fromFunction2(value))
    
    @scala.inline
    def renderTrack(value: (/* props */ js.Object, /* state */ Value) => ReactElement): this.type = set("renderTrack", js.Any.fromFunction2(value))
    
    @scala.inline
    def snapDragDisabled(value: Boolean): this.type = set("snapDragDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbActiveClassName(value: String): this.type = set("thumbActiveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbClassName(value: String): this.type = set("thumbClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackClassName(value: String): this.type = set("trackClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def withTracks(value: Boolean): this.type = set("withTracks", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
