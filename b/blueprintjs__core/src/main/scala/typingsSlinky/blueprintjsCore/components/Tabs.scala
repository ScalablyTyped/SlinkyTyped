package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.blueprintjsCore.tabMod.TabId
import typingsSlinky.blueprintjsCore.tabsMod.ITabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @scala.inline
  def apply(id: TabId): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITabsProps]))
  }
  
  object Expander {
    
    @JSImport("@blueprintjs/core", "Tabs.Expander")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Expander.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@blueprintjs/core", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Tabs] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedTabId(value: TabId): this.type = set("defaultSelectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def renderActiveTabPanelOnly(value: Boolean): this.type = set("renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedTabId(value: TabId): this.type = set("selectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
