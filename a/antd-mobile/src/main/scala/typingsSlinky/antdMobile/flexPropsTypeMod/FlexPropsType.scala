package typingsSlinky.antdMobile.flexPropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.`column-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`row-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.around
import typingsSlinky.antdMobile.antdMobileStrings.baseline
import typingsSlinky.antdMobile.antdMobileStrings.between
import typingsSlinky.antdMobile.antdMobileStrings.center
import typingsSlinky.antdMobile.antdMobileStrings.column
import typingsSlinky.antdMobile.antdMobileStrings.end
import typingsSlinky.antdMobile.antdMobileStrings.nowrap
import typingsSlinky.antdMobile.antdMobileStrings.row
import typingsSlinky.antdMobile.antdMobileStrings.start
import typingsSlinky.antdMobile.antdMobileStrings.stretch
import typingsSlinky.antdMobile.antdMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typingsSlinky.antdMobile.antdMobileStrings.wrap | `wrap-reverse`] = js.undefined
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

