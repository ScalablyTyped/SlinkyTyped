package typingsSlinky.reactIcofont.mod

import typingsSlinky.reactIcofont.reactIcofontStrings.`10`
import typingsSlinky.reactIcofont.reactIcofontStrings.`180`
import typingsSlinky.reactIcofont.reactIcofontStrings.`1`
import typingsSlinky.reactIcofont.reactIcofontStrings.`270`
import typingsSlinky.reactIcofont.reactIcofontStrings.`2`
import typingsSlinky.reactIcofont.reactIcofontStrings.`3`
import typingsSlinky.reactIcofont.reactIcofontStrings.`4`
import typingsSlinky.reactIcofont.reactIcofontStrings.`5`
import typingsSlinky.reactIcofont.reactIcofontStrings.`6`
import typingsSlinky.reactIcofont.reactIcofontStrings.`7`
import typingsSlinky.reactIcofont.reactIcofontStrings.`8`
import typingsSlinky.reactIcofont.reactIcofontStrings.`90`
import typingsSlinky.reactIcofont.reactIcofontStrings.`9`
import typingsSlinky.reactIcofont.reactIcofontStrings.h
import typingsSlinky.reactIcofont.reactIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcofontProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var flip: js.UndefOr[h | v] = js.undefined
  var icon: String
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
}

object IcofontProps {
  @scala.inline
  def apply(
    icon: String,
    className: String = null,
    flip: h | v = null,
    rotate: `90` | `180` | `270` = null,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` = null,
    spin: js.UndefOr[Boolean] = js.undefined
  ): IcofontProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcofontProps]
  }
}

