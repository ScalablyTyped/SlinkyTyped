package typingsSlinky.opentracing

import typingsSlinky.opentracing.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentracing/lib/mock_tracer/mock_context", JSImport.Namespace)
@js.native
object mockContextMod extends js.Object {
  
  @js.native
  class MockContext protected () extends SpanContext {
    def this(span: typingsSlinky.opentracing.mockSpanMod.default) = this()
    
    var _span: js.Any = js.native
    
    def span(): typingsSlinky.opentracing.mockSpanMod.default = js.native
  }
  
  @js.native
  class default protected () extends MockContext {
    def this(span: typingsSlinky.opentracing.mockSpanMod.default) = this()
  }
}
