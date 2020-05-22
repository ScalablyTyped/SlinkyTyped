package typingsSlinky.cathoQuantum.tooltipMod

import slinky.core.TagMod
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.bottom
import typingsSlinky.cathoQuantum.cathoQuantumStrings.left
import typingsSlinky.cathoQuantum.cathoQuantumStrings.right
import typingsSlinky.cathoQuantum.cathoQuantumStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any]
  var placement: js.UndefOr[top | right | bottom | left] = js.undefined
  var text: String
  var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    text: String,
    children: js.Array[TagMod[Any]] | TagMod[Any] = null,
    placement: top | right | bottom | left = null,
    theme: BaseFontSizeColors = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

