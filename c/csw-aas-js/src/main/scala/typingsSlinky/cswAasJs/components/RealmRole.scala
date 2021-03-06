package typingsSlinky.cswAasJs.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cswAasJs.realmRoleMod.RealmRoleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RealmRole {
  
  @scala.inline
  def apply(realmRole: String): Builder = {
    val __props = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RealmRoleProps]))
  }
  
  @JSImport("csw-aas-js", "RealmRole")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def error(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RealmRoleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
