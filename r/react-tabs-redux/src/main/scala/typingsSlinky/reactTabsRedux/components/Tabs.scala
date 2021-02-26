package typingsSlinky.reactTabsRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTabsRedux.tabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("react-tabs-redux", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTabsRedux.mod.Tabs] {
    
    @scala.inline
    def activeLinkStyle(value: js.Object): this.type = set("activeLinkStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleSelect(value: (/* tab */ String, /* name */ String) => Unit): this.type = set("handleSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* selectedTab */ String, /* name */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def renderActiveTabContentOnly(value: Boolean): this.type = set("renderActiveTabContentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedTab(value: String): this.type = set("selectedTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleTabStyle(value: js.Object): this.type = set("visibleTabStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
