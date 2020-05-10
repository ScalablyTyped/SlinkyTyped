package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.indexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.pathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_index_manager", JSImport.Namespace)
@js.native
object memoryIndexManagerMod extends js.Object {
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

