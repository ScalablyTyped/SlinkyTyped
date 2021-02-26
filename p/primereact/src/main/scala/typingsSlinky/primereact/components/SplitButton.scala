package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.splitButtonMod.SplitButtonProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SplitButton {
  
  @JSImport("primereact/splitbutton", "SplitButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactSplitbuttonMod.SplitButton] {
    
    @scala.inline
    def appendTo(value: HTMLElement): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonTemplate(value: js.Any): this.type = set("buttonTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuStyle(value: js.Object): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def model(value: js.Array[_]): this.type = set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modelVarargs(value: js.Any*): this.type = set("model", js.Array(value :_*))
    
    @scala.inline
    def onClick(value: /* event */ Event => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SplitButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SplitButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
