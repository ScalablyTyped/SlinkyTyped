package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.domstoragewrapperMod.DOMStorageWrapper
import typingsSlinky.firebaseDatabase.memoryStorageMod.MemoryStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/storage/storage", JSImport.Namespace)
@js.native
object storageMod extends js.Object {
  
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}
