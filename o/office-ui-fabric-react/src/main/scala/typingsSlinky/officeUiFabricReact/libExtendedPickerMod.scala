package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/ExtendedPicker", JSImport.Namespace)
@js.native
object libExtendedPickerMod extends js.Object {
  
  @js.native
  class BaseExtendedPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.extendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedPeoplePicker ()
    extends typingsSlinky.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
}
