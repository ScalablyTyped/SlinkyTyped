package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.samplerMod.Sampler
import typingsSlinky.opentelemetryApi.samplingResultMod.SamplingResult
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/trace/sampler/ProbabilitySampler", JSImport.Namespace)
@js.native
object probabilitySamplerMod extends js.Object {
  
  @js.native
  class ProbabilitySampler () extends Sampler {
    def this(_probability: Double) = this()
    
    var _normalize: js.Any = js.native
    
    val _probability: js.Any = js.native
    
    def shouldSample(): SamplingResult = js.native
    def shouldSample(parentContext: SpanContext): SamplingResult = js.native
  }
}
