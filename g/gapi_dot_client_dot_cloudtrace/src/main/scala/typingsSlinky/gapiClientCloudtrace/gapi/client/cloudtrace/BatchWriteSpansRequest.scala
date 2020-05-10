package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteSpansRequest extends js.Object {
  /** A collection of spans. */
  var spans: js.UndefOr[js.Array[Span]] = js.native
}

object BatchWriteSpansRequest {
  @scala.inline
  def apply(): BatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteSpansRequest]
  }
  @scala.inline
  implicit class BatchWriteSpansRequestOps[Self <: BatchWriteSpansRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpans(value: js.Array[Span]): Self = {
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

