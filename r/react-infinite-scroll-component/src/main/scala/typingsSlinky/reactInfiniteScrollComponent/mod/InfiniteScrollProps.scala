package typingsSlinky.reactInfiniteScrollComponent.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteScrollProps extends js.Object {
  /**
    * Children component which will be rendered
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Set any custom class you want
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Set the length of the data.This will unlock the subsequent calls to next.
    */
  var dataLength: Double = js.native
  /**
    * This message is shown to the user when they have seen all the records, which means they are at the bottom and hasMore is false
    */
  var endMessage: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Children is by default assumed to be of type array and it's length is used to determine if loader needs to be shown or not,
    * if your children is not an array, specify this prop to tell if your items are 0 or more.
    */
  var hasChildren: js.UndefOr[Boolean] = js.native
  /**
    * It tells the InfiniteScroll component on whether to call next function on reaching the bottom and shows an endMessage to the user
    */
  var hasMore: Boolean = js.native
  /**
    * Give only if you want to have a fixed height scrolling content
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Set a scroll y position for the component to render with.
    */
  var initialScrollY: js.UndefOr[Double] = js.native
  /**
    * You can send a loader component to show while the component waits for the next load of data. e.g. <h3>Loading...</h3> or any fancy loader element
    */
  var loader: TagMod[Any] = js.native
  /**
    * A function that will listen to the scroll event on the scrolling container. Note that the scroll event is throttled, so you may not receive as many events as you would expect.
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * To enable Pull Down to Refresh feature
    */
  var pullDownToRefresh: js.UndefOr[Boolean] = js.native
  /**
    * Any JSX that you want to show the user, default={<h3>Pull down to refresh</h3>}
    */
  var pullDownToRefreshContent: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Minimum distance the user needs to pull down to trigger the refresh, default=100px
    */
  var pullDownToRefreshThreshold: js.UndefOr[Double] = js.native
  /**
    * This function will be called, it should return the fresh data that you want to show the user
    */
  var refreshFunction: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Any JSX that you want to show the user, default={<h3>Release to refresh</h3>}
    */
  var releaseToRefreshContent: js.UndefOr[TagMod[Any]] = js.native
  /**
    * A threshold value defining when InfiniteScroll will call next. Default value is 0.8. It means the next will be called when user comes below 80% of the total height.
    * If you pass threshold in pixels (scrollThreshold="200px"), next will be called once you scroll at least (100% - scrollThreshold) pixels down.
    */
  var scrollThreshold: js.UndefOr[Double | String] = js.native
  /**
    * Reference to a (parent) DOM element that is already providing overflow scrollbars to the InfiniteScroll component.
    * You should provide the id of the DOM node preferably.
    */
  var scrollableTarget: js.UndefOr[TagMod[Any] | String] = js.native
  /**
    * Set any style which you want to override.
    */
  var style: js.UndefOr[js.Any] = js.native
  /**
    * A function which must be called after reaching the bottom. It must trigger some sort of action which fetches the next data.
    * The data is passed as children to the InfiniteScroll component and the data should contain previous items too.
    * e.g. Initial data = [1, 2, 3] and then next load of data should be [1, 2, 3, 4, 5, 6].
    */
  def next(): Unit = js.native
}

object InfiniteScrollProps {
  @scala.inline
  def apply(dataLength: Double, hasMore: Boolean, next: () => Unit): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withEndMessageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndMessage(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: TagMod[Any]): Self = {
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
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPullDownToRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullDownToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPullDownToRefreshContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefreshContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullDownToRefreshContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefreshContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullDownToRefreshContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefreshContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPullDownToRefreshThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefreshThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullDownToRefreshThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownToRefreshThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshFunction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRefreshFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseToRefreshContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseToRefreshContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseToRefreshContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseToRefreshContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseToRefreshContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseToRefreshContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollThreshold(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableTargetReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollableTarget(value: TagMod[Any] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

