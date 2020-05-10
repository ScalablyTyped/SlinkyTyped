package typingsSlinky.reactVirtualized

import slinky.core.TagMod
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps
import typingsSlinky.reactVirtualized.mod.Index
import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsRowLoaded extends js.Object {
  var children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, TagMod[Any]]] = js.native
  var isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]] = js.native
  var loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]] = js.native
  var minimumBatchSize: Validator[Double] = js.native
  var rowCount: Validator[Double] = js.native
  var threshold: Validator[Double] = js.native
}

object AnonIsRowLoaded {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, TagMod[Any]]],
    isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]],
    loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]],
    minimumBatchSize: Validator[Double],
    rowCount: Validator[Double],
    threshold: Validator[Double]
  ): AnonIsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isRowLoaded = isRowLoaded.asInstanceOf[js.Any], loadMoreRows = loadMoreRows.asInstanceOf[js.Any], minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsRowLoaded]
  }
  @scala.inline
  implicit class AnonIsRowLoadedOps[Self <: AnonIsRowLoaded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRowLoaded(value: Validator[js.Function1[/* params */ Index, Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadMoreRows(value: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMoreRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumBatchSize(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

