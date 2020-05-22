package typingsSlinky.materialUiCore.noSsrNoSsrMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSsrProps extends js.Object {
  var children: TagMod[Any] = js.native
  var fallback: js.UndefOr[TagMod[Any]] = js.native
}

object NoSsrProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, fallback: TagMod[Any] = null): NoSsrProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

