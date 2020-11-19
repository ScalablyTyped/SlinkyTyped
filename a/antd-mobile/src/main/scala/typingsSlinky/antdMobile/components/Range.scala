package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.rangeMod.RangeProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("antd-mobile", "Range")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Range] {
    
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value :_*))
    
    @scala.inline
    def handleStyle(value: js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
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
    def tipFormatter(value: /* value */ js.UndefOr[Double] => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value :_*))
    
    @scala.inline
    def trackStyle(value: js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RangeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Range.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
