package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", JSImport.Namespace)
@js.native
object extendedPeoplePickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class ExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}

