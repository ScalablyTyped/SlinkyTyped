package typingsSlinky.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/storage/MemoryStorage", JSImport.Namespace)
@js.native
object memoryStorageMod extends js.Object {
  
  @js.native
  class MemoryStorage () extends js.Object {
    
    var cache_ : js.Any = js.native
    
    def get(key: String): js.Any = js.native
    
    var isInMemoryStorage: Boolean = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
  }
}
