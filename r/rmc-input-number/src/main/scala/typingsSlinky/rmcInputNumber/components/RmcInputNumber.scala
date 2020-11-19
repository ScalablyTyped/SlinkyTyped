package typingsSlinky.rmcInputNumber.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcInputNumber.mod.PropsType
import typingsSlinky.rmcInputNumber.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcInputNumber {
  
  @JSImport("rmc-input-number", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: js.Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downHandlerReactElement(value: ReactElement): this.type = set("downHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def downHandler(value: ReactElement): this.type = set("downHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusOnUpDown(value: Boolean): this.type = set("focusOnUpDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(value: /* v */ js.Any => Unit): this.type = set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* e */ js.Any => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* e */ js.UndefOr[js.Any] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def parser(value: /* v */ js.Any => Unit): this.type = set("parser", js.Any.fromFunction1(value))
    
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: String | Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def upHandlerReactElement(value: ReactElement): this.type = set("upHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def upHandler(value: ReactElement): this.type = set("upHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RmcInputNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
