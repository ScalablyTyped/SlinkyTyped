package typingsSlinky.antd.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoButton extends js.Object {
  var goButton: js.UndefOr[TagMod[Any]] = js.undefined
}

object GoButton {
  @scala.inline
  def apply(goButton: TagMod[Any] = null): GoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoButton]
  }
}

