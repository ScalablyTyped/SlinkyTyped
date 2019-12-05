package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  import typingsSlinky.baseui.Anon_ClearIcon

  type InputOverrides = BaseInputOverrides[SharedProps] with Anon_ClearIcon
  type StatefulInputProps = InputProps with StatefulContainerProps with js.Object
}
