package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Postal Code List Response
  */
@js.native
trait SchemaPostalCodesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCodesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
}
object SchemaPostalCodesListResponse {
  
  @scala.inline
  def apply(): SchemaPostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodesListResponse]
  }
  
  @scala.inline
  implicit class SchemaPostalCodesListResponseMutableBuilder[Self <: SchemaPostalCodesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPostalCodes(value: js.Array[SchemaPostalCode]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    @scala.inline
    def setPostalCodesVarargs(value: SchemaPostalCode*): Self = StObject.set(x, "postalCodes", js.Array(value :_*))
  }
}
