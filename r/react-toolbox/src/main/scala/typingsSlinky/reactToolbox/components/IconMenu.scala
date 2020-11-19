package typingsSlinky.reactToolbox.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToolbox.iconMenuMod.IconMenuProps
import typingsSlinky.reactToolbox.iconMenuMod.IconMenuTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.bottomLeft
import typingsSlinky.reactToolbox.reactToolboxStrings.bottomRight
import typingsSlinky.reactToolbox.reactToolboxStrings.static
import typingsSlinky.reactToolbox.reactToolboxStrings.topLeft
import typingsSlinky.reactToolbox.reactToolboxStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconMenu {
  
  @JSImport("react-toolbox/components/menu", "IconMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.menuMod.IconMenu] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRipple(value: Boolean): this.type = set("iconRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverse(value: Boolean): this.type = set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuRipple(value: Boolean): this.type = set("menuRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHide(value: js.Function): this.type = set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: js.Function): this.type = set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onShow(value: js.Function): this.type = set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: auto | static | topLeft | topRight | bottomLeft | bottomRight): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: js.Any): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: IconMenuTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IconMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
