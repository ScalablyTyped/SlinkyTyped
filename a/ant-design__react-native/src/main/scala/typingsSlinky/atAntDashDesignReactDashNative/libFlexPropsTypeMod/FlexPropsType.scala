package typingsSlinky.atAntDashDesignReactDashNative.libFlexPropsTypeMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`column-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`row-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`wrap-reverse`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.around
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.baseline
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.between
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.column
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.end
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nowrap
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.row
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.start
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.stretch
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap
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
    nowrap | typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap | `wrap-reverse`
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

