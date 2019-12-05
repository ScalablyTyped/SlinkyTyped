package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonaPresence extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends js.Object {
  @js.native
  sealed trait away extends PersonaPresence
  
  @js.native
  sealed trait blocked extends PersonaPresence
  
  @js.native
  sealed trait busy extends PersonaPresence
  
  @js.native
  sealed trait dnd extends PersonaPresence
  
  @js.native
  sealed trait none extends PersonaPresence
  
  @js.native
  sealed trait offline extends PersonaPresence
  
  @js.native
  sealed trait online extends PersonaPresence
  
  /* 3 */ val away: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.away with Double = js.native
  /* 5 */ val blocked: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.blocked with Double = js.native
  /* 6 */ val busy: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.busy with Double = js.native
  /* 4 */ val dnd: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.dnd with Double = js.native
  /* 0 */ val none: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.none with Double = js.native
  /* 1 */ val offline: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.offline with Double = js.native
  /* 2 */ val online: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaPresence.online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence with Double] = js.native
}

