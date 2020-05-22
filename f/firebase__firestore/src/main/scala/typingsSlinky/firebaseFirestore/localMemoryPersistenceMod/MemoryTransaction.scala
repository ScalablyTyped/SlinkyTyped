package typingsSlinky.firebaseFirestore.localMemoryPersistenceMod

import typingsSlinky.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_persistence", "MemoryTransaction")
@js.native
class MemoryTransaction protected () extends PersistenceTransaction {
  def this(currentSequenceNumber: ListenSequenceNumber) = this()
}

