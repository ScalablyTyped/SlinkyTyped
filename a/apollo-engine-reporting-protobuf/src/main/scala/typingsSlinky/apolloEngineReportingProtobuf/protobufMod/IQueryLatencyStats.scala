package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryLatencyStats extends js.Object {
  /** QueryLatencyStats cacheHits */
  var cacheHits: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** QueryLatencyStats forbiddenOperationCount */
  var forbiddenOperationCount: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** QueryLatencyStats persistedQueryHits */
  var persistedQueryHits: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats persistedQueryMisses */
  var persistedQueryMisses: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** QueryLatencyStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** QueryLatencyStats registeredOperationCount */
  var registeredOperationCount: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats requestCount */
  var requestCount: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
  /** QueryLatencyStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.native
}

object IQueryLatencyStats {
  @scala.inline
  def apply(): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryLatencyStats]
  }
  @scala.inline
  implicit class IQueryLatencyStatsOps[Self <: IQueryLatencyStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHits")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheHitsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHits")(null)
        ret
    }
    @scala.inline
    def withCacheLatencyCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLatencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLatencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLatencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLatencyCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLatencyCount")(null)
        ret
    }
    @scala.inline
    def withForbiddenOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenOperationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenOperationCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCount")(null)
        ret
    }
    @scala.inline
    def withLatencyCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLatencyCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latencyCount")(null)
        ret
    }
    @scala.inline
    def withPersistedQueryHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryHits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHits")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryHitsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHits")(null)
        ret
    }
    @scala.inline
    def withPersistedQueryMisses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMisses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryMisses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMisses")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryMissesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMisses")(null)
        ret
    }
    @scala.inline
    def withPrivateCacheTtlCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCacheTtlCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateCacheTtlCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCacheTtlCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateCacheTtlCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCacheTtlCount")(null)
        ret
    }
    @scala.inline
    def withPublicCacheTtlCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicCacheTtlCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicCacheTtlCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicCacheTtlCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicCacheTtlCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicCacheTtlCount")(null)
        ret
    }
    @scala.inline
    def withRegisteredOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOperationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOperationCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCount")(null)
        ret
    }
    @scala.inline
    def withRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(null)
        ret
    }
    @scala.inline
    def withRequestsWithErrorsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestsWithErrorsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestsWithErrorsCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsWithErrorsCount")(null)
        ret
    }
    @scala.inline
    def withRootErrorStats(value: IPathErrorStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootErrorStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootErrorStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootErrorStats")(js.undefined)
        ret
    }
    @scala.inline
    def withRootErrorStatsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootErrorStats")(null)
        ret
    }
  }
  
}

