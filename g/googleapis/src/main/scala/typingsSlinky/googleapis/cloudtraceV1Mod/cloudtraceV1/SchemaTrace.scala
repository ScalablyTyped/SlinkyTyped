package typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A trace describes how long it takes for an application to perform an
  * operation. It consists of a set of spans, each of which represent a single
  * timed event within the operation.
  */
@js.native
trait SchemaTrace extends js.Object {
  /**
    * Project ID of the Cloud project where the trace data is stored.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Collection of spans in the trace.
    */
  var spans: js.UndefOr[js.Array[SchemaTraceSpan]] = js.native
  /**
    * Globally unique identifier for the trace. This identifier is a 128-bit
    * numeric value formatted as a 32-byte hex string. For example,
    * `382d4f4c6b7bb2f4a972559d9085001d`.
    */
  var traceId: js.UndefOr[String] = js.native
}

object SchemaTrace {
  @scala.inline
  def apply(): SchemaTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrace]
  }
  @scala.inline
  implicit class SchemaTraceOps[Self <: SchemaTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpans(value: js.Array[SchemaTraceSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(js.undefined)
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
  }
  
}

