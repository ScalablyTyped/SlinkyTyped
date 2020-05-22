package typingsSlinky.reactRelay.useBlockingPaginationFragmentMod

import typingsSlinky.reactRelay.anon.OnComplete
import typingsSlinky.reactRelay.useLoadMoreFunctionMod.LoadMoreFn
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Options
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnType[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData
  var hasNext: Boolean
  var hasPrevious: Boolean
  var loadNext: LoadMoreFn
  var loadPrevious: LoadMoreFn
  var refetch: RefetchFnDynamic[TQuery, TKey, Options]
}

object ReturnType {
  @scala.inline
  def apply[TQuery, TKey, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
    loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnType[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnType[TQuery, TKey, TFragmentData]]
  }
}

