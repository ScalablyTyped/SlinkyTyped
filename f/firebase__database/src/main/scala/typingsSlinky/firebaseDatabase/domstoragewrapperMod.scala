package typingsSlinky.firebaseDatabase

import org.scalajs.dom.raw.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/storage/DOMStorageWrapper", JSImport.Namespace)
@js.native
object domstoragewrapperMod extends js.Object {
  
  @js.native
  class DOMStorageWrapper protected () extends js.Object {
    /**
      * @param {Storage} domStorage_ The underlying storage object (e.g. localStorage or sessionStorage)
      */
    def this(domStorage_ : Storage) = this()
    
    var domStorage_ : js.Any = js.native
    
    /**
      * @param {string} key
      * @return {*} The value that was stored under this key, or null
      */
    def get(key: String): js.Any = js.native
    
    var isInMemoryStorage: Boolean = js.native
    
    var prefix_ : js.Any = js.native
    
    /**
      * @param {string} name
      * @return {string}
      */
    def prefixedName_(name: String): String = js.native
    
    /**
      * @param {string} key
      */
    def remove(key: String): Unit = js.native
    
    /**
      * @param {string} key The key to save the value under
      * @param {?Object} value The value being stored, or null to remove the key.
      */
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
  }
}
