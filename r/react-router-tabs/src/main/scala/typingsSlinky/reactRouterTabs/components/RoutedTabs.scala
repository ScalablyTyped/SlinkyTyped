package typingsSlinky.reactRouterTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRouterTabs.mod.RoutedTabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RoutedTabs {
  
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def activeTabClassName(value: String): this.type = set("activeTabClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeTabStyle(value: js.Object): this.type = set("activeTabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startPathWith(value: String): this.type = set("startPathWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabClassName(value: String): this.type = set("tabClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyle(value: js.Object): this.type = set("tabStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RoutedTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RoutedTabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
