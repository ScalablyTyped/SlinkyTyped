package typingsSlinky.opentracing

import typingsSlinky.opentracing.mockSpanMod.MockSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/mock_tracer/mock_report", JSImport.Namespace)
@js.native
object mockReportMod extends js.Object {
  
  @js.native
  class MockReport protected () extends js.Object {
    def this(spans: js.Array[MockSpan]) = this()
    
    var debugSpans: js.Any = js.native
    
    def firstSpanWithTagValue(key: String, `val`: js.Any): MockSpan | Null = js.native
    
    var spans: js.Array[MockSpan] = js.native
    
    var spansByTag: js.Any = js.native
    
    var spansByUUID: js.Any = js.native
    
    var unfinishedSpans: js.Any = js.native
  }
  
  @js.native
  class default protected () extends MockReport {
    def this(spans: js.Array[MockSpan]) = this()
  }
}
