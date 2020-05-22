package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typingsSlinky.firebaseFirestore.firebaseFirestoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSizeBytes
  extends PersistenceSettings
     with typingsSlinky.firebaseFirestore.firestoreClientMod.PersistenceSettings {
  val cacheSizeBytes: Double
  val durable: `true`
  val synchronizeTabs: Boolean
}

object CacheSizeBytes {
  @scala.inline
  def apply(cacheSizeBytes: Double, durable: `true`, synchronizeTabs: Boolean): CacheSizeBytes = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], durable = durable.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSizeBytes]
  }
}

