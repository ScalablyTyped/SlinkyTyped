package typingsSlinky.rsocketCore

import typingsSlinky.rsocketCore.anon.ErrorsourceErrorSource
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketframeMod {
  
  @JSImport("rsocket-core/RSocketFrame", "CONNECTION_STREAM_ID")
  @js.native
  val CONNECTION_STREAM_ID: /* 0 */ Double = js.native
  
  object ERROR_CODES {
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.APPLICATION_ERROR")
    @js.native
    def APPLICATION_ERROR: Double = js.native
    @scala.inline
    def APPLICATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APPLICATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.CANCELED")
    @js.native
    def CANCELED: Double = js.native
    @scala.inline
    def CANCELED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.CONNECTION_CLOSE")
    @js.native
    def CONNECTION_CLOSE: Double = js.native
    @scala.inline
    def CONNECTION_CLOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_CLOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.CONNECTION_ERROR")
    @js.native
    def CONNECTION_ERROR: Double = js.native
    @scala.inline
    def CONNECTION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.INVALID")
    @js.native
    def INVALID: Double = js.native
    @scala.inline
    def INVALID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.INVALID_SETUP")
    @js.native
    def INVALID_SETUP: Double = js.native
    @scala.inline
    def INVALID_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.REJECTED")
    @js.native
    def REJECTED: Double = js.native
    @scala.inline
    def REJECTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.REJECTED_RESUME")
    @js.native
    def REJECTED_RESUME: Double = js.native
    @scala.inline
    def REJECTED_RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.REJECTED_SETUP")
    @js.native
    def REJECTED_SETUP: Double = js.native
    @scala.inline
    def REJECTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    @scala.inline
    def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.RESERVED_EXTENSION")
    @js.native
    def RESERVED_EXTENSION: Double = js.native
    @scala.inline
    def RESERVED_EXTENSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "ERROR_CODES.UNSUPPORTED_SETUP")
    @js.native
    def UNSUPPORTED_SETUP: Double = js.native
    @scala.inline
    def UNSUPPORTED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SETUP")(x.asInstanceOf[js.Any])
  }
  
  object FLAGS {
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.COMPLETE")
    @js.native
    def COMPLETE: Double = js.native
    @scala.inline
    def COMPLETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.FOLLOWS")
    @js.native
    def FOLLOWS: Double = js.native
    @scala.inline
    def FOLLOWS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOLLOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.IGNORE")
    @js.native
    def IGNORE: Double = js.native
    @scala.inline
    def IGNORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.LEASE")
    @js.native
    def LEASE: Double = js.native
    @scala.inline
    def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.METADATA")
    @js.native
    def METADATA: Double = js.native
    @scala.inline
    def METADATA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.NEXT")
    @js.native
    def NEXT: Double = js.native
    @scala.inline
    def NEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.RESPOND")
    @js.native
    def RESPOND: Double = js.native
    @scala.inline
    def RESPOND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPOND")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FLAGS.RESUME_ENABLE")
    @js.native
    def RESUME_ENABLE: Double = js.native
    @scala.inline
    def RESUME_ENABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_ENABLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core/RSocketFrame", "FLAGS_MASK")
  @js.native
  val FLAGS_MASK: /* 1023 */ Double = js.native
  
  object FRAME_TYPES {
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.CANCEL")
    @js.native
    def CANCEL: Double = js.native
    @scala.inline
    def CANCEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.EXT")
    @js.native
    def EXT: Double = js.native
    @scala.inline
    def EXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXT")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.KEEPALIVE")
    @js.native
    def KEEPALIVE: Double = js.native
    @scala.inline
    def KEEPALIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.LEASE")
    @js.native
    def LEASE: Double = js.native
    @scala.inline
    def LEASE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEASE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.METADATA_PUSH")
    @js.native
    def METADATA_PUSH: Double = js.native
    @scala.inline
    def METADATA_PUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METADATA_PUSH")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.PAYLOAD")
    @js.native
    def PAYLOAD: Double = js.native
    @scala.inline
    def PAYLOAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAYLOAD")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.REQUEST_CHANNEL")
    @js.native
    def REQUEST_CHANNEL: Double = js.native
    @scala.inline
    def REQUEST_CHANNEL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.REQUEST_FNF")
    @js.native
    def REQUEST_FNF: Double = js.native
    @scala.inline
    def REQUEST_FNF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_FNF")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.REQUEST_N")
    @js.native
    def REQUEST_N: Double = js.native
    @scala.inline
    def REQUEST_N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_N")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.REQUEST_RESPONSE")
    @js.native
    def REQUEST_RESPONSE: Double = js.native
    @scala.inline
    def REQUEST_RESPONSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_RESPONSE")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.REQUEST_STREAM")
    @js.native
    def REQUEST_STREAM: Double = js.native
    @scala.inline
    def REQUEST_STREAM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.RESERVED")
    @js.native
    def RESERVED: Double = js.native
    @scala.inline
    def RESERVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.RESUME")
    @js.native
    def RESUME: Double = js.native
    @scala.inline
    def RESUME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.RESUME_OK")
    @js.native
    def RESUME_OK: Double = js.native
    @scala.inline
    def RESUME_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME_OK")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPES.SETUP")
    @js.native
    def SETUP: Double = js.native
    @scala.inline
    def SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SETUP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core/RSocketFrame", "FRAME_TYPE_OFFFSET")
  @js.native
  val FRAME_TYPE_OFFFSET: /* 10 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_CODE")
  @js.native
  val MAX_CODE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_KEEPALIVE")
  @js.native
  val MAX_KEEPALIVE: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_LIFETIME")
  @js.native
  val MAX_LIFETIME: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_METADATA_LENGTH")
  @js.native
  val MAX_METADATA_LENGTH: /* 16777215 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_MIME_LENGTH")
  @js.native
  val MAX_MIME_LENGTH: /* 255 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_REQUEST_COUNT")
  @js.native
  val MAX_REQUEST_COUNT: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_REQUEST_N")
  @js.native
  val MAX_REQUEST_N: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_RESUME_LENGTH")
  @js.native
  val MAX_RESUME_LENGTH: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_STREAM_ID")
  @js.native
  val MAX_STREAM_ID: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_TTL")
  @js.native
  val MAX_TTL: /* 2147483647 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "MAX_VERSION")
  @js.native
  val MAX_VERSION: /* 65535 */ Double = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "createErrorFromFrame")
  @js.native
  def createErrorFromFrame(frame: ErrorFrame): ErrorsourceErrorSource = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "getErrorCodeExplanation")
  @js.native
  def getErrorCodeExplanation(code: Double): String = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "getFrameTypeName")
  @js.native
  def getFrameTypeName(`type`: Double): String = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isComplete")
  @js.native
  def isComplete(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isIgnore")
  @js.native
  def isIgnore(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isLease")
  @js.native
  def isLease(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isMetadata")
  @js.native
  def isMetadata(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isNext")
  @js.native
  def isNext(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isRespond")
  @js.native
  def isRespond(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isResumeEnable")
  @js.native
  def isResumeEnable(flags: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "isResumePositionFrameType")
  @js.native
  def isResumePositionFrameType(`type`: Double): Boolean = js.native
  
  @JSImport("rsocket-core/RSocketFrame", "printFrame")
  @js.native
  def printFrame(frame: Frame): String = js.native
  
  @js.native
  trait ErrorSource extends StObject {
    
    /** The error code returned by the server. */
    var code: Double = js.native
    
    /** Human-readable explanation of the code (this value is not standardized and may change). */
    var explanation: String = js.native
    
    /** The error string returned by the server. */
    var message: String = js.native
  }
  object ErrorSource {
    
    @scala.inline
    def apply(code: Double, explanation: String, message: String): ErrorSource = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorSource]
    }
    
    @scala.inline
    implicit class ErrorSourceMutableBuilder[Self <: ErrorSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
