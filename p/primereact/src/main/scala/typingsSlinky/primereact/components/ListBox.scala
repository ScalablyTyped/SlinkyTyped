package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.listBoxMod.ListBoxProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBox {
  
  @JSImport("primereact/listbox", "ListBox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactListboxMod.ListBox] {
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterBy(value: String): this.type = set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterMatchMode(value: String): this.type = set("filterMatchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterPlaceholder(value: String): this.type = set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyle(value: js.Object): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def optionLabel(value: String): this.type = set("optionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionValue(value: String): this.type = set("optionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def optionsVarargs(value: js.Any*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: js.Array[_]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
