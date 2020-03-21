package typingsSlinky.antdMobileRn.flexPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.around
import typingsSlinky.antdMobileRn.antdMobileRnStrings.baseline
import typingsSlinky.antdMobileRn.antdMobileRnStrings.between
import typingsSlinky.antdMobileRn.antdMobileRnStrings.center
import typingsSlinky.antdMobileRn.antdMobileRnStrings.column
import typingsSlinky.antdMobileRn.antdMobileRnStrings.end
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nowrap
import typingsSlinky.antdMobileRn.antdMobileRnStrings.row
import typingsSlinky.antdMobileRn.antdMobileRnStrings.start
import typingsSlinky.antdMobileRn.antdMobileRnStrings.stretch
import typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typingsSlinky.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`] = js.undefined
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

