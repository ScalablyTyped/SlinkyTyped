package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientNameStats extends js.Object {
  /** ClientNameStats cacheHitsPerVersion */
  var cacheHitsPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** ClientNameStats forbiddenOperationCountPerVersion */
  var forbiddenOperationCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** ClientNameStats persistedQueryHitsPerVersion */
  var persistedQueryHitsPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats persistedQueryMissesPerVersion */
  var persistedQueryMissesPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** ClientNameStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.native
  /** ClientNameStats registeredOperationCountPerVersion */
  var registeredOperationCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats requestsCountPerVersion */
  var requestsCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.native
  /** ClientNameStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
  /** ClientNameStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.native
}

object IClientNameStats {
  @scala.inline
  def apply(): IClientNameStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientNameStats]
  }
  @scala.inline
  implicit class IClientNameStatsOps[Self <: IClientNameStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheHitsPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHitsPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHitsPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHitsPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheHitsPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheHitsPerVersion")(null)
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
    def withForbiddenOperationCountPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCountPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenOperationCountPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCountPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenOperationCountPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperationCountPerVersion")(null)
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
    def withPersistedQueryHitsPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHitsPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryHitsPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHitsPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryHitsPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHitsPerVersion")(null)
        ret
    }
    @scala.inline
    def withPersistedQueryMissesPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMissesPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryMissesPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMissesPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryMissesPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryMissesPerVersion")(null)
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
    def withRegisteredOperationCountPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCountPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOperationCountPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCountPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOperationCountPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperationCountPerVersion")(null)
        ret
    }
    @scala.inline
    def withRequestsCountPerVersion(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsCountPerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestsCountPerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsCountPerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestsCountPerVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsCountPerVersion")(null)
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

