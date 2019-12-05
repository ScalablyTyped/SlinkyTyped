package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Invalid
  import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type IPeoplePickerItemSelectedStyleProps = (Required[Pick[IPeoplePickerItemSelectedProps, theme]]) with (Pick[IPeoplePickerItemSelectedProps, className | selected | disabled]) with Anon_Invalid
  type IPeoplePickerItemSuggestionStyleProps = (Required[Pick[IPeoplePickerItemSuggestionProps, theme]]) with (Pick[IPeoplePickerItemSuggestionProps, className]) with js.Object
  type IPeoplePickerItemWithMenuProps = IPickerItemProps[IPersonaWithMenu]
}
