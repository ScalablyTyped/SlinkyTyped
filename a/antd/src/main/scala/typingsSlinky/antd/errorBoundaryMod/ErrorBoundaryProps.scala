package typingsSlinky.antd.errorBoundaryMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBoundaryProps extends js.Object {
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var message: js.UndefOr[TagMod[Any]] = js.undefined
}

object ErrorBoundaryProps {
  @scala.inline
  def apply(description: TagMod[Any] = null, message: TagMod[Any] = null): ErrorBoundaryProps = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryProps]
  }
}

