package typingsSlinky.baseui.anon

import slinky.core.TagMod
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.popoverMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children ? :react.react.ReactNode} */
trait SharedStylePropsArgchildrArrowOffset extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.undefined
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object SharedStylePropsArgchildrArrowOffset {
  @scala.inline
  def apply(
    $arrowOffset: Offset = null,
    $isAnimating: js.UndefOr[Boolean] = js.undefined,
    $isOpen: js.UndefOr[Boolean] = js.undefined,
    $placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    $popoverOffset: Offset = null,
    $showArrow: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null
  ): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    if ($arrowOffset != null) __obj.updateDynamic("$arrowOffset")($arrowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($isAnimating)) __obj.updateDynamic("$isAnimating")($isAnimating.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen.get.asInstanceOf[js.Any])
    if ($placement != null) __obj.updateDynamic("$placement")($placement.asInstanceOf[js.Any])
    if ($popoverOffset != null) __obj.updateDynamic("$popoverOffset")($popoverOffset.asInstanceOf[js.Any])
    if (!js.isUndefined($showArrow)) __obj.updateDynamic("$showArrow")($showArrow.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
}

