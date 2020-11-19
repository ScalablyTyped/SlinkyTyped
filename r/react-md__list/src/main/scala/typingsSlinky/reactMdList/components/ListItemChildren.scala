package typingsSlinky.reactMdList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonPosition
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonType
import typingsSlinky.reactMdList.listItemChildrenMod.ListItemChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemChildren {
  
  @JSImport("@react-md/list", "ListItemChildren")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAddonReactElement(value: ReactElement): this.type = set("leftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAddon(value: ReactElement): this.type = set("leftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAddonPosition(value: ListItemAddonPosition): this.type = set("leftAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAddonType(value: ListItemAddonType): this.type = set("leftAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primaryTextReactElement(value: ReactElement): this.type = set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primaryText(value: ReactElement): this.type = set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightAddonReactElement(value: ReactElement): this.type = set("rightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightAddon(value: ReactElement): this.type = set("rightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightAddonPosition(value: ListItemAddonPosition): this.type = set("rightAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightAddonType(value: ListItemAddonType): this.type = set("rightAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryTextReactElement(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryText(value: ReactElement): this.type = set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryTextClassName(value: String): this.type = set("secondaryTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textChildren(value: Boolean): this.type = set("textChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListItemChildren.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
