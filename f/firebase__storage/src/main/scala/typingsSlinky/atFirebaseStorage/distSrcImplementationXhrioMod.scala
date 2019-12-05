package typingsSlinky.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.ErrorCode
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.Headers
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typingsSlinky.std.ArrayBufferView
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/xhrio", JSImport.Namespace)
@js.native
object distSrcImplementationXhrioMod extends js.Object {
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
    
    /* 2 */ val ABORT: typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.ErrorCode.ABORT with Double = js.native
    /* 1 */ val NETWORK_ERROR: typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.ErrorCode.NETWORK_ERROR with Double = js.native
    /* 0 */ val NO_ERROR: typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.ErrorCode.NO_ERROR with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
  }
  
  type Headers = StringDictionary[String | Double]
}

