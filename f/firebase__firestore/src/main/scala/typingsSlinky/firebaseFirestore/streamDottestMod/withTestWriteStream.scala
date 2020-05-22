package typingsSlinky.firebaseFirestore.streamDottestMod

import typingsSlinky.firebaseFirestore.apiCredentialsMod.EmptyCredentialsProvider
import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.PersistentWriteStream
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/remote/stream.test", "withTestWriteStream")
@js.native
object withTestWriteStream extends js.Object {
  def apply(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueue, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueue, 
      js.Promise[Unit]
    ],
    credentialsProvider: EmptyCredentialsProvider
  ): js.Promise[Unit] = js.native
}

