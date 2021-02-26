package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider
import typingsSlinky.opentelemetryApi.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyTracerMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/ProxyTracer", "ProxyTracer")
  @js.native
  class ProxyTracer protected () extends Tracer {
    def this(_provider: ProxyTracerProvider, name: String) = this()
    def this(_provider: ProxyTracerProvider, name: String, version: String) = this()
    
    var _delegate: js.Any = js.native
    
    /**
      * Try to get a tracer from the proxy tracer provider.
      * If the proxy tracer provider has no delegate, return a noop tracer.
      */
    var _getTracer: js.Any = js.native
    
    var _provider: js.Any = js.native
    
    val name: String = js.native
    
    val version: js.UndefOr[String] = js.native
  }
}
