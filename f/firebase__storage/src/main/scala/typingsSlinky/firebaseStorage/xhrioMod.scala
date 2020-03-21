package typingsSlinky.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.ArrayBufferView
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/xhrio", JSImport.Namespace)
@js.native
object xhrioMod extends js.Object {
  @js.native
  sealed trait ErrorCode extends js.Object
  
  @js.native
  trait XhrIo extends js.Object {
    /**
      * Abort the request.
      */
    def abort(): Unit = js.native
    def addUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent, Unit]): Unit = js.native
    def getErrorCode(): ErrorCode = js.native
    def getResponseHeader(header: String): String | Null = js.native
    def getResponseText(): String = js.native
    def getStatus(): Double = js.native
    def removeUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent, Unit]): Unit = js.native
    def send(url: String, method: String): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Null, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: ArrayBufferView): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: ArrayBufferView, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob, headers: Headers): js.Promise[XhrIo] = js.native
  }
  
  @js.native
  object ErrorCode extends js.Object {
    @js.native
    sealed trait ABORT extends ErrorCode
    
    @js.native
    sealed trait NETWORK_ERROR extends ErrorCode
    
    @js.native
    sealed trait NO_ERROR extends ErrorCode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
    /* 2 */ @js.native
    object ABORT extends TopLevel[ABORT with Double]
    
    /* 1 */ @js.native
    object NETWORK_ERROR extends TopLevel[NETWORK_ERROR with Double]
    
    /* 0 */ @js.native
    object NO_ERROR extends TopLevel[NO_ERROR with Double]
    
  }
  
  type Headers = StringDictionary[String | Double]
}

