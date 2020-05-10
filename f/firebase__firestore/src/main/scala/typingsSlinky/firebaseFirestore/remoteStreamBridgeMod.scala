package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.remoteConnectionMod.Stream
import typingsSlinky.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/stream_bridge", JSImport.Namespace)
@js.native
object remoteStreamBridgeMod extends js.Object {
  @js.native
  class StreamBridge[I, O] protected () extends Stream[I, O] {
    def this(args: AnonCloseFn[I]) = this()
    var closeFn: js.Any = js.native
    var sendFn: js.Any = js.native
    var wrappedOnClose: js.Any = js.native
    var wrappedOnMessage: js.Any = js.native
    var wrappedOnOpen: js.Any = js.native
    def callOnClose(): Unit = js.native
    def callOnClose(err: FirestoreError): Unit = js.native
    def callOnMessage(msg: O): Unit = js.native
    def callOnOpen(): Unit = js.native
  }
  
}

