package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaPresenceMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaPresence", "PersonaPresence")
  @js.native
  val PersonaPresence: ReactComponentClass[IPersonaPresenceProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaPresence", "PersonaPresenceBase")
  @js.native
  class PersonaPresenceBase protected ()
    extends typingsSlinky.officeUiFabricReact.personaPresenceBaseMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
}
