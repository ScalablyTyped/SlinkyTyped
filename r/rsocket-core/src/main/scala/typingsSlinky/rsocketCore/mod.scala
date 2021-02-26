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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-core", "APPLICATION_AVRO")
  @js.native
  val APPLICATION_AVRO: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_CBOR")
  @js.native
  val APPLICATION_CBOR: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_CLOUDEVENTS_JSON")
  @js.native
  val APPLICATION_CLOUDEVENTS_JSON: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_GRAPHQL")
  @js.native
  val APPLICATION_GRAPHQL: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_GZIP")
  @js.native
  val APPLICATION_GZIP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_HESSIAN")
  @js.native
  val APPLICATION_HESSIAN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JAVASCRIPT")
  @js.native
  val APPLICATION_JAVASCRIPT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JAVA_OBJECT")
  @js.native
  val APPLICATION_JAVA_OBJECT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_JSON")
  @js.native
  val APPLICATION_JSON: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_OCTET_STREAM")
  @js.native
  val APPLICATION_OCTET_STREAM: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_PDF")
  @js.native
  val APPLICATION_PDF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_PROTOBUF")
  @js.native
  val APPLICATION_PROTOBUF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_THRIFT")
  @js.native
  val APPLICATION_THRIFT: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "APPLICATION_ZIP")
  @js.native
  val APPLICATION_ZIP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_AAC")
  @js.native
  val AUDIO_AAC: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MP3")
  @js.native
  val AUDIO_MP3: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MP4")
  @js.native
  val AUDIO_MP4: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MPEG")
  @js.native
  val AUDIO_MPEG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_MPEG3")
  @js.native
  val AUDIO_MPEG3: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_OGG")
  @js.native
  val AUDIO_OGG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_OPUS")
  @js.native
  val AUDIO_OPUS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "AUDIO_VORBIS")
  @js.native
  val AUDIO_VORBIS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "BufferEncoder")
  @js.native
  val BufferEncoder: Encoder[Buffer] = js.native
  
  @JSImport("rsocket-core", "BufferEncoders")
  @js.native
  val BufferEncoders: Encoders[Buffer] = js.native
  
  @JSImport("rsocket-core", "CONNECTION_STREAM_ID")
  @js.native
  val CONNECTION_STREAM_ID: /* 0 */ Double = js.native
  
  @JSImport("rsocket-core", "CompositeMetadata")
  @js.native
  class CompositeMetadata protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.CompositeMetadata {
    def this(buffer: Buffer) = this()
  }
  
  object ERROR_CODES {
    
    @JSImport("rsocket-core", "ERROR_CODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "ERROR_CODES.APPLICATION_ERROR")
    @js.native
    def APPLICATION_ERROR: Double = js.native
    @scala.inline
    def APPLICATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APPLICATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CANCELED")
    @js.native
    def CANCELED: Double = js.native
    @scala.inline
    def CANCELED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CONNECTION_CLOSE")
    @js.native
    def CONNECTION_CLOSE: Double = js.native
    @scala.inline
    def CONNECTION_CLOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CLOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.CONNECTION_ERROR")
    @js.native
    def CONNECTION_ERROR: Double = js.native
    @scala.inline
    def CONNECTION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.INVALID")
    @js.native
    def INVALID: Double = js.native
    @scala.inline
    def INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.INVALID_SETUP")
    @js.native
    def INVALID_SETUP: Double = js.native
    @scala.inline
    def INVALID_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED")
    @js.native
    def REJECTED: Double = js.native
    @scala.inline
    def REJECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED_RESUME")
    @js.native
    def REJECTED_RESUME: Double = js.native
    @scala.inline
    def REJECTED_RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.REJECTED_SETUP")
    @js.native
    def REJECTED_SETUP: Double = js.native
    @scala.inline
    def REJECTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    @scala.inline
    def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.RESERVED_EXTENSION")
    @js.native
    def RESERVED_EXTENSION: Double = js.native
    @scala.inline
    def RESERVED_EXTENSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "ERROR_CODES.UNSUPPORTED_SETUP")
    @js.native
    def UNSUPPORTED_SETUP: Double = js.native
    @scala.inline
    def UNSUPPORTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SETUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "ExplicitMimeTimeEntry")
  @js.native
  class ExplicitMimeTimeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.ExplicitMimeTimeEntry {
    def this(content: Buffer, `type`: String) = this()
  }
  
  object FLAGS {
    
    @JSImport("rsocket-core", "FLAGS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "FLAGS.COMPLETE")
    @js.native
    def COMPLETE: Double = js.native
    @scala.inline
    def COMPLETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.FOLLOWS")
    @js.native
    def FOLLOWS: Double = js.native
    @scala.inline
    def FOLLOWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOLLOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.IGNORE")
    @js.native
    def IGNORE: Double = js.native
    @scala.inline
    def IGNORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.LEASE")
    @js.native
    def LEASE: Double = js.native
    @scala.inline
    def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.METADATA")
    @js.native
    def METADATA: Double = js.native
    @scala.inline
    def METADATA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.NEXT")
    @js.native
    def NEXT: Double = js.native
    @scala.inline
    def NEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.RESPOND")
    @js.native
    def RESPOND: Double = js.native
    @scala.inline
    def RESPOND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPOND")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FLAGS.RESUME_ENABLE")
    @js.native
    def RESUME_ENABLE: Double = js.native
    @scala.inline
    def RESUME_ENABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_ENABLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "FLAGS_MASK")
  @js.native
  val FLAGS_MASK: /* 1023 */ Double = js.native
  
  object FRAME_TYPES {
    
    @JSImport("rsocket-core", "FRAME_TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "FRAME_TYPES.CANCEL")
    @js.native
    def CANCEL: Double = js.native
    @scala.inline
    def CANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.EXT")
    @js.native
    def EXT: Double = js.native
    @scala.inline
    def EXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.KEEPALIVE")
    @js.native
    def KEEPALIVE: Double = js.native
    @scala.inline
    def KEEPALIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.LEASE")
    @js.native
    def LEASE: Double = js.native
    @scala.inline
    def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.METADATA_PUSH")
    @js.native
    def METADATA_PUSH: Double = js.native
    @scala.inline
    def METADATA_PUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA_PUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.PAYLOAD")
    @js.native
    def PAYLOAD: Double = js.native
    @scala.inline
    def PAYLOAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAYLOAD")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_CHANNEL")
    @js.native
    def REQUEST_CHANNEL: Double = js.native
    @scala.inline
    def REQUEST_CHANNEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_FNF")
    @js.native
    def REQUEST_FNF: Double = js.native
    @scala.inline
    def REQUEST_FNF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_FNF")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_N")
    @js.native
    def REQUEST_N: Double = js.native
    @scala.inline
    def REQUEST_N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_N")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_RESPONSE")
    @js.native
    def REQUEST_RESPONSE: Double = js.native
    @scala.inline
    def REQUEST_RESPONSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.REQUEST_STREAM")
    @js.native
    def REQUEST_STREAM: Double = js.native
    @scala.inline
    def REQUEST_STREAM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    @scala.inline
    def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESUME")
    @js.native
    def RESUME: Double = js.native
    @scala.inline
    def RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.RESUME_OK")
    @js.native
    def RESUME_OK: Double = js.native
    @scala.inline
    def RESUME_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_OK")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "FRAME_TYPES.SETUP")
    @js.native
    def SETUP: Double = js.native
    @scala.inline
    def SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SETUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "FRAME_TYPE_OFFFSET")
  @js.native
  val FRAME_TYPE_OFFFSET: /* 10 */ Double = js.native
  
  @JSImport("rsocket-core", "IMAGE_BMP")
  @js.native
  val IMAGE_BMP: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_GIG")
  @js.native
  val IMAGE_GIG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIC")
  @js.native
  val IMAGE_HEIC: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIC_SEQUENCE")
  @js.native
  val IMAGE_HEIC_SEQUENCE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIF")
  @js.native
  val IMAGE_HEIF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_HEIF_SEQUENCE")
  @js.native
  val IMAGE_HEIF_SEQUENCE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_JPEG")
  @js.native
  val IMAGE_JPEG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_PNG")
  @js.native
  val IMAGE_PNG: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IMAGE_TIFF")
  @js.native
  val IMAGE_TIFF: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "IdentitySerializer")
  @js.native
  val IdentitySerializer: Serializer[Encodable] = js.native
  
  object IdentitySerializers {
    
    @JSImport("rsocket-core", "IdentitySerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "IdentitySerializers.data")
    @js.native
    def data: Serializer[js.Any] = js.native
    @scala.inline
    def data_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "IdentitySerializers.metadata")
    @js.native
    def metadata: Serializer[js.Any] = js.native
    @scala.inline
    def metadata_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "JsonSerializer")
  @js.native
  val JsonSerializer: Serializer[js.Any] = js.native
  
  object JsonSerializers {
    
    @JSImport("rsocket-core", "JsonSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core", "JsonSerializers.data")
    @js.native
    def data: Serializer[js.Any] = js.native
    @scala.inline
    def data_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core", "JsonSerializers.metadata")
    @js.native
    def metadata: Serializer[js.Any] = js.native
    @scala.inline
    def metadata_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core", "Lease")
  @js.native
  class Lease protected ()
    extends typingsSlinky.rsocketCore.rsocketleaseMod.Lease {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
  }
  
  @JSImport("rsocket-core", "Leases")
  @js.native
  class Leases[T /* <: LeaseStats */] ()
    extends typingsSlinky.rsocketCore.rsocketleaseMod.Leases[T]
  
  @JSImport("rsocket-core", "MAX_CODE")
  @js.native
  val MAX_CODE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_KEEPALIVE")
  @js.native
  val MAX_KEEPALIVE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_LIFETIME")
  @js.native
  val MAX_LIFETIME: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_MIME_LENGTH")
  @js.native
  val MAX_MIME_LENGTH: /* 255 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_RESUME_LENGTH")
  @js.native
  val MAX_RESUME_LENGTH: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_STREAM_ID")
  @js.native
  val MAX_STREAM_ID: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core", "MAX_VERSION")
  @js.native
  val MAX_VERSION: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_COMPOSITE_METADATA")
  @js.native
  val MESSAGE_RSOCKET_COMPOSITE_METADATA: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_ROUTING")
  @js.native
  val MESSAGE_RSOCKET_ROUTING: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MESSAGE_RSOCKET_TRACING_ZIPKIN")
  @js.native
  val MESSAGE_RSOCKET_TRACING_ZIPKIN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "MULTIPART_MIXED")
  @js.native
  val MULTIPART_MIXED: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "RSocketClient")
  @js.native
  class RSocketClient[D, M] protected () extends default[D, M] {
    def this(config: ClientConfig[D, M]) = this()
  }
  
  @JSImport("rsocket-core", "RSocketResumableTransport")
  @js.native
  class RSocketResumableTransport protected ()
    extends typingsSlinky.rsocketCore.rsocketresumabletransportMod.default {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[_]) = this()
  }
  
  @JSImport("rsocket-core", "RSocketServer")
  @js.native
  class RSocketServer[D, M] protected ()
    extends typingsSlinky.rsocketCore.rsocketserverMod.default[D, M] {
    def this(config: ServerConfig[D, M]) = this()
  }
  
  @JSImport("rsocket-core", "ReservedMimeTypeEntry")
  @js.native
  class ReservedMimeTypeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.ReservedMimeTypeEntry {
    def this(content: Buffer, `type`: Double) = this()
  }
  
  @JSImport("rsocket-core", "TEXT_CSS")
  @js.native
  val TEXT_CSS: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_CSV")
  @js.native
  val TEXT_CSV: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_HTML")
  @js.native
  val TEXT_HTML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_PLAIN")
  @js.native
  val TEXT_PLAIN: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "TEXT_XML")
  @js.native
  val TEXT_XML: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UNKNOWN_RESERVED_MIME_TYPE")
  @js.native
  val UNKNOWN_RESERVED_MIME_TYPE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UNPARSEABLE_MIME_TYPE")
  @js.native
  val UNPARSEABLE_MIME_TYPE: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "UTF8Encoder")
  @js.native
  val UTF8Encoder: Encoder[String] = js.native
  
  @JSImport("rsocket-core", "Utf8Encoders")
  @js.native
  val Utf8Encoders: Encoders[String] = js.native
  
  @JSImport("rsocket-core", "VIDEO_H264")
  @js.native
  val VIDEO_H264: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "VIDEO_H265")
  @js.native
  val VIDEO_H265: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "VIDEO_VP8")
  @js.native
  val VIDEO_VP8: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  
  @JSImport("rsocket-core", "WellKnownMimeType")
  @js.native
  class WellKnownMimeType protected ()
    extends typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default {
    def this(str: String, identifier: Double) = this()
  }
  /* static members */
  object WellKnownMimeType {
    
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
    @JSImport("rsocket-core", "WellKnownMimeType.fromIdentifier")
    @js.native
    def fromIdentifier(id: Double): typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
    
    /**
      * Find the {@link WellKnownMimeType} for the given {@link String} representation. If the
      * representation is {@code null} or doesn't match a {@link WellKnownMimeType}, the {@link
      * #UNPARSEABLE_MIME_TYPE} is returned.
      *
      * @param mimeType the looked up mime type
      * @return the matching {@link WellKnownMimeType}, or {@link #UNPARSEABLE_MIME_TYPE} if none matches
      */
    @JSImport("rsocket-core", "WellKnownMimeType.fromString")
    @js.native
    def fromString(mimeType: String): typingsSlinky.rsocketCore.wellKnownMimeTypeMod.WellKnownMimeType = js.native
  }
  
  @JSImport("rsocket-core", "WellKnownMimeTypeEntry")
  @js.native
  class WellKnownMimeTypeEntry protected ()
    extends typingsSlinky.rsocketCore.compositeMetadataMod.WellKnownMimeTypeEntry {
    def this(content: Buffer, `type`: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default) = this()
  }
  
  @JSImport("rsocket-core", "byteLength")
  @js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  
  @JSImport("rsocket-core", "createBuffer")
  @js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  
  @JSImport("rsocket-core", "createErrorFromFrame")
  @js.native
  def createErrorFromFrame(frame: ErrorFrame): ErrorsourceErrorSource = js.native
  
  @JSImport("rsocket-core", "deserializeFrame")
  @js.native
  def deserializeFrame(buffer: Buffer): Frame = js.native
  @JSImport("rsocket-core", "deserializeFrame")
  @js.native
  def deserializeFrame(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  
  @JSImport("rsocket-core", "deserializeFrameWithLength")
  @js.native
  def deserializeFrameWithLength(buffer: Buffer): Frame = js.native
  @JSImport("rsocket-core", "deserializeFrameWithLength")
  @js.native
  def deserializeFrameWithLength(buffer: Buffer, encoders: Encoders[_]): Frame = js.native
  
  @JSImport("rsocket-core", "deserializeFrames")
  @js.native
  def deserializeFrames(buffer: Buffer): js.Tuple2[js.Array[Frame], Buffer] = js.native
  @JSImport("rsocket-core", "deserializeFrames")
  @js.native
  def deserializeFrames(buffer: Buffer, encoders: Encoders[_]): js.Tuple2[js.Array[Frame], Buffer] = js.native
  
  @JSImport("rsocket-core", "encodeAndAddCustomMetadata")
  @js.native
  def encodeAndAddCustomMetadata(compositeMetaData: Buffer, customMimeType: String, metadata: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core", "encodeAndAddWellKnownMetadata")
  @js.native
  def encodeAndAddWellKnownMetadata(compositeMetaData: Buffer, knownMimeType: Double, metadata: Buffer): Buffer = js.native
  @JSImport("rsocket-core", "encodeAndAddWellKnownMetadata")
  @js.native
  def encodeAndAddWellKnownMetadata(
    compositeMetaData: Buffer,
    knownMimeType: typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default,
    metadata: Buffer
  ): Buffer = js.native
  
  @JSImport("rsocket-core", "getErrorCodeExplanation")
  @js.native
  def getErrorCodeExplanation(code: Double): String = js.native
  
  @JSImport("rsocket-core", "isComplete")
  @js.native
  def isComplete(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isIgnore")
  @js.native
  def isIgnore(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isLease")
  @js.native
  def isLease(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isMetadata")
  @js.native
  def isMetadata(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isNext")
  @js.native
  def isNext(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isRespond")
  @js.native
  def isRespond(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "isResumeEnable")
  @js.native
  def isResumeEnable(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core", "printFrame")
  @js.native
  def printFrame(frame: Frame): String = js.native
  
  @JSImport("rsocket-core", "readUInt24BE")
  @js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("rsocket-core", "serializeFrame")
  @js.native
  def serializeFrame(frame: Frame): Buffer = js.native
  @JSImport("rsocket-core", "serializeFrame")
  @js.native
  def serializeFrame(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  
  @JSImport("rsocket-core", "serializeFrameWithLength")
  @js.native
  def serializeFrameWithLength(frame: Frame): Buffer = js.native
  @JSImport("rsocket-core", "serializeFrameWithLength")
  @js.native
  def serializeFrameWithLength(frame: Frame, encoders: Encoders[_]): Buffer = js.native
  
  @JSImport("rsocket-core", "toBuffer")
  @js.native
  def toBuffer(data: js.Any): Buffer = js.native
  
  @JSImport("rsocket-core", "writeUInt24BE")
  @js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
}
