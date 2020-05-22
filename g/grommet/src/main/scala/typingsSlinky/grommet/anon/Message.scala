package typingsSlinky.grommet.anon

import slinky.core.TagMod
import typingsSlinky.grommet.grommetStrings.error
import typingsSlinky.grommet.grommetStrings.info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: js.UndefOr[String | TagMod[Any]] = js.undefined
  var regexp: js.UndefOr[js.Object] = js.undefined
  var status: js.UndefOr[error | info] = js.undefined
}

object Message {
  @scala.inline
  def apply(message: String | TagMod[Any] = null, regexp: js.Object = null, status: error | info = null): Message = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

