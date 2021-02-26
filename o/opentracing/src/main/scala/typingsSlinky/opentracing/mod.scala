package typingsSlinky.opentracing

import typingsSlinky.opentracing.binaryCarrierMod.default
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("opentracing", "BinaryCarrier")
  @js.native
  class BinaryCarrier protected () extends default {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @JSImport("opentracing", "FORMAT_BINARY")
  @js.native
  val FORMAT_BINARY: /* "binary" */ String = js.native
  
  @JSImport("opentracing", "FORMAT_HTTP_HEADERS")
  @js.native
  val FORMAT_HTTP_HEADERS: /* "http_headers" */ String = js.native
  
  @JSImport("opentracing", "FORMAT_TEXT_MAP")
  @js.native
  val FORMAT_TEXT_MAP: /* "text_map" */ String = js.native
  
  @JSImport("opentracing", "MockTracer")
  @js.native
  class MockTracer ()
    extends typingsSlinky.opentracing.mockTracerMod.MockTracer
  
  @JSImport("opentracing", "REFERENCE_CHILD_OF")
  @js.native
  val REFERENCE_CHILD_OF: /* "child_of" */ String = js.native
  
  @JSImport("opentracing", "REFERENCE_FOLLOWS_FROM")
  @js.native
  val REFERENCE_FOLLOWS_FROM: /* "follows_from" */ String = js.native
  
  @JSImport("opentracing", "Reference")
  @js.native
  class Reference protected ()
    extends typingsSlinky.opentracing.referenceMod.default {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.spanContextMod.default) = this()
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.spanMod.default) = this()
  }
  
  @JSImport("opentracing", "Span")
  @js.native
  class Span ()
    extends typingsSlinky.opentracing.spanMod.default
  
  @JSImport("opentracing", "SpanContext")
  @js.native
  class SpanContext ()
    extends typingsSlinky.opentracing.spanContextMod.default
  
  object Tags {
    
    @JSImport("opentracing", "Tags.COMPONENT")
    @js.native
    val COMPONENT: /* "component" */ String = js.native
    
    @JSImport("opentracing", "Tags.DB_INSTANCE")
    @js.native
    val DB_INSTANCE: /* "db.instance" */ String = js.native
    
    @JSImport("opentracing", "Tags.DB_STATEMENT")
    @js.native
    val DB_STATEMENT: /* "db.statement" */ String = js.native
    
    @JSImport("opentracing", "Tags.DB_TYPE")
    @js.native
    val DB_TYPE: /* "db.type" */ String = js.native
    
    @JSImport("opentracing", "Tags.DB_USER")
    @js.native
    val DB_USER: /* "db.user" */ String = js.native
    
    @JSImport("opentracing", "Tags.ERROR")
    @js.native
    val ERROR: /* "error" */ String = js.native
    
    @JSImport("opentracing", "Tags.HTTP_METHOD")
    @js.native
    val HTTP_METHOD: /* "http.method" */ String = js.native
    
    @JSImport("opentracing", "Tags.HTTP_STATUS_CODE")
    @js.native
    val HTTP_STATUS_CODE: /* "http.status_code" */ String = js.native
    
    @JSImport("opentracing", "Tags.HTTP_URL")
    @js.native
    val HTTP_URL: /* "http.url" */ String = js.native
    
    @JSImport("opentracing", "Tags.MESSAGE_BUS_DESTINATION")
    @js.native
    val MESSAGE_BUS_DESTINATION: /* "message_bus.destination" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_ADDRESS")
    @js.native
    val PEER_ADDRESS: /* "peer.address" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_HOSTNAME")
    @js.native
    val PEER_HOSTNAME: /* "peer.hostname" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_HOST_IPV4")
    @js.native
    val PEER_HOST_IPV4: /* "peer.ipv4" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_HOST_IPV6")
    @js.native
    val PEER_HOST_IPV6: /* "peer.ipv6" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_PORT")
    @js.native
    val PEER_PORT: /* "peer.port" */ String = js.native
    
    @JSImport("opentracing", "Tags.PEER_SERVICE")
    @js.native
    val PEER_SERVICE: /* "peer.service" */ String = js.native
    
    @JSImport("opentracing", "Tags.SAMPLING_PRIORITY")
    @js.native
    val SAMPLING_PRIORITY: /* "sampling.priority" */ String = js.native
    
    @JSImport("opentracing", "Tags.SPAN_KIND")
    @js.native
    val SPAN_KIND: /* "span.kind" */ String = js.native
    
    @JSImport("opentracing", "Tags.SPAN_KIND_MESSAGING_CONSUMER")
    @js.native
    val SPAN_KIND_MESSAGING_CONSUMER: /* "consumer" */ String = js.native
    
    @JSImport("opentracing", "Tags.SPAN_KIND_MESSAGING_PRODUCER")
    @js.native
    val SPAN_KIND_MESSAGING_PRODUCER: /* "producer" */ String = js.native
    
    @JSImport("opentracing", "Tags.SPAN_KIND_RPC_CLIENT")
    @js.native
    val SPAN_KIND_RPC_CLIENT: /* "client" */ String = js.native
    
    @JSImport("opentracing", "Tags.SPAN_KIND_RPC_SERVER")
    @js.native
    val SPAN_KIND_RPC_SERVER: /* "server" */ String = js.native
  }
  
  @JSImport("opentracing", "Tracer")
  @js.native
  class Tracer ()
    extends typingsSlinky.opentracing.tracerMod.Tracer
  
  @JSImport("opentracing", "childOf")
  @js.native
  def childOf(spanContext: typingsSlinky.opentracing.spanContextMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
  @JSImport("opentracing", "childOf")
  @js.native
  def childOf(spanContext: typingsSlinky.opentracing.spanMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
  
  @JSImport("opentracing", "followsFrom")
  @js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.spanContextMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
  @JSImport("opentracing", "followsFrom")
  @js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.spanMod.default): typingsSlinky.opentracing.referenceMod.default = js.native
  
  @JSImport("opentracing", "globalTracer")
  @js.native
  def globalTracer(): typingsSlinky.opentracing.tracerMod.default = js.native
  
  @JSImport("opentracing", "initGlobalTracer")
  @js.native
  def initGlobalTracer(tracer: typingsSlinky.opentracing.tracerMod.default): Unit = js.native
}
