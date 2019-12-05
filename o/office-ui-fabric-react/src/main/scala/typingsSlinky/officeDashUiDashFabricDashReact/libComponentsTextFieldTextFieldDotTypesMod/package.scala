package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTextFieldTextFieldDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Focused
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.autoAdjustHeight
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.borderless
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.inputClassName
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.multiline
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.required
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.resizable
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.underlined
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type ITextFieldStyleProps = (Required[Pick[ITextFieldProps, theme]]) with (Pick[
    ITextFieldProps, 
    className | disabled | inputClassName | required | multiline | borderless | resizable | underlined | autoAdjustHeight
  ]) with Anon_Focused
}
