package typingsSlinky.rsocketCore

import typingsSlinky.node.Buffer
import typingsSlinky.rsocketCore.anon.ErrorsourceErrorSource
import typingsSlinky.rsocketCore.rsocketbufferutilsMod.Encoding
import typingsSlinky.rsocketCore.rsocketclientMod.ClientConfig
import typingsSlinky.rsocketCore.rsocketclientMod.default
import typingsSlinky.rsocketCore.rsocketencodingMod.Encoder
import typingsSlinky.rsocketCore.rsocketencodingMod.Encoders
import typingsSlinky.rsocketCore.rsocketleaseMod.LeaseStats
import typingsSlinky.rsocketCore.rsocketresumabletransportMod.Options
import typingsSlinky.rsocketCore.rsocketserializationMod.Serializer
import typingsSlinky.rsocketCore.rsocketserverMod.ServerConfig
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Encodable
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CompositeMetadata protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.CompositeMetadata {
    def this(buffer: Buffer) = this()
  }
  
  @js.native
  class ExplicitMimeTimeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.ExplicitMimeTimeEntry {
    def this(content: Buffer, `type`: String) = this()
  }
  
  @js.native
  class Lease protected ()
    extends typingsSlinky.rsocketCore.rsocketleaseMod.Lease {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
  }
  
  @js.native
  class Leases[T /* <: LeaseStats */] ()
    extends typingsSlinky.rsocketCore.rsocketleaseMod.Leases[T]
  
  @js.native
  class RSocketClient[D, M] protected () extends default[D, M] {
    def this(config: ClientConfig[D, M]) = this()
  }
  
  @js.native
  class RSocketResumableTransport protected ()
    extends typingsSlinky.rsocketCore.rsocketresumabletransportMod.default {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class RSocketServer[D, M] protected ()
    extends typingsSlinky.rsocketCore.rsocketserverMod.default[D, M] {
    def this(config: ServerConfig[D, M]) = this()
  }
  
  @js.native
  class ReservedMimeTypeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.ReservedMimeTypeEntry {
    def this(content: Buffer, `type`: Double) = this()
  }
  
  @js.native
  class WellKnownMimeType protected ()
    extends typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default {
    def this(str: String, identifier: Double) = this()
  }
  
  @js.native
  class WellKnownMimeTypeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.WellKnownMimeTypeEntry {
    def this(content: Buffer, `type`: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default) = this()
  }
  
  val APPLICATION_AVRO: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_CBOR: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_CLOUDEVENTS_JSON: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_GRAPHQL: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_GZIP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_HESSIAN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JAVASCRIPT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JAVA_OBJECT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_JSON: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_OCTET_STREAM: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_PDF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_PROTOBUF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_THRIFT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_XML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val APPLICATION_ZIP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_AAC: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MP3: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MP4: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MPEG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_MPEG3: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_OGG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_OPUS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val AUDIO_VORBIS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val BufferEncoder: Encoder[Buffer] = js.native
  val BufferEncoders: Encoders[Buffer] = js.native
  val CONNECTION_STREAM_ID: /* 0 */ Double = js.native
  val FLAGS_MASK: /* 1023 */ Double = js.native
  val FRAME_TYPE_OFFFSET: /* 10 */ Double = js.native
  val IMAGE_BMP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_GIG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIC: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIC_SEQUENCE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_HEIF_SEQUENCE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_JPEG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_PNG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IMAGE_TIFF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val IdentitySerializer: Serializer[Encodable] = js.native
  val JsonSerializer: Serializer[js.Any] = js.native
  val MAX_CODE: /* 2147483647 */ Double = js.native
  val MAX_KEEPALIVE: /* 2147483647 */ Double = js.native
  val MAX_LIFETIME: /* 2147483647 */ Double = js.native
  val MAX_MIME_LENGTH: /* 255 */ Double = js.native
  val MAX_RESUME_LENGTH: /* 65535 */ Double = js.native
  val MAX_STREAM_ID: /* 2147483647 */ Double = js.native
  val MAX_VERSION: /* 65535 */ Double = js.native
  val MESSAGE_RSOCKET_COMPOSITE_METADATA: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MESSAGE_RSOCKET_ROUTING: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MESSAGE_RSOCKET_TRACING_ZIPKIN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val MULTIPART_MIXED: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_CSS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_CSV: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_HTML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_PLAIN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val TEXT_XML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UNKNOWN_RESERVED_MIME_TYPE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UNPARSEABLE_MIME_TYPE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val UTF8Encoder: Encoder[String] = js.native
  val Utf8Encoders: Encoders[String] = js.native
  val VIDEO_H264: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val VIDEO_H265: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  val VIDEO_VP8: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  def createErrorFromFrame(frame: ErrorFrame): ErrorsourceErrorSource = js.native
  def deserializeFrame(buffer: Buffer): Frame = js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = js.native
  def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = js.native
  def encodeAndAddWellKnownMetadata(
    compositeMetaData: Buffer,
    knownMimeType: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default,
    metadata: Buffer
  ): Buffer = js.native
  def getErrorCodeExplanation(code: Double): String = js.native
  def isComplete(flags: Double): Boolean = js.native
  def isIgnore(flags: Double): Boolean = js.native
  def isLease(flags: Double): Boolean = js.native
  def isMetadata(flags: Double): Boolean = js.native
  def isNext(flags: Double): Boolean = js.native
  def isRespond(flags: Double): Boolean = js.native
  def isResumeEnable(flags: Double): Boolean = js.native
  def printFrame(frame: Frame): String = js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  def toBuffer(data: js.Any): Buffer = js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  @js.native
  object ERROR_CODES extends js.Object {
    var APPLICATION_ERROR: Double = js.native
    var CANCELED: Double = js.native
    var CONNECTION_CLOSE: Double = js.native
    var CONNECTION_ERROR: Double = js.native
    var INVALID: Double = js.native
    var INVALID_SETUP: Double = js.native
    var REJECTED: Double = js.native
    var REJECTED_RESUME: Double = js.native
    var REJECTED_SETUP: Double = js.native
    var RESERVED: Double = js.native
    var RESERVED_EXTENSION: Double = js.native
    var UNSUPPORTED_SETUP: Double = js.native
  }
  
  @js.native
  object FLAGS extends js.Object {
    var COMPLETE: Double = js.native
    var FOLLOWS: Double = js.native
    var IGNORE: Double = js.native
    var LEASE: Double = js.native
    var METADATA: Double = js.native
    var NEXT: Double = js.native
    var RESPOND: Double = js.native
    var RESUME_ENABLE: Double = js.native
  }
  
  @js.native
  object FRAME_TYPES extends js.Object {
    var CANCEL: Double = js.native
    var ERROR: Double = js.native
    var EXT: Double = js.native
    var KEEPALIVE: Double = js.native
    var LEASE: Double = js.native
    var METADATA_PUSH: Double = js.native
    var PAYLOAD: Double = js.native
    var REQUEST_CHANNEL: Double = js.native
    var REQUEST_FNF: Double = js.native
    var REQUEST_N: Double = js.native
    var REQUEST_RESPONSE: Double = js.native
    var REQUEST_STREAM: Double = js.native
    var RESERVED: Double = js.native
    var RESUME: Double = js.native
    var RESUME_OK: Double = js.native
    var SETUP: Double = js.native
  }
  
  @js.native
  object IdentitySerializers extends js.Object {
    var data: Serializer[_] = js.native
    var metadata: Serializer[_] = js.native
  }
  
  @js.native
  object JsonSerializers extends js.Object {
    var data: Serializer[_] = js.native
    var metadata: Serializer[_] = js.native
  }
  
  /* static members */
  @js.native
  object WellKnownMimeType extends js.Object {
    /**
      * Find the {@link WellKnownMimeType} for the given identifier (as an {@code int}). Valid
      * identifiers are defined to be integers between 0 and 127, inclusive. Identifiers outside of
      * this range will produce the {@link #UNPARSEABLE_MIME_TYPE}. Additionally, some identifiers in
      * that range are still only reserved and don't have a type associated yet: this method returns
      * the {@link #UNKNOWN_RESERVED_MIME_TYPE} when passing such an identifier, which lets call sites
      * potentially detect this and keep the original representation when transmitting the associated
      * metadata buffer.
      *
      * @param id the looked up identifier
      * @return the {@link WellKnownMimeType}, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is out
      *     of the specification's range, or {@link #UNKNOWN_RESERVED_MIME_TYPE} if the id is one that
      *     is merely reserved but unknown to this implementation.
      */
    def fromIdentifier(id: Double): typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
    /**
      * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
      * #UNPARSEABLE_MIME_TYPE} is returned.
      *
      * @param mimeType the looked up mime type
      * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
      */
    def fromString(mimeType: String): typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  }
  
}

