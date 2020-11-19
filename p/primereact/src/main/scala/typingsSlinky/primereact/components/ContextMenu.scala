package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.contextMenuMod.ContextMenuProps
import typingsSlinky.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenu {
  
  @JSImport("primereact/contextmenu", "ContextMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactMod.ContextMenu] {
    
    @scala.inline
    def appendTo(value: js.Any): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoZIndex(value: Boolean): this.type = set("autoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def global(value: Boolean): this.type = set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modelVarargs(value: MenuItem*): this.type = set("model", js.Array(value :_*))
    
    @scala.inline
    def model(value: js.Array[MenuItem]): this.type = set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHide(value: /* e */ Event => Unit): this.type = set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onShow(value: /* e */ Event => Unit): this.type = set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ContextMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ContextMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
