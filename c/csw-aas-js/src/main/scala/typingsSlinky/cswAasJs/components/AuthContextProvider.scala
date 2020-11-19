package typingsSlinky.cswAasJs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextConfig
import typingsSlinky.cswAasJs.authContextProviderMod.AuthContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthContextProvider {
  
  @JSImport("csw-aas-js", "AuthContextProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: AuthContextProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(config: AuthContextConfig): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[AuthContextProps]))
  }
}
