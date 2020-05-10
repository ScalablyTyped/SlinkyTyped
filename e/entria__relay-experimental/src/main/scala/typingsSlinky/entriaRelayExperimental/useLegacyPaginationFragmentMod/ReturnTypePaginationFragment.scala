package typingsSlinky.entriaRelayExperimental.useLegacyPaginationFragmentMod

import typingsSlinky.entriaRelayExperimental.AnonOnComplete
import typingsSlinky.entriaRelayExperimental.useLoadMoreFunctionMod.LoadMoreFn
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData = js.native
  var hasNext: Boolean = js.native
  var hasPrevious: Boolean = js.native
  var isLoadingNext: Boolean = js.native
  var isLoadingPrevious: Boolean = js.native
  var loadNext: LoadMoreFn = js.native
  var loadPrevious: LoadMoreFn = js.native
  var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
}

object ReturnTypePaginationFragment {
  @scala.inline
  def apply[TQuery, TKey, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    isLoadingNext: Boolean,
    isLoadingPrevious: Boolean,
    loadNext: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => Disposable,
    loadPrevious: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => Disposable,
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnTypePaginationFragment[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePaginationFragment[TQuery, TKey, TFragmentData]]
  }
  @scala.inline
  implicit class ReturnTypePaginationFragmentOps[Self[tquery, tkey, tfragmentdata] <: ReturnTypePaginationFragment[tquery, tkey, tfragmentdata], TQuery, TKey, TFragmentData] (val x: Self[TQuery, TKey, TFragmentData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TQuery, TKey, TFragmentData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TQuery, TKey, TFragmentData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TQuery, TKey, TFragmentData]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TQuery, TKey, TFragmentData]) with Other]
    @scala.inline
    def withData(value: TFragmentData): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNext(value: Boolean): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevious(value: Boolean): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoadingNext(value: Boolean): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoadingPrevious(value: Boolean): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoadingPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => Disposable): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => Disposable): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevious")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self[TQuery, TKey, TFragmentData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

