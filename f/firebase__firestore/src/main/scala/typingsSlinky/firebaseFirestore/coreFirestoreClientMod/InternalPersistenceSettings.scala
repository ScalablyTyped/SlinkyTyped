package typingsSlinky.firebaseFirestore.coreFirestoreClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.coreFirestoreClientMod.IndexedDbPersistenceSettings
  - typingsSlinky.firebaseFirestore.coreFirestoreClientMod.MemoryPersistenceSettings
*/
trait InternalPersistenceSettings extends js.Object

object InternalPersistenceSettings {
  @scala.inline
  implicit def apply(value: IndexedDbPersistenceSettings): InternalPersistenceSettings = value.asInstanceOf[InternalPersistenceSettings]
  @scala.inline
  implicit def apply(value: MemoryPersistenceSettings): InternalPersistenceSettings = value.asInstanceOf[InternalPersistenceSettings]
}

