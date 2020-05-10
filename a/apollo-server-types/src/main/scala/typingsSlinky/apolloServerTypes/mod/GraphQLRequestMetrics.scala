package typingsSlinky.apolloServerTypes.mod

import typingsSlinky.apolloEngineReportingProtobuf.mod.Trace.QueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestMetrics extends js.Object {
  var captureTraces: js.UndefOr[Boolean] = js.native
  var forbiddenOperation: js.UndefOr[Boolean] = js.native
  var persistedQueryHit: js.UndefOr[Boolean] = js.native
  var persistedQueryRegister: js.UndefOr[Boolean] = js.native
  var queryPlanTrace: js.UndefOr[QueryPlanNode] = js.native
  var registeredOperation: js.UndefOr[Boolean] = js.native
  var responseCacheHit: js.UndefOr[Boolean] = js.native
  var startHrTime: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object GraphQLRequestMetrics {
  @scala.inline
  def apply(): GraphQLRequestMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestMetrics]
  }
  @scala.inline
  implicit class GraphQLRequestMetricsOps[Self <: GraphQLRequestMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureTraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryHit")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistedQueryRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistedQueryRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistedQueryRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryPlanTrace(value: QueryPlanNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlanTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPlanTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlanTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredOperation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCacheHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCacheHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCacheHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCacheHit")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHrTime(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHrTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHrTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHrTime")(js.undefined)
        ret
    }
  }
  
}

