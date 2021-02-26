package typingsSlinky.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCreateTestReturnResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCreateTestReturnResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The ID of the newly created test order return.
    */
  var returnId: js.UndefOr[String] = js.native
}
object SchemaOrdersCreateTestReturnResponse {
  
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnResponse]
  }
  
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnResponseMutableBuilder[Self <: SchemaOrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
