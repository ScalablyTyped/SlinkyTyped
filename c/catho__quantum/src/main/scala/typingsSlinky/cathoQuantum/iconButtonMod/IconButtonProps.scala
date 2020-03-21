package typingsSlinky.cathoQuantum.iconButtonMod

import typingsSlinky.cathoQuantum.AnonSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.undefined
  var theme: js.UndefOr[AnonSpacing] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    size: xsmall | small | medium | large | xlarge = null,
    skin: neutral | primary | secondary | success | warning | error = null,
    theme: AnonSpacing = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

