package typingsSlinky.firebaseFirestore.coreComponentProviderMod

import typingsSlinky.firebaseFirestore.coreSyncEngineMod.MultiTabSyncEngine
import typingsSlinky.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbPersistence
import typingsSlinky.firebaseFirestore.localLocalStoreMod.MultiTabLocalStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/component_provider", "IndexedDbComponentProvider")
@js.native
class IndexedDbComponentProvider () extends MemoryComponentProvider {
  @JSName("localStore")
  var localStore_IndexedDbComponentProvider: MultiTabLocalStore = js.native
  @JSName("persistence")
  var persistence_IndexedDbComponentProvider: IndexedDbPersistence = js.native
  @JSName("syncEngine")
  var syncEngine_IndexedDbComponentProvider: MultiTabSyncEngine = js.native
}

