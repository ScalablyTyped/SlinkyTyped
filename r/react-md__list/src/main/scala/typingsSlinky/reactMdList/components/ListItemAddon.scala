package typingsSlinky.reactMdList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonPosition
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonProps
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemAddon {
  
  @JSImport("@react-md/list", "ListItemAddon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addon(value: ReactElement): this.type = set("addon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addonAfter(value: Boolean): this.type = set("addonAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addonReactElement(value: ReactElement): this.type = set("addon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: ListItemAddonPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: ListItemAddonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemAddon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemAddonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
