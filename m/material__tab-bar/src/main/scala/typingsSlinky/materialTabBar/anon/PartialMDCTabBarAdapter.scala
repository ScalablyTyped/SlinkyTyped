package typingsSlinky.materialTabBar.anon

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
@js.native
trait PartialMDCTabBarAdapter extends js.Object {
  var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.native
  var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.native
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.native
  var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.native
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.native
  var getTabDimensionsAtIndex: js.UndefOr[
    js.Function1[
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabDimensions */ _
    ]
  ] = js.native
  var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.native
  var getTabListLength: js.UndefOr[js.Function0[Double]] = js.native
  var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.native
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.native
  var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.native
  var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
}

object PartialMDCTabBarAdapter {
  @scala.inline
  def apply(): PartialMDCTabBarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabBarAdapter]
  }
  @scala.inline
  implicit class PartialMDCTabBarAdapterOps[Self <: PartialMDCTabBarAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateTabAtIndex(value: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateTabAtIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutActivateTabAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateTabAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivateTabAtIndex(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeactivateTabAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateTabAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusTabAtIndex(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTabAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusTabAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTabAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFocusedTabIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedTabIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFocusedTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndexOfTabById(value: /* id */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexOfTabById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetIndexOfTabById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexOfTabById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffsetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOffsetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreviousActiveTabIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousActiveTabIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreviousActiveTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousActiveTabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollContentWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabDimensionsAtIndex(
      value: /* index */ Double => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabDimensions */ _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabDimensionsAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTabDimensionsAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabDimensionsAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabIndicatorClientRectAtIndex(value: /* index */ Double => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndicatorClientRectAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTabIndicatorClientRectAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabIndicatorClientRectAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabListLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabListLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTabListLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabListLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementScroll(value: /* scrollXIncrement */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIncrementScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRTL(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyTabActivated(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTabActivated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyTabActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTabActivated")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: /* scrollX */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveTab(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.undefined)
        ret
    }
  }
  
}

