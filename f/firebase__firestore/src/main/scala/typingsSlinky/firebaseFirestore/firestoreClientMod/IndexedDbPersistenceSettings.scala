package typingsSlinky.firebaseFirestore.firestoreClientMod

import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/firestore_client", "IndexedDbPersistenceSettings")
@js.native
class IndexedDbPersistenceSettings protected () extends InternalPersistenceSettings {
  def this(cacheSizeBytes: Double, synchronizeTabs: Boolean) = this()
  val cacheSizeBytes: Double = js.native
  val synchronizeTabs: Boolean = js.native
  def lruParams(): LruParams = js.native
}

