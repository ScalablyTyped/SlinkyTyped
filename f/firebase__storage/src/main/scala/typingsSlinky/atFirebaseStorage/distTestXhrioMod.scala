package typingsSlinky.atFirebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.Headers
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typingsSlinky.atFirebaseStorage.distTestXhrioMod.SendHook
import typingsSlinky.atFirebaseStorage.distTestXhrioMod.State
import typingsSlinky.atFirebaseStorage.distTestXhrioMod.TestingXhrIo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/test/xhrio", JSImport.Namespace)
@js.native
object distTestXhrioMod extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  @js.native
  class TestingXhrIo () extends XhrIo {
    def this(sendHook: SendHook) = this()
    var errorCode: js.Any = js.native
    var headers: js.Any = js.native
    var resolve: js.Any = js.native
    var responseText: js.Any = js.native
    var sendHook: js.Any = js.native
    var sendPromise: js.Any = js.native
    var state: js.Any = js.native
    var status: js.Any = js.native
    def addUploadProgressListener(): Unit = js.native
    def removeUploadProgressListener(): Unit = js.native
    def simulateResponse(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
  }
  
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait DONE extends State
    
    @js.native
    sealed trait SENT extends State
    
    @js.native
    sealed trait START extends State
    
    /* 2 */ val DONE: typingsSlinky.atFirebaseStorage.distTestXhrioMod.State.DONE with Double = js.native
    /* 1 */ val SENT: typingsSlinky.atFirebaseStorage.distTestXhrioMod.State.SENT with Double = js.native
    /* 0 */ val START: typingsSlinky.atFirebaseStorage.distTestXhrioMod.State.START with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
  }
  
  type SendHook = js.Function5[
    /* xhrio */ TestingXhrIo, 
    /* url */ String, 
    /* method */ String, 
    /* body */ js.UndefOr[scala.scalajs.js.typedarray.ArrayBufferView | Blob | String | Null], 
    /* headers */ js.UndefOr[Headers], 
    Unit
  ]
  type StringHeaders = StringDictionary[String]
}

