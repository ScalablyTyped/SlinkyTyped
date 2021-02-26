package typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access-control list.
  */
@js.native
trait SchemaBucketAccessControls extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  
  /**
    * The kind of item this is. For lists of bucket access control entries,
    * this is always storage#bucketAccessControls.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBucketAccessControls {
  
  @scala.inline
  def apply(): SchemaBucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketAccessControls]
  }
  
  @scala.inline
  implicit class SchemaBucketAccessControlsMutableBuilder[Self <: SchemaBucketAccessControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaBucketAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBucketAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
