package typingsSlinky.reachTooltip.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends BaseTooltipProps {
  @JSName("children")
  var children_TooltipProps: TagMod[Any]
}

object TooltipProps {
  @scala.inline
  def apply(BaseTooltipProps: BaseTooltipProps, children: TagMod[Any] = null): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

