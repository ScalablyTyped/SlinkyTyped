package typingsSlinky.extjs.Ext.layout.boxoverflow

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroller extends IObservable {
  /** [Config Option] (String) */
  var afterCtCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var afterScrollerCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var animateScroll: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var beforeCtCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var beforeScrollerCls: js.UndefOr[String] = js.native
  /** [Method] Returns the current scroll position of the innerCt element
  		* @returns Number The current scroll position
  		*/
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var scrollDuration: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scrollIncrement: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scrollRepeatInterval: js.UndefOr[Double] = js.native
  /** [Method] Scrolls to the given component
  		* @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
  		* @param animate Boolean True to animate the scrolling
  		*/
  var scrollToItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var scrollerCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var wheelIncrement: js.UndefOr[Double] = js.native
}

object IScroller {
  @scala.inline
  def apply(): IScroller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScroller]
  }
  @scala.inline
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCtCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCtCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCtCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCtCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScrollerCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollerCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterScrollerCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollerCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCtCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCtCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeCtCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCtCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeScrollerCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScrollerCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeScrollerCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScrollerCls")(js.undefined)
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
    def withScrollDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollRepeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRepeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollRepeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRepeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToItem(value: (/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScrollToItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToItem")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollerCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollerCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerCls")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelIncrement")(js.undefined)
        ret
    }
  }
  
}

