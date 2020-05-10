package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactQueryProviderConfig extends BaseQueryOptions {
  @JSName("onError")
  var onError_ReactQueryProviderConfig: js.UndefOr[js.Function2[/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any], Unit]] = js.native
  var onMutate: js.UndefOr[js.Function1[/* variables */ js.Any, js.Promise[_] | _]] = js.native
  var onSettled: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* error */ js.Any | Null, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onSuccess: js.UndefOr[js.Function2[/* data */ js.Any, /* variables */ js.UndefOr[js.Any], Unit]] = js.native
  var queryKeySerializerFn: js.UndefOr[
    js.Function1[
      /* queryKey */ js.UndefOr[
        js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
      ], 
      (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any]
    ]
  ] = js.native
  var refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
  /** Defaults to the value of `suspense` if not defined otherwise */
  var useErrorBoundary: js.UndefOr[Boolean] = js.native
}

object ReactQueryProviderConfig {
  @scala.inline
  def apply(): ReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactQueryProviderConfig]
  }
  @scala.inline
  implicit class ReactQueryProviderConfigOps[Self <: ReactQueryProviderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: (/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMutate(value: /* variables */ js.Any => js.Promise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMutate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSettled(
      value: (/* data */ js.UndefOr[js.Any], /* error */ js.Any | Null, /* snapshotValue */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSettled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: (/* data */ js.Any, /* variables */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryKeySerializerFn(
      value: /* queryKey */ js.UndefOr[
          js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
        ] => (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeySerializerFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryKeySerializerFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryKeySerializerFn")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchAllOnWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchAllOnWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchAllOnWindowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchAllOnWindowFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withUseErrorBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useErrorBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseErrorBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useErrorBoundary")(js.undefined)
        ret
    }
  }
  
}

