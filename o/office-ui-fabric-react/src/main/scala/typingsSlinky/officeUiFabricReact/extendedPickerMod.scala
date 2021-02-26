package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsSlinky.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPeoplePicker")
  @js.native
  class BaseExtendedPeoplePicker protected ()
    extends typingsSlinky.officeUiFabricReact.extendedPeoplePickerMod.BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPicker")
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "ExtendedPeoplePicker")
  @js.native
  class ExtendedPeoplePicker protected ()
    extends typingsSlinky.officeUiFabricReact.extendedPeoplePickerMod.ExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
}
