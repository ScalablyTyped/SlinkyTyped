package typingsSlinky.firebaseFirestore.coreFirestoreClientMod

import typingsSlinky.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/firestore_client", "IndexedDbPersistenceSettings")
@js.native
class IndexedDbPersistenceSettings protected () extends InternalPersistenceSettings {
  def this(cacheSizeBytes: Double, synchronizeTabs: Boolean) = this()
  val cacheSizeBytes: Double = js.native
  val synchronizeTabs: Boolean = js.native
  def lruParams(): LruParams = js.native
}

