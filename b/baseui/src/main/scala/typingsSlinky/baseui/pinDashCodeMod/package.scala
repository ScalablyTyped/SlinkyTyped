package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinDashCodeMod {
  import typingsSlinky.baseui.Anon_ArgsManageFocus
  import typingsSlinky.baseui.Anon_Input
  import typingsSlinky.baseui.Anon_OverridesPinCodeOverrides
  import typingsSlinky.baseui.baseuiStrings.onChange
  import typingsSlinky.baseui.baseuiStrings.value
  import typingsSlinky.baseui.inputMod.InputOverrides
  import typingsSlinky.baseui.inputMod.InputProps
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PinCodeOverrides = InputOverrides with Anon_Input
  type PinCodeProps = (Omit[InputProps, onChange | value]) with Anon_ArgsManageFocus
  type StatefulPinCodeProps = Partial[PinCodeProps] with StatefulContainerProps with Anon_OverridesPinCodeOverrides
}
