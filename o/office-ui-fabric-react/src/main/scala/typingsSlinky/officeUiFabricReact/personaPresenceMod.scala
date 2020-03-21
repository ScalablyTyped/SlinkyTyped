package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaPresence", JSImport.Namespace)
@js.native
object personaPresenceMod extends js.Object {
  @js.native
  class PersonaPresenceBase protected ()
    extends typingsSlinky.officeUiFabricReact.personaPresenceBaseMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
  
  val PersonaPresence: ReactComponentClass[IPersonaPresenceProps] = js.native
}

