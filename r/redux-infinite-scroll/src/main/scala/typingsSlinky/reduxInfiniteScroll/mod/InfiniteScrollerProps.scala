package typingsSlinky.reduxInfiniteScroll.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteScrollerProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactElement]] = js.native
  var containerHeight: js.UndefOr[Double | String] = js.native
  var elementIsScrollable: js.UndefOr[Boolean] = js.native
  var hasMore: js.UndefOr[Boolean] = js.native
  var holderType: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[ReactElement]] = js.native
  var loader: js.UndefOr[js.Any] = js.native
  var loadingMore: js.UndefOr[Boolean] = js.native
  var showLoader: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  def loadMore(): Unit = js.native
}

object InfiniteScrollerProps {
  @scala.inline
  def apply(loadMore: () => Unit): InfiniteScrollerProps = {
    val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction0(loadMore))
    __obj.asInstanceOf[InfiniteScrollerProps]
  }
  @scala.inline
  implicit class InfiniteScrollerPropsOps[Self <: InfiniteScrollerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadMore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ReactElement]): Self = {
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
    def withContainerHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withElementIsScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementIsScrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementIsScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementIsScrollable")(js.undefined)
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
    def withHolderType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderType")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: js.Any): Self = {
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
    def withLoadingMore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMore")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoader")(js.undefined)
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
  }
  
}

