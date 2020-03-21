package typingsSlinky.officeUiFabricReact.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PersonaPresenceExample
  extends ExternalComponentNoPropsWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.personaPresenceExampleMod.PersonaPresenceExample
    ] {
  @JSImport("office-ui-fabric-react/lib/components/Persona/examples/Persona.Presence.Example", "PersonaPresenceExample")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

