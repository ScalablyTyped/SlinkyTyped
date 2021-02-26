package typingsSlinky.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaPresence extends StObject
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence with Double] = js.native
  
  @js.native
  sealed trait away extends PersonaPresence
  /* 3 */ val away: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.away with Double = js.native
  
  @js.native
  sealed trait blocked extends PersonaPresence
  /* 5 */ val blocked: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.blocked with Double = js.native
  
  @js.native
  sealed trait busy extends PersonaPresence
  /* 6 */ val busy: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.busy with Double = js.native
  
  @js.native
  sealed trait dnd extends PersonaPresence
  /* 4 */ val dnd: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.dnd with Double = js.native
  
  @js.native
  sealed trait none extends PersonaPresence
  /* 0 */ val none: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.none with Double = js.native
  
  @js.native
  sealed trait offline extends PersonaPresence
  /* 1 */ val offline: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.offline with Double = js.native
  
  @js.native
  sealed trait online extends PersonaPresence
  /* 2 */ val online: typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence.online with Double = js.native
}
