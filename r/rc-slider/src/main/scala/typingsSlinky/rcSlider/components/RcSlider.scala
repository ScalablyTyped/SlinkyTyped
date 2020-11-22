package typingsSlinky.rcSlider.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSlider.anon.AriaLabel
import typingsSlinky.rcSlider.anon.Label
import typingsSlinky.rcSlider.rangeMod.RangeProps
import typingsSlinky.rcSlider.sliderMod.SliderProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcSlider {
  
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps88569986[js.Object] = new SharedBuilder_SliderProps88569986[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcSlider.type): SharedBuilder_SliderProps88569986[js.Object] = new SharedBuilder_SliderProps88569986[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  object Range {
    
    @JSImport("rc-slider", "default.Range")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def activeDotStyle(value: CSSProperties): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowCross(value: Boolean): this.type = set("allowCross", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ariaLabelGroupForHandlesVarargs(value: String*): this.type = set("ariaLabelGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def ariaLabelGroupForHandles(value: String | js.Array[String]): this.type = set("ariaLabelGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ariaLabelledByGroupForHandlesVarargs(value: String*): this.type = set("ariaLabelledByGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def ariaLabelledByGroupForHandles(value: String | js.Array[String]): this.type = set("ariaLabelledByGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ariaValueTextFormatterGroupForHandlesVarargs(value: String*): this.type = set("ariaValueTextFormatterGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def ariaValueTextFormatterGroupForHandles(value: String | js.Array[String]): this.type = set("ariaValueTextFormatterGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dotStyle(value: CSSProperties): this.type = set("dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def handle(value: /* props */ AriaLabel => ReactElement): this.type = set("handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value :_*))
      
      @scala.inline
      def handleStyle(value: js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def marks(value: Record[Double, ReactElement | Label]): this.type = set("marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maximumTrackStyle(value: CSSProperties): this.type = set("maximumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAfterChange(value: /* value */ js.Array[Double] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeChange(value: /* value */ js.Array[Double] => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: /* value */ js.Array[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pushable(value: Boolean): this.type = set("pushable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndexVarargs(value: Double*): this.type = set("tabIndex", js.Array(value :_*))
      
      @scala.inline
      def tabIndex(value: Double | js.Array[Double]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value :_*))
      
      @scala.inline
      def trackStyle(value: js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
      
      @scala.inline
      def value(value: js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: RangeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Range.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
