package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.dropdownMod.DropdownProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("primereact/dropdown", "Dropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDropdownMod.Dropdown] {
    
    @scala.inline
    def appendTo(value: js.Any): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterInputAutoFocus(value: Boolean): this.type = set("filterInputAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterMatchMode(value: String): this.type = set("filterMatchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* option */ js.Any => ReactElement): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* e */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: /* event */ Event => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* e */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: /* event */ Event => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def optionLabel(value: String): this.type = set("optionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionValue(value: String): this.type = set("optionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsVarargs(value: js.Any*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: js.Array[_]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelClassName(value: String): this.type = set("panelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelStyle(value: js.Object): this.type = set("panelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showClear(value: Boolean): this.type = set("showClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Dropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
