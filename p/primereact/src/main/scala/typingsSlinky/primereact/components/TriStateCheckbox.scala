package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.primereact.triStateCheckboxMod.TriStateCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TriStateCheckbox {
  
  @JSImport("primereact/tristatecheckbox", "TriStateCheckbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTristatecheckboxMod.TriStateCheckbox] {
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Boolean): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: TriStateCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TriStateCheckbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
