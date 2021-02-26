package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Window
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiReactWindowProvider.windowProviderMod.WindowProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowProvider {
  
  @JSImport("office-ui-fabric-react", "WindowProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def window(value: Window): this.type = set("window", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WindowProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WindowProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
