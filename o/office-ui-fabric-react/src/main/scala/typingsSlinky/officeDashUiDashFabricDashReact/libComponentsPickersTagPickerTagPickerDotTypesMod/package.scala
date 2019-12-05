package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPickersTagPickerTagPickerDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type ITagItemStyleProps = (Required[Pick[ITagItemProps, theme]]) with (Pick[ITagItemProps, className | selected | disabled]) with js.Object
  type ITagItemSuggestionStyleProps = (Required[Pick[ITagItemSuggestionProps, theme]]) with (Pick[ITagItemSuggestionProps, className]) with js.Object
  type ITagPickerProps = IBasePickerProps[ITag]
}
