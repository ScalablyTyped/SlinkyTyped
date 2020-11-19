package typingsSlinky.reactToolbox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactToolbox.tabContentMod.TabContentProps
import typingsSlinky.reactToolbox.tabContentMod.TabContentTheme
import typingsSlinky.reactToolbox.tabContentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabContent {
  
  @JSImport("react-toolbox/components/tabs/TabContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
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
    def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: TabContentTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
