package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.tabViewMod.TabPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanel {
  
  @JSImport("primereact/tabview", "TabPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTabviewMod.TabPanel] {
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: js.Any): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerStyle(value: js.Any): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftIcon(value: String): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
