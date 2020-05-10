package typingsSlinky.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceModel[S] extends js.Object {
  var interceptResponse: js.UndefOr[
    js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _]
  ] = js.native
  var loading: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  var local: js.UndefOr[js.Function2[/* state */ js.Any, /* repeated */ js.Any, _]] = js.native
  var shouldFetch: js.UndefOr[js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean], Unit]] = js.native
  def error(args: js.Any): Unit = js.native
  def remote(state: js.Any, args: js.Any*): js.Promise[S] = js.native
  def success(state: S): Unit = js.native
}

object SourceModel {
  @scala.inline
  def apply[S](
    error: js.Any => Unit,
    remote: (js.Any, /* repeated */ js.Any) => js.Promise[S],
    success: S => Unit
  ): SourceModel[S] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), remote = js.Any.fromFunction2(remote), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SourceModel[S]]
  }
  @scala.inline
  implicit class SourceModelOps[Self[s] <: SourceModel[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withError(value: js.Any => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemote(value: (js.Any, /* repeated */ js.Any) => js.Promise[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccess(value: S => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterceptResponse(value: (/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any) => _): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptResponse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInterceptResponse: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: /* args */ js.Any => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoading: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: (/* state */ js.Any, /* repeated */ js.Any) => _): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLocal: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFetch(value: /* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean] => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldFetch: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFetch")(js.undefined)
        ret
    }
  }
  
}

