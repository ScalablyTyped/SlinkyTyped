package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.NumberDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.sliderMod.SliderProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("antd-mobile", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Slider] {
    
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handle(value: js.Any): this.type = set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleStyle(value: CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marks(value: NumberDictionary[String]): this.type = set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumTrackStyle(value: CSSProperties): this.type = set("maximumTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumTrackStyle(value: CSSProperties): this.type = set("minimumTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterChange(value: /* value */ js.UndefOr[Double] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipFormatter(value: /* value */ js.UndefOr[String] => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def trackStyle(value: CSSProperties): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
