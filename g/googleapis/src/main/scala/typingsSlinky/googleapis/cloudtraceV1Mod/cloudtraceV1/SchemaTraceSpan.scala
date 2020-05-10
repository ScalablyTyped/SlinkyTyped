package typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A span represents a single timed event within a trace. Spans can be nested
  * and form a trace tree. Often, a trace contains a root span that describes
  * the end-to-end latency of an operation and, optionally, one or more
  * subspans for its suboperations. Spans do not need to be contiguous. There
  * may be gaps between spans in a trace.
  */
@js.native
trait SchemaTraceSpan extends js.Object {
  /**
    * End time of the span in nanoseconds from the UNIX epoch.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Distinguishes between spans generated in a particular context. For
    * example, two spans with the same name may be distinguished using
    * `RPC_CLIENT` and `RPC_SERVER` to identify queueing latency associated
    * with the span.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Collection of labels associated with the span. Label keys must be less
    * than 128 bytes. Label values must be less than 16 kilobytes (10MB for
    * `/stacktrace` values).  Some predefined label keys exist, or you may
    * create your own. When creating your own, we recommend the following
    * formats:  * `/category/product/key` for agents of well-known products
    * (e.g.   `/db/mongodb/read_size`). * `short_host/path/key` for
    * domain-specific keys (e.g.   `foo.com/myproduct/bar`)  Predefined labels
    * include:  *   `/agent` *   `/component` *   `/error/message` *
    * `/error/name` *   `/http/client_city` *   `/http/client_country` *
    * `/http/client_protocol` *   `/http/client_region` *   `/http/host` *
    * `/http/method` *   `/http/path` *   `/http/redirected_url` *
    * `/http/request/size` *   `/http/response/size` *   `/http/route` *
    * `/http/status_code` *   `/http/url` *   `/http/user_agent` *   `/pid` *
    * `/stacktrace` *   `/tid`
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Name of the span. Must be less than 128 bytes. The span name is sanitized
    * and displayed in the Stackdriver Trace tool in the Google Cloud Platform
    * Console. The name may be a method name or some other per-call site name.
    * For the same executable and the same call point, a best practice is to
    * use a consistent name, which makes it easier to correlate cross-trace
    * spans.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the parent span, if any. Optional.
    */
  var parentSpanId: js.UndefOr[String] = js.native
  /**
    * Identifier for the span. Must be a 64-bit integer other than 0 and unique
    * within a trace. For example, `2205310701640571284`.
    */
  var spanId: js.UndefOr[String] = js.native
  /**
    * Start time of the span in nanoseconds from the UNIX epoch.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTraceSpan {
  @scala.inline
  def apply(): SchemaTraceSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTraceSpan]
  }
  @scala.inline
  implicit class SchemaTraceSpanOps[Self <: SchemaTraceSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSpanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSpanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpanId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

