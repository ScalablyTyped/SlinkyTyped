package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions[TResult] extends BaseQueryOptions {
  var initialData: js.UndefOr[TResult | js.Function0[js.UndefOr[TResult]]] = js.native
  var onSettled: js.UndefOr[js.Function2[/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function1[/* data */ TResult, Unit]] = js.native
}

object QueryOptions {
  @scala.inline
  def apply[TResult](): QueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions[TResult]]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self[tresult] <: QueryOptions[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withInitialDataFunction0(value: () => js.UndefOr[TResult]): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialData(value: TResult | js.Function0[js.UndefOr[TResult]]): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialData: Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSettled(value: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null) => Unit): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSettled: Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: /* data */ TResult => Unit): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
  }
  
}

