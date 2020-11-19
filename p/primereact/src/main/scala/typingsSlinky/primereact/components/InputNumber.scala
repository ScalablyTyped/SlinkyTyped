package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.inputNumberMod.InputNumberProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputNumber {
  
  @JSImport("primereact/inputnumber", "InputNumber")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactInputnumberMod.InputNumber] {
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonLayout(value: String): this.type = set("buttonLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currencyDisplay(value: String): this.type = set("currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decrementButtonClassName(value: String): this.type = set("decrementButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decrementButtonIcon(value: String): this.type = set("decrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: Boolean): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def incrementButtonClassName(value: String): this.type = set("incrementButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def incrementButtonIcon(value: String): this.type = set("incrementButtonIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: String): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: js.Object): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localeMatcher(value: String): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFractionDigits(value: Double): this.type = set("maxFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minFractionDigits(value: Double): this.type = set("minFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* e */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* e */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showButtons(value: Boolean): this.type = set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffix(value: String): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useGrouping(value: Boolean): this.type = set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InputNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
