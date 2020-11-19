package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.selectButtonMod.SelectButtonProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectButton {
  
  @JSImport("primereact/selectbutton", "SelectButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactSelectbuttonMod.SelectButton] {
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* option */ js.Any => ReactElement): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
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
  
  def withProps(p: SelectButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SelectButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
