package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsSpinButtonSpinButtonMod {
  import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSpinButtonSpinButtonDotTypesMod.ISpinButtonProps
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.decrementButtonIcon
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disabled
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.incrementButtonIcon
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.label
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.labelPosition
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.max
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.min
  import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.step
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Required

  type DefaultProps = Required[
    Pick[
      ISpinButtonProps, 
      step | min | max | disabled | labelPosition | label | incrementButtonIcon | decrementButtonIcon
    ]
  ]
}
