package typingsSlinky.opentracing

import typingsSlinky.opentracing.libMockUnderscoreTracerMockUnderscoreContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer", JSImport.Namespace)
@js.native
object libMockUnderscoreTracerMod extends js.Object {
  @js.native
  class MockContext protected () extends default {
    def this(span: typingsSlinky.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default) = this()
  }
  
  @js.native
  class MockSpan protected ()
    extends typingsSlinky.opentracing.libMockUnderscoreTracerMockUnderscoreSpanMod.default {
    def this(tracer: typingsSlinky.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod.default) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typingsSlinky.opentracing.libMockUnderscoreTracerMockUnderscoreTracerMod.default
  
}

