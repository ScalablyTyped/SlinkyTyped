package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.CloseSource
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.drawerMod.DrawerOverrides
import typingsSlinky.baseui.drawerMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("baseui/drawer", "Drawer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.drawerMod.Drawer] {
    
    @scala.inline
    def anchor(value: left | right | top | bottom | String): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBackdropClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => _): this.type = set("onBackdropClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: /* args */ CloseSource => _): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEscapeKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => _): this.type = set("onEscapeKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: DrawerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showBackdrop(value: Boolean): this.type = set("showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: default_ | full | auto | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
