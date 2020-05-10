package typingsSlinky.reactWindowInfiniteLoader.mod

import slinky.core.TagMod
import typingsSlinky.reactWindowInfiniteLoader.AnonOnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteLoaderProps extends js.Object {
  var itemCount: Double = js.native
  var minimumBatchSize: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
  def children(props: AnonOnItemsRendered): TagMod[Any] = js.native
  def isItemLoaded(index: Double): Boolean = js.native
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null = js.native
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: AnonOnItemsRendered => TagMod[Any],
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_] | Null
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
  @scala.inline
  implicit class InfiniteLoaderPropsOps[Self <: InfiniteLoaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: AnonOnItemsRendered => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsItemLoaded(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItemLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadMoreItems(value: (Double, Double) => js.Promise[_] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMinimumBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBatchSize")(js.undefined)
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

