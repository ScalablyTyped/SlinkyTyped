package typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectStore extends StObject {
  
  /**
    * If true, object store has auto increment flag set.
    */
  var autoIncrement: Boolean = js.native
  
  /**
    * Indexes in this object store.
    */
  var indexes: js.Array[ObjectStoreIndex] = js.native
  
  /**
    * Object store key path.
    */
  var keyPath: KeyPath = js.native
  
  /**
    * Object store name.
    */
  var name: String = js.native
}
object ObjectStore {
  
  @scala.inline
  def apply(autoIncrement: Boolean, indexes: js.Array[ObjectStoreIndex], keyPath: KeyPath, name: String): ObjectStore = {
    val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStore]
  }
  
  @scala.inline
  implicit class ObjectStoreMutableBuilder[Self <: ObjectStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexes(value: js.Array[ObjectStoreIndex]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: ObjectStoreIndex*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: KeyPath): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
