package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Persona {
  
  @JSImport("office-ui-fabric-react", "Persona")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Persona.type): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPersonaProps): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, p.asInstanceOf[js.Any]))
}
