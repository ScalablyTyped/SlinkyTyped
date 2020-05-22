package typingsSlinky.firebaseFirestore.streamTestMod

import typingsSlinky.firebaseFirestore.persistentStreamMod.PersistentListenStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/integration/remote/stream.test", "withTestWatchStream")
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

