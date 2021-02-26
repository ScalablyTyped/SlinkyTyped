package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker
import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "BaseExtendedPeoplePicker")
  @js.native
  class BaseExtendedPeoplePicker protected () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps] {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "ExtendedPeoplePicker")
  @js.native
  class ExtendedPeoplePicker protected () extends BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}
