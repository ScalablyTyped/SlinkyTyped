package typingsSlinky.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/xhrio", JSImport.Namespace)
@js.native
object xhrioMod extends js.Object {
  
  @js.native
  sealed trait ErrorCode extends js.Object
  @js.native
  object ErrorCode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
    
    @js.native
    sealed trait ABORT extends ErrorCode
    /* 2 */ @js.native
    object ABORT extends TopLevel[ABORT with Double]
    
    @js.native
    sealed trait NETWORK_ERROR extends ErrorCode
    /* 1 */ @js.native
    object NETWORK_ERROR extends TopLevel[NETWORK_ERROR with Double]
    
    @js.native
    sealed trait NO_ERROR extends ErrorCode
    /* 0 */ @js.native
    object NO_ERROR extends TopLevel[NO_ERROR with Double]
  }
  
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
    def send(url: String, method: String, body: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Null, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: js.typedarray.ArrayBufferView): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: js.typedarray.ArrayBufferView, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob, headers: Headers): js.Promise[XhrIo] = js.native
  }
  
  type Headers = StringDictionary[String | Double]
}
