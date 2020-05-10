package typingsSlinky.baseui.layerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
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
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var arrowRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var children: TagMod[Any] = js.native
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var popperRef: js.UndefOr[Ref[HTMLElement]] = js.native
}

object TetherProps {
  @scala.inline
  def apply(): TetherProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TetherProps]
  }
  @scala.inline
  implicit class TetherPropsOps[Self <: TetherProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorRefRefObject(value: ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnchorRef(value: Ref[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(null)
        ret
    }
    @scala.inline
    def withArrowRefRefObject(value: ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArrowRef(value: Ref[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRef")(null)
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
    @scala.inline
    def withOnPopperUpdate(value: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopperUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPopperUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopperUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperRefRefObject(value: ReactRef[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopperRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPopperRef(value: Ref[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(null)
        ret
    }
  }
  
}

