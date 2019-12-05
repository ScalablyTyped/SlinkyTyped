package typingsSlinky.atReachTooltip.atReachTooltipMod

import slinky.core.TagMod
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPopupProps extends BaseTooltipProps {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object TooltipPopupProps {
  @scala.inline
  def apply(
    label: TagMod[Any],
    ariaLabel: String = null,
    children: TagMod[Any] = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): TooltipPopupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipPopupProps]
  }
}

