package typingsSlinky.antdDashMobile.libFlexPropsTypeMod

import typingsSlinky.antdDashMobile.antdDashMobileStrings.`column-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`row-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`wrap-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.around
import typingsSlinky.antdDashMobile.antdDashMobileStrings.baseline
import typingsSlinky.antdDashMobile.antdDashMobileStrings.between
import typingsSlinky.antdDashMobile.antdDashMobileStrings.center
import typingsSlinky.antdDashMobile.antdDashMobileStrings.column
import typingsSlinky.antdDashMobile.antdDashMobileStrings.end
import typingsSlinky.antdDashMobile.antdDashMobileStrings.nowrap
import typingsSlinky.antdDashMobile.antdDashMobileStrings.row
import typingsSlinky.antdDashMobile.antdDashMobileStrings.start
import typingsSlinky.antdDashMobile.antdDashMobileStrings.stretch
import typingsSlinky.antdDashMobile.antdDashMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[
    nowrap | typingsSlinky.antdDashMobile.antdDashMobileStrings.wrap | `wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

