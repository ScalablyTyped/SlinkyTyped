package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", JSImport.Namespace)
@js.native
object personaCoinMod extends js.Object {
  
  val PersonaCoin: ReactComponentClass[IPersonaCoinProps] = js.native
  
  @js.native
  class PersonaCoinBase protected ()
    extends typingsSlinky.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase {
    def this(props: IPersonaCoinProps) = this()
  }
  /* static members */
  @js.native
  object PersonaCoinBase extends js.Object {
    
    var defaultProps: IPersonaCoinProps = js.native
  }
}
