package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQueryOptions extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.native
  /**
    * Set this to `true` to disable automatic refetching when the query mounts or changes query keys.
    * To refetch the query, use the `refetch` method returned from the `useQuery` instance.
    */
  var manual: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var refetchInterval: js.UndefOr[`false` | Double] = js.native
  var refetchIntervalInBackground: js.UndefOr[Boolean] = js.native
  var refetchOnMount: js.UndefOr[Boolean] = js.native
  var refetchOnWindowFocus: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, failed queries will not retry by default.
    * If `true`, failed queries will retry infinitely.
    * If set to an integer number, e.g. 3, failed queries will retry until the failed query count meets that number.
    */
  var retry: js.UndefOr[Boolean | Double] = js.native
  var retryDelay: js.UndefOr[js.Function1[/* retryAttempt */ Double, Double]] = js.native
  var staleTime: js.UndefOr[Double] = js.native
  var suspense: js.UndefOr[Boolean] = js.native
}

object BaseQueryOptions {
  @scala.inline
  def apply(): BaseQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseQueryOptions]
  }
  @scala.inline
  implicit class BaseQueryOptionsOps[Self <: BaseQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchInterval(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchIntervalInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchIntervalInBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchIntervalInBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchIntervalInBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchOnWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchOnWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchOnWindowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchOnWindowFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelay(value: /* retryAttempt */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStaleTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspense")(js.undefined)
        ret
    }
  }
  
}

