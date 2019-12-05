package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsDetailsListDetailsRowCheckDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.Anon_IsVisible
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.anySelected
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.canSelect
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.compact
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isHeader
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.selected
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type IDetailsRowCheckStyleProps = (Required[Pick[IDetailsRowCheckProps, theme]]) with (Pick[
    IDetailsRowCheckProps, 
    compact | isHeader | selected | anySelected | canSelect | className
  ]) with Anon_IsVisible
}
