package typingsSlinky.reduxDevtoolsDockMonitor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxDevtoolsDockMonitor.mod.DockPosition
import typingsSlinky.reduxDevtoolsDockMonitor.mod.IDockMonitorProps
import typingsSlinky.reduxDevtoolsDockMonitor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReduxDevtoolsDockMonitor {
  
  @JSImport("redux-devtools-dock-monitor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def changeMonitorKey(value: String): this.type = set("changeMonitorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultIsVisible(value: Boolean): this.type = set("defaultIsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultPosition(value: DockPosition): this.type = set("defaultPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSize(value: Double): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDockMonitorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(changePositionKey: String, toggleVisibilityKey: String): Builder = {
    val __props = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDockMonitorProps]))
  }
}
