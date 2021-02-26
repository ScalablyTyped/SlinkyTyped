package typingsSlinky.opentracing

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockSpanMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_span", JSImport.Default)
  @js.native
  class default protected () extends MockSpan {
    def this(tracer: typingsSlinky.opentracing.mockTracerMockTracerMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_span", "MockSpan")
  @js.native
  class MockSpan protected () extends Span {
    def this(tracer: typingsSlinky.opentracing.mockTracerMockTracerMod.default) = this()
    
    var _finishMs: Double = js.native
    
    var _generateUUID: js.Any = js.native
    
    var _logs: js.Any = js.native
    
    var _mockTracer: js.Any = js.native
    
    var _operationName: js.Any = js.native
    
    var _startMs: js.Any = js.native
    
    var _startStack: js.UndefOr[String] = js.native
    
    var _tags: js.Any = js.native
    
    var _uuid: js.Any = js.native
    
    def addReference(ref: typingsSlinky.opentracing.referenceMod.default): Unit = js.native
    
    /**
      * Returns a simplified object better for console.log()'ing.
      */
    def debug(): DebugInfo = js.native
    
    def durationMs(): Double = js.native
    
    def operationName(): String = js.native
    
    def tags(): StringDictionary[js.Any] = js.native
    
    def uuid(): String = js.native
  }
  
  @js.native
  trait DebugInfo extends StObject {
    
    var millis: js.Tuple3[Double, Double, Double] = js.native
    
    var operation: String = js.native
    
    var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var uuid: String = js.native
  }
  object DebugInfo {
    
    @scala.inline
    def apply(millis: js.Tuple3[Double, Double, Double], operation: String, uuid: String): DebugInfo = {
      val __obj = js.Dynamic.literal(millis = millis.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugInfo]
    }
    
    @scala.inline
    implicit class DebugInfoMutableBuilder[Self <: DebugInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMillis(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[js.Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
