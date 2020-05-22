package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var value: centered | justified | left | right
}

object `3` {
  @scala.inline
  def apply(value: centered | justified | left | right): `3` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

