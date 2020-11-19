package typingsSlinky.jaegerClient.mod

import typingsSlinky.opentracing.tracerMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jaeger-client", "JaegerTracer")
@js.native
class JaegerTracer () extends Tracer {
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  def registerExtractor(format: String, extractor: Extractor): Unit = js.native
  
  def registerInjector(format: String, injector: Injector): Unit = js.native
}
