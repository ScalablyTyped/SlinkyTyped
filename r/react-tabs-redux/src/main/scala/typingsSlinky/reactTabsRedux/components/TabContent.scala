package typingsSlinky.reactTabsRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTabsRedux.tabContentMod.TabContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabContent {
  
  @scala.inline
  def apply(`for`: String | Double): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabContentProps]))
  }
  
  @JSImport("react-tabs-redux", "TabContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTabsRedux.mod.TabContent] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderActiveTabContentOnly(value: Boolean): this.type = set("renderActiveTabContentOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleClassName(value: String): this.type = set("visibleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleStyle(value: js.Object): this.type = set("visibleStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
