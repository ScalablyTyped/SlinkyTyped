package typingsSlinky.opentracing

import typingsSlinky.opentracing.mockContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer", JSImport.Namespace)
@js.native
object mockTracerMod extends js.Object {
  @js.native
  class MockContext protected () extends default {
    def this(span: typingsSlinky.opentracing.mockSpanMod.default) = this()
  }
  
  @js.native
  class MockSpan protected ()
    extends typingsSlinky.opentracing.mockSpanMod.default {
    def this(tracer: typingsSlinky.opentracing.mockTracerMockTracerMod.default) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typingsSlinky.opentracing.mockTracerMockTracerMod.default
  
}

