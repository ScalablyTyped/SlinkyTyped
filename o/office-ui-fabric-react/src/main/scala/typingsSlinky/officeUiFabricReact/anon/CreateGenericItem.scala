package typingsSlinky.officeUiFabricReact.anon

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGenericItem extends js.Object {
  
  var createGenericItem: js.Function2[/* name */ String, /* currentValidationState */ ValidationState, IGenericItemkeyKey] = js.native
  
  def onRenderItem(props: IPeoplePickerItemSelectedProps): ReactElement = js.native
  
  def onRenderSuggestionsItem(personaProps: IPersonaProps): ReactElement = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[_]): ReactElement = js.native
}
