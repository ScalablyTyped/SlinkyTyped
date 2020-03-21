package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/PersonaPresence", JSImport.Namespace)
@js.native
object libPersonaPresenceMod extends js.Object {
  @js.native
  class PersonaPresenceBase protected ()
    extends typingsSlinky.officeUiFabricReact.personaPresenceMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
  
  val PersonaPresence: ReactComponentClass[IPersonaPresenceProps] = js.native
}

