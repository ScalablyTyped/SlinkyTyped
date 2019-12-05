package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPersonaPersonaDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isOutOfOffice
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.presence
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.size
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type IPersonaPresenceStyleProps = (Required[Pick[IPersonaSharedProps, theme]]) with (Pick[IPersonaSharedProps, presence | isOutOfOffice | size]) with (Pick[IPersonaProps, className])
}
