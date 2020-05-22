package typingsSlinky.firebaseFirestore.componentProviderMod

import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.eventManagerMod.EventManager
import typingsSlinky.firebaseFirestore.localStoreMod.LocalStore
import typingsSlinky.firebaseFirestore.persistenceMod.GarbageCollectionScheduler
import typingsSlinky.firebaseFirestore.persistenceMod.Persistence
import typingsSlinky.firebaseFirestore.remoteStoreMod.RemoteStore
import typingsSlinky.firebaseFirestore.sharedClientStateMod.SharedClientState
import typingsSlinky.firebaseFirestore.syncEngineMod.SyncEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProvider extends js.Object {
  var eventManager: EventManager
  var gcScheduler: GarbageCollectionScheduler | Null
  var localStore: LocalStore
  var persistence: Persistence
  var remoteStore: RemoteStore
  var sharedClientState: SharedClientState
  var syncEngine: SyncEngine
  def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit]
  def initialize(cfg: ComponentConfiguration): js.Promise[Unit]
}

object ComponentProvider {
  @scala.inline
  def apply(
    clearPersistence: DatabaseInfo => js.Promise[Unit],
    eventManager: EventManager,
    initialize: ComponentConfiguration => js.Promise[Unit],
    localStore: LocalStore,
    persistence: Persistence,
    remoteStore: RemoteStore,
    sharedClientState: SharedClientState,
    syncEngine: SyncEngine,
    gcScheduler: GarbageCollectionScheduler = null
  ): ComponentProvider = {
    val __obj = js.Dynamic.literal(clearPersistence = js.Any.fromFunction1(clearPersistence), eventManager = eventManager.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], remoteStore = remoteStore.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], syncEngine = syncEngine.asInstanceOf[js.Any], gcScheduler = gcScheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProvider]
  }
}

