package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyBoolean extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: centered | justified | left | right
}

object OnlyBoolean {
  @scala.inline
  def apply(value: centered | justified | left | right, only: js.UndefOr[Boolean] = js.undefined): OnlyBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBoolean]
  }
}

