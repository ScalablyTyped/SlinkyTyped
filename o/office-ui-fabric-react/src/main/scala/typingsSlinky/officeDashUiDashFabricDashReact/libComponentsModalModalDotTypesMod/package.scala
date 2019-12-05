package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsModalModalDotTypesMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.Anon_HasBeenOpened
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.containerClassName
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.isModeless
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.scrollableContentClassName
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.theme
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.topOffsetFixed
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type IModalStyleProps = (Required[Pick[IModalProps, theme]]) with (Pick[
    IModalProps, 
    className | containerClassName | scrollableContentClassName | topOffsetFixed | isModeless
  ]) with Anon_HasBeenOpened
}
