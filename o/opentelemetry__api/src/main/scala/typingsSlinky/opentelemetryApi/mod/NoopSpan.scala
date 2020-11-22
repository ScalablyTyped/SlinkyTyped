package typingsSlinky.opentelemetryApi.mod

import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", "NoopSpan")
@js.native
class NoopSpan ()
  extends typingsSlinky.opentelemetryApi.noopSpanMod.NoopSpan {
  def this(_spanContext: SpanContext) = this()
}
