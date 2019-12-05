package typingsSlinky.opentracing

import typingsSlinky.opentracing.libBinaryUnderscoreCarrierMod.default
import typingsSlinky.opentracing.opentracingStrings.binary
import typingsSlinky.opentracing.opentracingStrings.child_of
import typingsSlinky.opentracing.opentracingStrings.client
import typingsSlinky.opentracing.opentracingStrings.component
import typingsSlinky.opentracing.opentracingStrings.consumer
import typingsSlinky.opentracing.opentracingStrings.dbDOTinstance
import typingsSlinky.opentracing.opentracingStrings.dbDOTstatement
import typingsSlinky.opentracing.opentracingStrings.dbDOTtype
import typingsSlinky.opentracing.opentracingStrings.dbDOTuser
import typingsSlinky.opentracing.opentracingStrings.error
import typingsSlinky.opentracing.opentracingStrings.follows_from
import typingsSlinky.opentracing.opentracingStrings.httpDOTmethod
import typingsSlinky.opentracing.opentracingStrings.httpDOTstatus_code
import typingsSlinky.opentracing.opentracingStrings.httpDOTurl
import typingsSlinky.opentracing.opentracingStrings.http_headers
import typingsSlinky.opentracing.opentracingStrings.message_busDOTdestination
import typingsSlinky.opentracing.opentracingStrings.peerDOTaddress
import typingsSlinky.opentracing.opentracingStrings.peerDOThostname
import typingsSlinky.opentracing.opentracingStrings.peerDOTipv4
import typingsSlinky.opentracing.opentracingStrings.peerDOTipv6
import typingsSlinky.opentracing.opentracingStrings.peerDOTport
import typingsSlinky.opentracing.opentracingStrings.peerDOTservice
import typingsSlinky.opentracing.opentracingStrings.producer
import typingsSlinky.opentracing.opentracingStrings.samplingDOTpriority
import typingsSlinky.opentracing.opentracingStrings.server
import typingsSlinky.opentracing.opentracingStrings.spanDOTkind
import typingsSlinky.opentracing.opentracingStrings.text_map
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object opentracingMod extends js.Object {
  @js.native
  class BinaryCarrier protected () extends default {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typingsSlinky.opentracing.libMockUnderscoreTracerMod.MockTracer
  
  @js.native
  class Reference protected ()
    extends typingsSlinky.opentracing.libReferenceMod.default {
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.libSpanMod.default) = this()
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default) = this()
  }
  
  @js.native
  class Span ()
    extends typingsSlinky.opentracing.libSpanMod.Span
  
  @js.native
  class SpanContext ()
    extends typingsSlinky.opentracing.libSpanUnderscoreContextMod.SpanContext
  
  @js.native
  class Tracer ()
    extends typingsSlinky.opentracing.libTracerMod.Tracer
  
  val FORMAT_BINARY: binary = js.native
  val FORMAT_HTTP_HEADERS: http_headers = js.native
  val FORMAT_TEXT_MAP: text_map = js.native
  val REFERENCE_CHILD_OF: child_of = js.native
  val REFERENCE_FOLLOWS_FROM: follows_from = js.native
  def childOf(spanContext: typingsSlinky.opentracing.libSpanMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def childOf(spanContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.libSpanMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typingsSlinky.opentracing.libSpanUnderscoreContextMod.default): typingsSlinky.opentracing.libReferenceMod.default = js.native
  def globalTracer(): typingsSlinky.opentracing.libTracerMod.default = js.native
  def initGlobalTracer(tracer: typingsSlinky.opentracing.libTracerMod.default): Unit = js.native
  @js.native
  object Tags extends js.Object {
    val COMPONENT: component = js.native
    val DB_INSTANCE: dbDOTinstance = js.native
    val DB_STATEMENT: dbDOTstatement = js.native
    val DB_TYPE: dbDOTtype = js.native
    val DB_USER: dbDOTuser = js.native
    val ERROR: error = js.native
    val HTTP_METHOD: httpDOTmethod = js.native
    val HTTP_STATUS_CODE: httpDOTstatus_code = js.native
    val HTTP_URL: httpDOTurl = js.native
    val MESSAGE_BUS_DESTINATION: message_busDOTdestination = js.native
    val PEER_ADDRESS: peerDOTaddress = js.native
    val PEER_HOSTNAME: peerDOThostname = js.native
    val PEER_HOST_IPV4: peerDOTipv4 = js.native
    val PEER_HOST_IPV6: peerDOTipv6 = js.native
    val PEER_PORT: peerDOTport = js.native
    val PEER_SERVICE: peerDOTservice = js.native
    val SAMPLING_PRIORITY: samplingDOTpriority = js.native
    val SPAN_KIND: spanDOTkind = js.native
    val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
    val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
    val SPAN_KIND_RPC_CLIENT: client = js.native
    val SPAN_KIND_RPC_SERVER: server = js.native
  }
  
}

