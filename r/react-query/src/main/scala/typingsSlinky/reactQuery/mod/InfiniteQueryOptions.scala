package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteQueryOptions[TResult, TMoreVariable]
  extends QueryOptions[js.Array[TResult]] {
  def getFetchMore(lastPage: TResult, allPages: js.Array[TResult]): TMoreVariable | `false` = js.native
}

object InfiniteQueryOptions {
  @scala.inline
  def apply[TResult, TMoreVariable](getFetchMore: (TResult, js.Array[TResult]) => TMoreVariable | `false`): InfiniteQueryOptions[TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(getFetchMore = js.Any.fromFunction2(getFetchMore))
    __obj.asInstanceOf[InfiniteQueryOptions[TResult, TMoreVariable]]
  }
  @scala.inline
  implicit class InfiniteQueryOptionsOps[Self[tresult, tmorevariable] <: InfiniteQueryOptions[tresult, tmorevariable], TResult, TMoreVariable] (val x: Self[TResult, TMoreVariable]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult, TMoreVariable] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult, TMoreVariable]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResult, TMoreVariable]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResult, TMoreVariable]) with Other]
    @scala.inline
    def withGetFetchMore(value: (TResult, js.Array[TResult]) => TMoreVariable | `false`): Self[TResult, TMoreVariable] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFetchMore")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

