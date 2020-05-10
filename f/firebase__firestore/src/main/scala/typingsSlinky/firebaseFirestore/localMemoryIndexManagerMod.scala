package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.localIndexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.modelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_index_manager", JSImport.Namespace)
@js.native
object localMemoryIndexManagerMod extends js.Object {
  @js.native
  class MemoryCollectionParentIndex () extends js.Object {
    var index: js.Any = js.native
    def add(collectionPath: ResourcePath): Boolean = js.native
    def getEntries(collectionId: String): js.Array[ResourcePath] = js.native
    def has(collectionPath: ResourcePath): Boolean = js.native
  }
  
  @js.native
  class MemoryIndexManager () extends IndexManager {
    var collectionParentIndex: js.Any = js.native
  }
  
}

