package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the `BatchWriteSpans` method.
  */
@js.native
trait SchemaBatchWriteSpansRequest extends js.Object {
  /**
    * A list of new spans. The span names must not match existing spans, or the
    * results are undefined.
    */
  var spans: js.UndefOr[js.Array[SchemaSpan]] = js.native
}

object SchemaBatchWriteSpansRequest {
  @scala.inline
  def apply(): SchemaBatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchWriteSpansRequest]
  }
  @scala.inline
  implicit class SchemaBatchWriteSpansRequestOps[Self <: SchemaBatchWriteSpansRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpans(value: js.Array[SchemaSpan]): Self = {
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
  }
  
}

