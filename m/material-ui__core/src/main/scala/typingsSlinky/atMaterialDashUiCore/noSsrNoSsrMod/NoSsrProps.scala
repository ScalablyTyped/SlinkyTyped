package typingsSlinky.atMaterialDashUiCore.noSsrNoSsrMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSsrProps extends js.Object {
  var children: TagMod[Any]
  var fallback: js.UndefOr[TagMod[Any]] = js.undefined
}

object NoSsrProps {
  @scala.inline
  def apply(children: TagMod[Any], fallback: TagMod[Any] = null): NoSsrProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

