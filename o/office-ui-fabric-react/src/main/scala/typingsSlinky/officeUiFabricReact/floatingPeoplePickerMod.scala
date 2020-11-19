package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker
import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", JSImport.Namespace)
@js.native
object floatingPeoplePickerMod extends js.Object {
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  
  @js.native
  class BaseFloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class FloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    
    var defaultProps: js.Any = js.native
  }
  
  type IPeopleFloatingPickerProps = IBaseFloatingPickerProps[IPersonaProps]
}
