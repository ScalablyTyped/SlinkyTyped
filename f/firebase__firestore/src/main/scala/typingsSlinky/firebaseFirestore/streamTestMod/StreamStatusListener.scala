package typingsSlinky.firebaseFirestore.streamTestMod

import typingsSlinky.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typingsSlinky.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.watchChangeMod.DocumentWatchChange
import typingsSlinky.firebaseFirestore.watchChangeMod.ExistenceFilterChange
import typingsSlinky.firebaseFirestore.watchChangeMod.WatchTargetChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamStatusListener
  extends WatchStreamListener
     with WriteStreamListener {
  var pendingCallbacks: js.Any = js.native
  var pendingPromises: js.Any = js.native
  var resolvePending: js.Any = js.native
  /**
    * Returns a Promise that resolves when the next callback fires. Resolves the
    * returned Promise immediately if there is already an unprocessed callback.
    *
    * This method asserts that the observed callback type matches
    * `expectedCallback`.
    */
  def awaitCallback(expectedCallback: StreamEventType): js.Promise[Unit] = js.native
  def onWatchChange(watchChange: DocumentWatchChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
  def onWatchChange(watchChange: ExistenceFilterChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
  def onWatchChange(watchChange: WatchTargetChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
  /**
    * Verifies that we did not encounter any unexpected callbacks.
    */
  def verifyNoPendingCallbacks(): Unit = js.native
}

