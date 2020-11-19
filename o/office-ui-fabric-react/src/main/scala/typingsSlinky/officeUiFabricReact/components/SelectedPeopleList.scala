package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectedPeopleList {
  
  @JSImport("office-ui-fabric-react", "SelectedPeopleList")
  @js.native
  object component extends js.Object
  
  def withProps(p: ISelectedPeopleProps): SharedBuilder_ISelectedPeopleProps528717756[typingsSlinky.officeUiFabricReact.mod.SelectedPeopleList] = new SharedBuilder_ISelectedPeopleProps528717756[typingsSlinky.officeUiFabricReact.mod.SelectedPeopleList](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SelectedPeopleList.type): SharedBuilder_ISelectedPeopleProps528717756[typingsSlinky.officeUiFabricReact.mod.SelectedPeopleList] = new SharedBuilder_ISelectedPeopleProps528717756[typingsSlinky.officeUiFabricReact.mod.SelectedPeopleList](js.Array(this.component, js.Dictionary.empty))()
}
