package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.IExtendedPeoplePickerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ExtendedPicker", JSImport.Namespace)
@js.native
object libExtendedPickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedPeoplePicker ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
}

