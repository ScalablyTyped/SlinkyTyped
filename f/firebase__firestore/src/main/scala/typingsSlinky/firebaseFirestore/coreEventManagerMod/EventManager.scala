package typingsSlinky.firebaseFirestore.coreEventManagerMod

import typingsSlinky.firebaseFirestore.coreSyncEngineMod.SyncEngine
import typingsSlinky.firebaseFirestore.coreSyncEngineMod.SyncEngineListener
import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/event_manager", "EventManager")
@js.native
class EventManager protected () extends SyncEngineListener {
  def this(syncEngine: SyncEngine) = this()
  var onlineState: js.Any = js.native
  var queries: js.Any = js.native
  var raiseSnapshotsInSyncEvent: js.Any = js.native
  var snapshotsInSyncListeners: js.Any = js.native
  var syncEngine: js.Any = js.native
  def addSnapshotsInSyncListener(observer: Observer[Unit]): Unit = js.native
  def listen(listener: QueryListener): js.Promise[TargetId] = js.native
  def removeSnapshotsInSyncListener(observer: Observer[Unit]): Unit = js.native
  def unlisten(listener: QueryListener): js.Promise[Unit] = js.native
}

