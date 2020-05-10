package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pointer from the current span to another span in the same trace or in a
  * different trace. For example, this can be used in batching operations,
  * where a single batch handler processes multiple requests from different
  * traces or when the handler receives a request from a different project.
  */
@js.native
trait SchemaLink extends js.Object {
  /**
    * A set of attributes on the link. You have have up to  32 attributes per
    * link.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  /**
    * The [SPAN_ID] for a span within a trace.
    */
  var spanId: js.UndefOr[String] = js.native
  /**
    * The [TRACE_ID] for a trace within a project.
    */
  var traceId: js.UndefOr[String] = js.native
  /**
    * The relationship of the current span relative to the linked span.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaLink {
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  @scala.inline
  implicit class SchemaLinkOps[Self <: SchemaLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: SchemaAttributes): Self = {
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
    def withTraceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

