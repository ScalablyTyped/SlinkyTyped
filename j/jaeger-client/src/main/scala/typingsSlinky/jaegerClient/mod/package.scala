package typingsSlinky.jaegerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def initTracer(
    tracingConfig: typingsSlinky.jaegerClient.mod.TracingConfig,
    tracingOptions: typingsSlinky.jaegerClient.mod.TracingOptions
  ): typingsSlinky.jaegerClient.mod.JaegerTracer = (typingsSlinky.jaegerClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initTracer")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jaegerClient.mod.JaegerTracer]
  
  @scala.inline
  def initTracerFromEnv(
    tracingConfig: typingsSlinky.jaegerClient.mod.TracingConfig,
    tracingOptions: typingsSlinky.jaegerClient.mod.TracingOptions
  ): typingsSlinky.jaegerClient.mod.JaegerTracer = (typingsSlinky.jaegerClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initTracerFromEnv")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jaegerClient.mod.JaegerTracer]
}
