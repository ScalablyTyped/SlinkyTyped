package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateOptions[TResult, TVariables] extends js.Object {
  var onError: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.Any, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var onSettled: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[TResult], 
      /* error */ js.Any | Null, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* data */ TResult, /* variables */ TVariables, js.Promise[Unit] | Unit]
  ] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
}

object MutateOptions {
  @scala.inline
  def apply[TResult, TVariables](): MutateOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class MutateOptionsOps[Self[tresult, tvariables] <: MutateOptions[tresult, tvariables], TResult, TVariables] (val x: Self[TResult, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TResult, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TResult, TVariables]) with Other]
    @scala.inline
    def withOnError(
      value: (/* error */ js.Any, /* variables */ TVariables, /* snapshotValue */ js.Any) => js.Promise[Unit] | Unit
    ): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSettled(
      value: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, /* variables */ TVariables, /* snapshotValue */ js.UndefOr[js.Any]) => js.Promise[Unit] | Unit
    ): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSettled: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: (/* data */ TResult, /* variables */ TVariables) => js.Promise[Unit] | Unit): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnError(value: Boolean): Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnError: Self[TResult, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(js.undefined)
        ret
    }
  }
  
}

