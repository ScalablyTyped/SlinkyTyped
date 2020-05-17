package typingsSlinky.materialTabScroller.anon

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
@js.native
trait PartialMDCTabScrollerAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.native
  var computeScrollAreaClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var computeScrollContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var eventTargetMatchesSelector: js.UndefOr[js.Function2[/* evtTarget */ EventTarget, /* selector */ String, Boolean]] = js.native
  var getScrollAreaOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  var getScrollAreaScrollLeft: js.UndefOr[js.Function0[Double]] = js.native
  var getScrollContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  var getScrollContentStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setScrollAreaScrollLeft: js.UndefOr[js.Function1[/* scrollLeft */ Double, Unit]] = js.native
  var setScrollAreaStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
  var setScrollContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCTabScrollerAdap {
  @scala.inline
  def apply(): PartialMDCTabScrollerAdap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabScrollerAdap]
  }
  @scala.inline
  implicit class PartialMDCTabScrollerAdapOps[Self <: PartialMDCTabScrollerAdap] (val x: Self) extends AnyVal {
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
    def withAddScrollAreaClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addScrollAreaClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddScrollAreaClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addScrollAreaClass")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeHorizontalScrollbarHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHorizontalScrollbarHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComputeHorizontalScrollbarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHorizontalScrollbarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeScrollAreaClientRect(value: () => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeScrollAreaClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComputeScrollAreaClientRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeScrollAreaClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeScrollContentClientRect(value: () => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeScrollContentClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComputeScrollContentClientRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeScrollContentClientRect")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTargetMatchesSelector(value: (/* evtTarget */ EventTarget, /* selector */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTargetMatchesSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEventTargetMatchesSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTargetMatchesSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollAreaOffsetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollAreaOffsetWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollAreaOffsetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollAreaOffsetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollAreaScrollLeft(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollAreaScrollLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollAreaScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollAreaScrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollContentOffsetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentOffsetWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollContentOffsetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentOffsetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollContentStyleValue(value: /* propertyName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentStyleValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetScrollContentStyleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollContentStyleValue")(js.undefined)
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
    def withSetScrollAreaScrollLeft(value: /* scrollLeft */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollAreaScrollLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScrollAreaScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollAreaScrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollAreaStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollAreaStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetScrollAreaStyleProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollAreaStyleProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollContentStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetScrollContentStyleProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollContentStyleProperty")(js.undefined)
        ret
    }
  }
  
}

