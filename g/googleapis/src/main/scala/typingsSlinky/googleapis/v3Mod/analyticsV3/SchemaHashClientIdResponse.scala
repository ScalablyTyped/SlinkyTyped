package typingsSlinky.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a hash Client Id response resource.
  */
@js.native
trait SchemaHashClientIdResponse extends StObject {
  
  var clientId: js.UndefOr[String] = js.native
  
  var hashedClientId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaHashClientIdResponse {
  
  @scala.inline
  def apply(): SchemaHashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHashClientIdResponse]
  }
  
  @scala.inline
  implicit class SchemaHashClientIdResponseMutableBuilder[Self <: SchemaHashClientIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setHashedClientId(value: String): Self = StObject.set(x, "hashedClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashedClientIdUndefined: Self = StObject.set(x, "hashedClientId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
