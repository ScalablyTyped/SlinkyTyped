package typingsSlinky.baseui.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
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
@js.native
trait SharedStylePropsArgchildrArrowOffset extends js.Object {
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.native
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.native
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
}

object SharedStylePropsArgchildrArrowOffset {
  @scala.inline
  def apply(): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
  @scala.inline
  implicit class SharedStylePropsArgchildrArrowOffsetOps[Self <: SharedStylePropsArgchildrArrowOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$arrowOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$arrowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$arrowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$arrowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def with$isAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isAnimating")(js.undefined)
        ret
    }
    @scala.inline
    def with$isOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def with$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$placement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$placement")(js.undefined)
        ret
    }
    @scala.inline
    def with$popoverOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$popoverOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$popoverOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$popoverOffset")(js.undefined)
        ret
    }
    @scala.inline
    def with$showArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$showArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$showArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$showArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

