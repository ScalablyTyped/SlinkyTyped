package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.AnonAverageItemLength
import typingsSlinky.reactNative.AnonChanged
import typingsSlinky.reactNative.AnonDistanceFromEnd
import typingsSlinky.reactNative.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualizedListWithoutRenderItemProps[ItemT] extends ScrollViewProps {
  /**
    * Rendered when the list is empty. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListEmptyComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  /**
    * Rendered at the bottom of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListFooterComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  /**
    * Rendered at the top of all the items. Can be a React Component Class, a render function, or
    * a rendered element.
    */
  var ListHeaderComponent: js.UndefOr[ReactComponentClass[_] | ReactElement | Null] = js.native
  /**
    * The default accessor functions assume this is an Array<{key: string}> but you can override
    * getItem, getItemCount, and keyExtractor to handle any type of index-based data.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * `debug` will turn on extra logging and visual overlays to aid with debugging both usage and
    * implementation, but with a significant perf hit.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * DEPRECATED: Virtualization provides significant performance and memory optimizations, but fully
    * unmounts react instances that are outside of the render window. You should only need to disable
    * this for debugging purposes.
    */
  var disableVirtualization: js.UndefOr[Boolean] = js.native
  /**
    * A marker property for telling the list to re-render (since it implements `PureComponent`). If
    * any of your `renderItem`, Header, Footer, etc. functions depend on anything outside of the
    * `data` prop, stick it here and treat it immutably.
    */
  var extraData: js.UndefOr[js.Any] = js.native
  /**
    * A generic accessor for extracting an item from any sort of data blob.
    */
  var getItem: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, ItemT]] = js.native
  /**
    * Determines how many items are in the data blob.
    */
  var getItemCount: js.UndefOr[js.Function1[/* data */ js.Any, Double]] = js.native
  var getItemLayout: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, AnonIndex]] = js.native
  /**
    * How many items to render in the initial batch. This should be enough to fill the screen but not
    * much more. Note these items will never be unmounted as part of the windowed rendering in order
    * to improve perceived performance of scroll-to-top actions.
    */
  var initialNumToRender: js.UndefOr[Double] = js.native
  /**
    * Instead of starting at the top with the first item, start at `initialScrollIndex`. This
    * disables the "scroll to top" optimization that keeps the first `initialNumToRender` items
    * always rendered and immediately renders the items starting at this initial index. Requires
    * `getItemLayout` to be implemented.
    */
  var initialScrollIndex: js.UndefOr[Double | Null] = js.native
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[Boolean | Null] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.native
  var listKey: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to render in each incremental render batch. The more rendered at
    * once, the better the fill rate, but responsiveness my suffer because rendering content may
    * interfere with responding to button taps or other interactions.
    */
  var maxToRenderPerBatch: js.UndefOr[Double] = js.native
  var onEndReached: js.UndefOr[(js.Function1[/* info */ AnonDistanceFromEnd, Unit]) | Null] = js.native
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.native
  /**
    * If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality. Make
    * sure to also set the `refreshing` prop correctly.
    */
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.native
  /**
    * Used to handle failures when scrolling to an index that has not been measured yet.
    * Recommended action is to either compute your own offset and `scrollTo` it, or scroll as far
    * as possible and then try again after more items have been rendered.
    */
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AnonAverageItemLength, Unit]] = js.native
  /**
    * Called when the viewability of rows changes, as defined by the
    * `viewabilityConfig` prop.
    */
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ AnonChanged, Unit]) | Null] = js.native
  /**
    * Set this when offset is needed for the loading indicator to show correctly.
    * @platform android
    */
  var progressViewOffset: js.UndefOr[Double] = js.native
  /**
    * Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean | Null] = js.native
  /**
    * Render a custom scroll component, e.g. with a differently styled `RefreshControl`.
    */
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, ReactElement]] = js.native
  /**
    * Amount of time between low-pri item render batches, e.g. for rendering items quite a ways off
    * screen. Similar fill rate/responsiveness tradeoff as `maxToRenderPerBatch`.
    */
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.native
  var viewabilityConfig: js.UndefOr[ViewabilityConfig] = js.native
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.native
  /**
    * Determines the maximum number of items rendered outside of the visible area, in units of
    * visible lengths. So if your list fills the screen, then `windowSize={21}` (the default) will
    * render the visible screen area plus up to 10 screens above and 10 below the viewport. Reducing
    * this number will reduce memory consumption and may improve performance, but will increase the
    * chance that fast scrolling may reveal momentary blank areas of unrendered content.
    */
  var windowSize: js.UndefOr[Double] = js.native
}

object VirtualizedListWithoutRenderItemProps {
  @scala.inline
  def apply[ItemT](): VirtualizedListWithoutRenderItemProps[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualizedListWithoutRenderItemProps[ItemT]]
  }
  @scala.inline
  implicit class VirtualizedListWithoutRenderItemPropsOps[Self[itemt] <: VirtualizedListWithoutRenderItemProps[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withListEmptyComponentReactElement(value: ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEmptyComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEmptyComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEmptyComponent(value: ReactComponentClass[_] | ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListEmptyComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withListEmptyComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEmptyComponent")(null)
        ret
    }
    @scala.inline
    def withListFooterComponentReactElement(value: ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFooterComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFooterComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListFooterComponent(value: ReactComponentClass[_] | ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListFooterComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withListFooterComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListFooterComponent")(null)
        ret
    }
    @scala.inline
    def withListHeaderComponentReactElement(value: ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeaderComponentFunctionComponent(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeaderComponentComponentClass(value: ReactComponentClass[_]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeaderComponent(value: ReactComponentClass[_] | ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListHeaderComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withListHeaderComponentNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListHeaderComponent")(null)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableVirtualization(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableVirtualization: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraData(value: js.Any): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraData: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItem(value: (/* data */ js.Any, /* index */ Double) => ItemT): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItem: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemCount(value: /* data */ js.Any => Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemCount: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemLayout(value: (/* data */ js.Any, /* index */ Double) => AnonIndex): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemLayout: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialNumToRender(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNumToRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialNumToRender: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNumToRender")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScrollIndex(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScrollIndex: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScrollIndexNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollIndex")(null)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertedNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(null)
        ret
    }
    @scala.inline
    def withKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyExtractor: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withListKey(value: String): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListKey: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxToRenderPerBatch(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToRenderPerBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxToRenderPerBatch: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxToRenderPerBatch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndReached(value: /* info */ AnonDistanceFromEnd => Unit): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndReached: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReached")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndReachedNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReached")(null)
        ret
    }
    @scala.inline
    def withOnEndReachedThreshold(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReachedThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEndReachedThreshold: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReachedThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndReachedThresholdNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndReachedThreshold")(null)
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => Unit): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefreshNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(null)
        ret
    }
    @scala.inline
    def withOnScrollToIndexFailed(value: /* info */ AnonAverageItemLength => Unit): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToIndexFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollToIndexFailed: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToIndexFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewableItemsChanged(value: /* info */ AnonChanged => Unit): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewableItemsChanged: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewableItemsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewableItemsChangedNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewableItemsChanged")(null)
        ret
    }
    @scala.inline
    def withProgressViewOffset(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressViewOffset: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressViewOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshing(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshing: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(null)
        ret
    }
    @scala.inline
    def withRenderScrollComponent(value: /* props */ ScrollViewProps => ReactElement): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderScrollComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderScrollComponent: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderScrollComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCellsBatchingPeriod(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCellsBatchingPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCellsBatchingPeriod: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCellsBatchingPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withViewabilityConfig(value: ViewabilityConfig): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewabilityConfig: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfigCallbackPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewabilityConfigCallbackPairs: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfigCallbackPairs")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowSize(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowSize: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowSize")(js.undefined)
        ret
    }
  }
  
}

