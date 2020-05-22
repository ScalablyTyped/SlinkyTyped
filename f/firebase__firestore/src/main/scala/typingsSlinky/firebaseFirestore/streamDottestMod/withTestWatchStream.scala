package typingsSlinky.firebaseFirestore.streamDottestMod

import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.PersistentListenStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/remote/stream.test", "withTestWatchStream")
@js.native
object withTestWatchStream extends js.Object {
  def apply(
    fn: js.Function2[
      /* watchStream */ PersistentListenStream, 
      /* streamListener */ StreamStatusListener, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
}

