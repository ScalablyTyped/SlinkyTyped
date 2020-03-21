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
  def apply(BaseTooltipProps: BaseTooltipProps, children: TagMod[Any]): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    __obj.asInstanceOf[TooltipProps]
  }
}

