package typingsSlinky.rbx.inputMod

import typingsSlinky.rbx.rbxStrings.color
import typingsSlinky.rbx.rbxStrings.date
import typingsSlinky.rbx.rbxStrings.email
import typingsSlinky.rbx.rbxStrings.focused
import typingsSlinky.rbx.rbxStrings.hovered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.number
import typingsSlinky.rbx.rbxStrings.password
import typingsSlinky.rbx.rbxStrings.search
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.tel
import typingsSlinky.rbx.rbxStrings.text
import typingsSlinky.rbx.rbxStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/elements/form/input", "INPUT_DEFAULTS")
@js.native
object INPUT_DEFAULTS extends js.Object {
  var sizes: js.Tuple3[small, medium, large] = js.native
  var states: js.Tuple2[focused, hovered] = js.native
  var types: js.Tuple9[text, email, tel, password, number, search, color, date, time] = js.native
}

