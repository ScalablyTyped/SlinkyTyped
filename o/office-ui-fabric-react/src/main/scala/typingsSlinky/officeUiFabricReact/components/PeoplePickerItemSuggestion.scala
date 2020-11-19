package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PeoplePickerItemSuggestion {
  
  @JSImport("office-ui-fabric-react", "PeoplePickerItemSuggestion")
  @js.native
  object component extends js.Object
  
  def withProps(p: IPeoplePickerItemSuggestionProps): SharedBuilder_IPeoplePickerItemSuggestionProps644981553 = new SharedBuilder_IPeoplePickerItemSuggestionProps644981553(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PeoplePickerItemSuggestion.type): SharedBuilder_IPeoplePickerItemSuggestionProps644981553 = new SharedBuilder_IPeoplePickerItemSuggestionProps644981553(js.Array(this.component, js.Dictionary.empty))()
}
