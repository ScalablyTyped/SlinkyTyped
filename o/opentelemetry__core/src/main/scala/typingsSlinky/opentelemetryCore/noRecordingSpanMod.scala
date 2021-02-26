package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.mod.NoopSpan
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noRecordingSpanMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/NoRecordingSpan", "NoRecordingSpan")
  @js.native
  class NoRecordingSpan protected () extends NoopSpan {
    def this(spanContext: SpanContext) = this()
    
    val _context: js.Any = js.native
  }
}
