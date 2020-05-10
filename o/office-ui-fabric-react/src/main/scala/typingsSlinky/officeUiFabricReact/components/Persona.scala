package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Persona {
  @JSImport("office-ui-fabric-react", "Persona")
  @js.native
  object component extends js.Object
  
  def withProps(p: IPersonaProps): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Persona.type): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, js.Dictionary.empty))()
}

