package typingsSlinky.cswAasJs.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cswAasJs.clientRoleMod.ClientRoleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClientRole {
  
  @scala.inline
  def apply(clientRole: String): Builder = {
    val __props = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClientRoleProps]))
  }
  
  @JSImport("csw-aas-js", "ClientRole")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def client(value: String): this.type = set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClientRoleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
