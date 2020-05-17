package typingsSlinky.rcSlider.anon

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcTooltip.mod.RCTooltip.Placement
import typingsSlinky.rcTooltip.mod.RCTooltip.Trigger
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-tooltip.rc-tooltip.RCTooltip.Props> */
@js.native
trait PartialProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.native
  var align: js.UndefOr[js.Object] = js.native
  var arrowContent: js.UndefOr[TagMod[Any]] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var defaultVisible: js.UndefOr[Boolean] = js.native
  var destroyTooltipOnHide: js.UndefOr[Boolean] = js.native
  var getTooltipContainer: js.UndefOr[js.Function0[Element]] = js.native
  var id: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  var onPopupAlign: js.UndefOr[js.Function2[/* popupDomNode */ Element, /* align */ js.Object, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.native
  var overlay: js.UndefOr[js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var placement: js.UndefOr[Placement | js.Object] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var ref: js.UndefOr[LegacyRef[_]] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[js.Array[Trigger]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object PartialProps {
  @scala.inline
  def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  @scala.inline
  implicit class PartialPropsOps[Self <: PartialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterVisibleChange(value: /* visible */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(js.undefined)
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
    @scala.inline
    def withDefaultVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyTooltipOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyTooltipOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTooltipContainer(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTooltipContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseLeaveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupAlign(value: (/* popupDomNode */ Element, /* align */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPopupAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibleChange(value: /* visible */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayFunction0(value: () => ReactChild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlay(value: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement | js.Object): Self = {
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
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: LegacyRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: js.Array[Trigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

