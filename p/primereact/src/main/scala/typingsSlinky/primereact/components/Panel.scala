package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.panelMod.PanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("primereact/panel", "Panel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactPanelMod.Panel] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapseIcon(value: String): this.type = set("collapseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: String): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCollapse(value: /* event */ Event => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExpand(value: /* event */ Event => Unit): this.type = set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def onToggle(value: /* e */ typingsSlinky.primereact.anon.Event => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleable(value: Boolean): this.type = set("toggleable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Panel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
