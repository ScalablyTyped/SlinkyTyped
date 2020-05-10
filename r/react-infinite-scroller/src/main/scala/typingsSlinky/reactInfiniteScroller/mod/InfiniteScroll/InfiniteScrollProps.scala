package typingsSlinky.reactInfiniteScroller.mod.InfiniteScroll

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <InfiniteScroll /> properties.
  */
@js.native
trait InfiniteScrollProps
  extends AllHTMLAttributes[typingsSlinky.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll]
     with ClassAttributes[typingsSlinky.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] {
  /**
    * Name of the element that the component should render as.
    * Defaults to 'div'.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
    */
  var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.native
  /**
    * Whether there are more items to be loaded. Event listeners are removed if false.
    * Defaults to false.
    */
  var hasMore: js.UndefOr[Boolean] = js.native
  /**
    * Whether the component should load the first set of items.
    * Defaults to true.
    */
  var initialLoad: js.UndefOr[Boolean] = js.native
  /**
    * Whether new items should be loaded when user scrolls to the top of the scrollable area.
    * Default to false.
    */
  var isReverse: js.UndefOr[Boolean] = js.native
  /**
    * Loader component for indicating "loading more".
    */
  var loader: js.UndefOr[ReactElement] = js.native
  /**
    * The number of the first page to load, with the default of 0, the first page is 1.
    * Defaults to 0.
    */
  var pageStart: js.UndefOr[Double] = js.native
  /**
    * The distance in pixels before the end of the items that will trigger a call to loadMore.
    * Defaults to 250.
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    * Proxy to the useCapture option of the added event listeners.
    * Defaults to false.
    */
  var useCapture: js.UndefOr[Boolean] = js.native
  /**
    * Add scroll listeners to the window, or else, the component's parentNode.
    * Defaults to true.
    */
  var useWindow: js.UndefOr[Boolean] = js.native
  /**
    * A callback for when more items are requested by the user.
    * Page param is next page index.
    */
  def loadMore(page: Double): Unit = js.native
}

object InfiniteScrollProps {
  @scala.inline
  def apply(loadMore: Double => Unit): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction1(loadMore))
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadMore(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollParent(value: () => HTMLElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollParent")(js.undefined)
        ret
    }
    @scala.inline
    def withHasMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withPageStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStart")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWindow")(js.undefined)
        ret
    }
  }
  
}

