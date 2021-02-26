package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAccessControls extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[ObjectAccessControl]] = js.native
  
  /** The kind of item this is. For lists of object access control entries, this is always storage#objectAccessControls. */
  var kind: js.UndefOr[String] = js.native
}
object ObjectAccessControls {
  
  @scala.inline
  def apply(): ObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAccessControls]
  }
  
  @scala.inline
  implicit class ObjectAccessControlsMutableBuilder[Self <: ObjectAccessControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ObjectAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ObjectAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
