package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanContext extends js.Object {
  
  /**
    * The resource name of the span. The format is: projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID] [TRACE_ID] is a unique identifier for a trace within a project; it is
    * a 32-character hexadecimal encoding of a 16-byte array.[SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array.
    */
  var spanName: js.UndefOr[String] = js.native
}
object SpanContext {
  
  @scala.inline
  def apply(): SpanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanContext]
  }
  
  @scala.inline
  implicit class SpanContextOps[Self <: SpanContext] (val x: Self) extends AnyVal {
    
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
    def setSpanName(value: String): Self = this.set("spanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanName: Self = this.set("spanName", js.undefined)
  }
}
