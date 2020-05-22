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

@JSImport("@firebase/firestore/dist/lib/src/core/component_provider", "MemoryComponentProvider")
@js.native
class MemoryComponentProvider () extends ComponentProvider {
  /* CompleteClass */
  override var eventManager: EventManager = js.native
  /* CompleteClass */
  override var gcScheduler: GarbageCollectionScheduler | Null = js.native
  /* CompleteClass */
  override var localStore: LocalStore = js.native
  /* CompleteClass */
  override var persistence: Persistence = js.native
  /* CompleteClass */
  override var remoteStore: RemoteStore = js.native
  /* CompleteClass */
  override var sharedClientState: SharedClientState = js.native
  /* CompleteClass */
  override var syncEngine: SyncEngine = js.native
  /* CompleteClass */
  override def clearPersistence(databaseId: DatabaseInfo): js.Promise[Unit] = js.native
  def createEventManager(cfg: ComponentConfiguration): EventManager = js.native
  def createGarbageCollectionScheduler(cfg: ComponentConfiguration): GarbageCollectionScheduler | Null = js.native
  def createLocalStore(cfg: ComponentConfiguration): LocalStore = js.native
  def createPersistence(cfg: ComponentConfiguration): Persistence = js.native
  def createRemoteStore(cfg: ComponentConfiguration): RemoteStore = js.native
  def createSharedClientState(cfg: ComponentConfiguration): SharedClientState = js.native
  def createSyncEngine(cfg: ComponentConfiguration): SyncEngine = js.native
  /* CompleteClass */
  override def initialize(cfg: ComponentConfiguration): js.Promise[Unit] = js.native
}

