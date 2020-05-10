package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Span extends js.Object {
  /**
    * A set of attributes on the span. There is a limit of 32 attributes per
    * span.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * An optional number of child spans that were generated while this span
    * was active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double] = js.native
  /**
    * A description of the span's operation (up to 128 bytes).
    * Stackdriver Trace displays the description in the
    * {% dynamic print site_values.console_name %}.
    * For example, the display name can be a qualified method name or a file name
    * and a line number where the operation is called. A best practice is to use
    * the same display name within an application and at the same call point.
    * This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[TruncatableString] = js.native
  /**
    * The end time of the span. On the client side, this is the time kept by
    * the local machine where the span execution ends. On the server side, this
    * is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.native
  /** A maximum of 128 links are allowed per Span. */
  var links: js.UndefOr[Links] = js.native
  /**
    * The resource name of the span in the following format:
    *
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace within a project.
    * [SPAN_ID] is a unique identifier for a span within a trace,
    * assigned when the span is created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The [SPAN_ID] of this span's parent span. If this is a root span,
    * then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String] = js.native
  /**
    * A highly recommended but not required flag that identifies when a trace
    * crosses a process boundary. True when the parent_span belongs to the
    * same process as the current span.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.native
  /** The [SPAN_ID] portion of the span's resource name. */
  var spanId: js.UndefOr[String] = js.native
  /** Stack trace captured at the start of the span. */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * The start time of the span. On the client side, this is the time kept by
    * the local machine where the span execution starts. On the server side, this
    * is the time when the server's application handler starts running.
    */
  var startTime: js.UndefOr[String] = js.native
  /** An optional final status for this span. */
  var status: js.UndefOr[Status] = js.native
  /**
    * The included time events. There can be up to 32 annotations and 128 network
    * events per span.
    */
  var timeEvents: js.UndefOr[TimeEvents] = js.native
}

object Span {
  @scala.inline
  def apply(): Span = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Span]
  }
  @scala.inline
  implicit class SpanOps[Self <: Span] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildSpanCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSpanCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildSpanCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSpanCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: TruncatableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
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
    def withLinks(value: Links): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
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
    def withSameProcessAsParentSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameProcessAsParentSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameProcessAsParentSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameProcessAsParentSpan")(js.undefined)
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
    def withStackTrace(value: StackTrace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(js.undefined)
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
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeEvents(value: TimeEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEvents")(js.undefined)
        ret
    }
  }
  
}

