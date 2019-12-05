package typingsSlinky.reactDashVirtualized

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Validator
import typingsSlinky.reactDashVirtualized.distEsInfiniteLoaderMod.InfiniteLoaderChildProps
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.Index
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenIsRowLoaded extends js.Object {
  var children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, TagMod[Any]]]
  var isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]]
  var loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]]
  var minimumBatchSize: Validator[Double]
  var rowCount: Validator[Double]
  var threshold: Validator[Double]
}

object Anon_ChildrenIsRowLoaded {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, TagMod[Any]]],
    isRowLoaded: Validator[js.Function1[/* params */ Index, Boolean]],
    loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]],
    minimumBatchSize: Validator[Double],
    rowCount: Validator[Double],
    threshold: Validator[Double]
  ): Anon_ChildrenIsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isRowLoaded = isRowLoaded.asInstanceOf[js.Any], loadMoreRows = loadMoreRows.asInstanceOf[js.Any], minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenIsRowLoaded]
  }
}

