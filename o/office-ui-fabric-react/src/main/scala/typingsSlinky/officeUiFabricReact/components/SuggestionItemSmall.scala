package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionItemSmall {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/SuggestionItemDefault", "SuggestionItemSmall")
  @js.native
  object component extends js.Object
  
  def withProps(p: IPersonaProps): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SuggestionItemSmall.type): SharedBuilder_IPersonaProps1623122195 = new SharedBuilder_IPersonaProps1623122195(js.Array(this.component, js.Dictionary.empty))()
}
