package typingsSlinky.antdDashMobileDashRn.libFlexPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`column-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`row-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`wrap-reverse`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.around
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.baseline
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.between
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.center
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.column
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.end
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.nowrap
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.row
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.start
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.stretch
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[
    nowrap | typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.wrap | `wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: TagMod[Any] = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

