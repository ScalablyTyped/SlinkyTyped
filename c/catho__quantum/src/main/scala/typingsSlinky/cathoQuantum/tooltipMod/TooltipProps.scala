package typingsSlinky.cathoQuantum.tooltipMod

import slinky.core.TagMod
import typingsSlinky.cathoQuantum.AnonBaseFontSizeColors
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
  var theme: js.UndefOr[AnonBaseFontSizeColors] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any],
    text: String,
    placement: top | right | bottom | left = null,
    theme: AnonBaseFontSizeColors = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

