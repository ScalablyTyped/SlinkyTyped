package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FloatingPeoplePicker {
  @JSImport("office-ui-fabric-react", "FloatingPeoplePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: IBaseFloatingPickerProps[IPersonaProps]): SharedBuilder_IPeopleFloatingPickerProps212491139[typingsSlinky.officeUiFabricReact.mod.FloatingPeoplePicker] = new SharedBuilder_IPeopleFloatingPickerProps212491139[typingsSlinky.officeUiFabricReact.mod.FloatingPeoplePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | Null | js.Thenable[js.Array[IPersonaProps]],
    suggestionsStore: SuggestionsStore[IPersonaProps]
  ): SharedBuilder_IPeopleFloatingPickerProps212491139[typingsSlinky.officeUiFabricReact.mod.FloatingPeoplePicker] = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions), suggestionsStore = suggestionsStore.asInstanceOf[js.Any])
    new SharedBuilder_IPeopleFloatingPickerProps212491139[typingsSlinky.officeUiFabricReact.mod.FloatingPeoplePicker](js.Array(this.component, __props.asInstanceOf[IBaseFloatingPickerProps[IPersonaProps]]))
  }
}

