package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsSlinky.cassandraDriver.typesMod.types.Long
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var autoPage: js.UndefOr[Boolean] = js.native
  var captureStackTrace: js.UndefOr[Boolean] = js.native
  var consistency: js.UndefOr[Double] = js.native
  var counter: js.UndefOr[Boolean] = js.native
  var customPayload: js.UndefOr[js.Any] = js.native
  var executionProfile: js.UndefOr[String | ExecutionProfile] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var hints: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  var host: js.UndefOr[Host] = js.native
  var isIdempotent: js.UndefOr[Boolean] = js.native
  var keyspace: js.UndefOr[String] = js.native
  var logged: js.UndefOr[Boolean] = js.native
  var pageState: js.UndefOr[Buffer | String] = js.native
  var prepare: js.UndefOr[Boolean] = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var routingIndexes: js.UndefOr[js.Array[Double]] = js.native
  var routingKey: js.UndefOr[Buffer | js.Array[Buffer]] = js.native
  var routingNames: js.UndefOr[js.Array[String]] = js.native
  var serialConsistency: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double | Long] = js.native
  var traceQuery: js.UndefOr[Boolean] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPage")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withConsistency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionProfile(value: String | ExecutionProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdempotent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdempotent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdempotent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdempotent")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace")(js.undefined)
        ret
    }
    @scala.inline
    def withLogged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageState(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageState")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryPolicy): Self = {
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
    def withRoutingIndexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingKey(value: Buffer | js.Array[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialConsistency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialConsistency")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceQuery")(js.undefined)
        ret
    }
  }
  
}

