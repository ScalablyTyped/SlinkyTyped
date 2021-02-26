package typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResponseHeader extends StObject {
  
  var operationId: js.UndefOr[String] = js.native
}
object SchemaResponseHeader {
  
  @scala.inline
  def apply(): SchemaResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseHeader]
  }
  
  @scala.inline
  implicit class SchemaResponseHeaderMutableBuilder[Self <: SchemaResponseHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
