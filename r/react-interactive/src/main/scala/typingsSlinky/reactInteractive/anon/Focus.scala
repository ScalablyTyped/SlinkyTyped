package typingsSlinky.reactInteractive.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactInteractive.mod.FocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends FocusProps {
  var focus: js.UndefOr[CSSProperties] = js.undefined
}

object Focus {
  @scala.inline
  def apply(focus: CSSProperties = null): Focus = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
}

