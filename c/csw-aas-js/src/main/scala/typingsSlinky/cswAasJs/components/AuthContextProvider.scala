package typingsSlinky.cswAasJs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextConfig
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthContextProvider {
  
  @scala.inline
  def apply(config: AuthContextConfig): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[AuthContextProps]))
  }
  
  @JSImport("csw-aas-js", "AuthContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AuthContextProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
