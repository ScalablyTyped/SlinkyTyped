package typingsSlinky.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteSpansRequest extends js.Object {
  
  /** Required. A list of new spans. The span names must not match existing spans, or the results are undefined. */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpansVarargs(value: Span*): Self = this.set("spans", js.Array(value :_*))
    
    @scala.inline
    def setSpans(value: js.Array[Span]): Self = this.set("spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpans: Self = this.set("spans", js.undefined)
  }
}
