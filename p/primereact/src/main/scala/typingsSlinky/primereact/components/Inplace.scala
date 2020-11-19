package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.ValueBoolean
import typingsSlinky.primereact.inplaceMod.InplaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inplace {
  
  @JSImport("primereact/inplace", "Inplace")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactInplaceMod.Inplace] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* event */ Event => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpen(value: /* event */ Event => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def onToggle(value: /* e */ ValueBoolean => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InplaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Inplace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
