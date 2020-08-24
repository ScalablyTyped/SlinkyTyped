package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PersonaBase {
  @JSImport("office-ui-fabric-react", "PersonaBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IPersonaProps): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PersonaBase.type): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, js.Dictionary.empty))()
}

