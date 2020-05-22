package typingsSlinky.firebaseFirestore.coreComponentProviderMod

import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.coreEventManagerMod.EventManager
import typingsSlinky.firebaseFirestore.coreSyncEngineMod.SyncEngine
import typingsSlinky.firebaseFirestore.localLocalStoreMod.LocalStore
import typingsSlinky.firebaseFirestore.localPersistenceMod.GarbageCollectionScheduler
import typingsSlinky.firebaseFirestore.localPersistenceMod.Persistence
import typingsSlinky.firebaseFirestore.localSharedClientStateMod.SharedClientState
import typingsSlinky.firebaseFirestore.remoteRemoteStoreMod.RemoteStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/component_provider", "MemoryComponentProvider")
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

