package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.localIndexManagerMod.IndexManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_index_manager", JSImport.Namespace)
@js.native
object localIndexeddbIndexManagerMod extends js.Object {
  @js.native
  class IndexedDbIndexManager () extends IndexManager {
    /**
      * An in-memory copy of the index entries we've already written since the SDK
      * launched. Used to avoid re-writing the same entry repeatedly.
      *
      * This is *NOT* a complete cache of what's in persistence and so can never be used to
      * satisfy reads.
      */
    var collectionParentsCache: js.Any = js.native
  }
  
}

