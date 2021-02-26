package typingsSlinky.rmcTabs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcTabs.tabPaneMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPane {
  
  @scala.inline
  def apply(active: Boolean): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-tabs/lib/TabPane", "TabPane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rmcTabs.tabPaneMod.TabPane] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixX(value: Boolean): this.type = set("fixX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixY(value: Boolean): this.type = set("fixY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
