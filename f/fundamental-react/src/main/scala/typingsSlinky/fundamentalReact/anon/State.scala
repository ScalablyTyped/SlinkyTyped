package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.fundamentalReactStrings.error
import typingsSlinky.fundamentalReact.fundamentalReactStrings.information
import typingsSlinky.fundamentalReact.fundamentalReactStrings.success
import typingsSlinky.fundamentalReact.fundamentalReactStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: js.UndefOr[error | warning | information | success] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object State {
  @scala.inline
  def apply(state: error | warning | information | success = null, text: String = null): State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

