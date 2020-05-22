package typingsSlinky.cathoQuantum.badgeMod

import slinky.core.TagMod
import typingsSlinky.cathoQuantum.anon.Components
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]] | TagMod[Any]] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var skin: js.UndefOr[primary | secondary | success | error | neutral] = js.undefined
  var theme: js.UndefOr[Components] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    skin: primary | secondary | success | error | neutral = null,
    theme: Components = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

