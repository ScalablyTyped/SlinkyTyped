package typingsSlinky.materialMenuSurface.anon

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsSlinky.materialMenuSurface.typesMod.MDCMenuPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
@js.native
trait PartialMDCMenuSurfaceAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var getAnchorDimensions: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
  var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.native
  var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.native
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.native
  var isRtl: js.UndefOr[js.Function0[Boolean]] = js.native
  var notifyClose: js.UndefOr[js.Function0[Unit]] = js.native
  var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var saveFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.native
  var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.native
  var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.native
}

object PartialMDCMenuSurfaceAdap {
  @scala.inline
  def apply(): PartialMDCMenuSurfaceAdap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
  }
  @scala.inline
  implicit class PartialMDCMenuSurfaceAdapOps[Self <: PartialMDCMenuSurfaceAdap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnchorDimensions(value: () => ClientRect | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnchorDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnchorDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBodyDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodyDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInnerDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWindowDimensions(value: () => MDCMenuDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowDimensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWindowDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWindowScroll(value: () => MDCMenuPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWindowScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAnchor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasClass(value: /* className */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIsElementInContainer(value: /* el */ Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElementInContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsElementInContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElementInContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRtl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifyClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClose")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifyOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSaveFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxHeight(value: /* height */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosition(value: /* position */ PartialMDCMenuDistance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransformOrigin(value: /* origin */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformOrigin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformOrigin")(js.undefined)
        ret
    }
  }
  
}

