package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.tracerMod.Tracer
import typingsSlinky.opentelemetryApi.tracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopTracerProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracerProvider", "NOOP_TRACER_PROVIDER")
  @js.native
  val NOOP_TRACER_PROVIDER: NoopTracerProvider = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracerProvider", "NoopTracerProvider")
  @js.native
  class NoopTracerProvider () extends TracerProvider {
    
    def getTracer(): Tracer = js.native
    def getTracer(_name: js.UndefOr[scala.Nothing], _version: String): Tracer = js.native
  }
}
