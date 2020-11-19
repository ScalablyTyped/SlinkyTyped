package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.chipsChipsMod.ChipsProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chips {
  
  @JSImport("primereact/chips", "Chips")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.chipsMod.Chips] {
    
    @scala.inline
    def allowDuplicate(value: Boolean): this.type = set("allowDuplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAdd(value: /* e */ Value => Unit): this.type = set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: /* event */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* event */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRemove(value: /* e */ Value => Unit): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChipsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Chips.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
