package typingsSlinky.opentracing

import typingsSlinky.opentracing.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockContextMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", JSImport.Default)
  @js.native
  class default protected () extends MockContext {
    def this(span: typingsSlinky.opentracing.mockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", "MockContext")
  @js.native
  class MockContext protected () extends SpanContext {
    def this(span: typingsSlinky.opentracing.mockSpanMod.default) = this()
    
    var _span: js.Any = js.native
    
    def span(): typingsSlinky.opentracing.mockSpanMod.default = js.native
  }
}
