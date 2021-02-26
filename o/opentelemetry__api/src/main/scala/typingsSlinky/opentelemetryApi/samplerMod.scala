package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.attributesMod.Attributes
import typingsSlinky.opentelemetryApi.linkMod.Link
import typingsSlinky.opentelemetryApi.samplingResultMod.SamplingResult
import typingsSlinky.opentelemetryApi.spanContextMod.SpanContext
import typingsSlinky.opentelemetryApi.spanKindMod.SpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samplerMod {
  
  @js.native
  trait Sampler extends StObject {
    
    def shouldSample(
      parentContext: js.UndefOr[scala.Nothing],
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: Attributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
    /**
      * Checks whether span needs to be created and tracked.
      *
      * @param parentContext Parent span context. Typically taken from the wire.
      *     Can be null.
      * @param traceId of the span to be created. It can be different from the
      *     traceId in the {@link SpanContext}. Typically in situations when the
      *     span to be created starts a new trace.
      * @param spanName of the span to be created.
      * @param spanKind of the span to be created.
      * @param attributes Initial set of Attributes for the Span being constructed.
      * @param links Collection of links that will be associated with the Span to
      *     be created. Typically useful for batch operations.
      * @returns a {@link SamplingResult}.
      */
    def shouldSample(
      parentContext: SpanContext,
      traceId: String,
      spanName: String,
      spanKind: SpanKind,
      attributes: Attributes,
      links: js.Array[Link]
    ): SamplingResult = js.native
  }
}
