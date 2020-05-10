package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MemberListPeoplePicker {
  @JSImport("office-ui-fabric-react", "MemberListPeoplePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: IBasePickerProps[IPersonaProps]): SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.MemberListPeoplePicker] = new SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.MemberListPeoplePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]
  ): SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.MemberListPeoplePicker] = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    new SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.MemberListPeoplePicker](js.Array(this.component, __props.asInstanceOf[IBasePickerProps[IPersonaProps]]))
  }
}

