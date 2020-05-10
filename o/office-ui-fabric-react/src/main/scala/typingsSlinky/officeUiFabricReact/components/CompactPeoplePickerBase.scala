package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CompactPeoplePickerBase {
  @JSImport("office-ui-fabric-react", "CompactPeoplePickerBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IBasePickerProps[IPersonaProps]): SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.CompactPeoplePickerBase] = new SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.CompactPeoplePickerBase](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]
  ): SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.CompactPeoplePickerBase] = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    new SharedBuilder_IPeoplePickerProps158335197[typingsSlinky.officeUiFabricReact.mod.CompactPeoplePickerBase](js.Array(this.component, __props.asInstanceOf[IBasePickerProps[IPersonaProps]]))
  }
}

