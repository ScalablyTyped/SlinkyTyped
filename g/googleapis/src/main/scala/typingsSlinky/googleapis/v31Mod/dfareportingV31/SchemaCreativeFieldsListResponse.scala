package typingsSlinky.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Field List Response
  */
@js.native
trait SchemaCreativeFieldsListResponse extends StObject {
  
  /**
    * Creative field collection.
    */
  var creativeFields: js.UndefOr[js.Array[SchemaCreativeField]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCreativeFieldsListResponse {
  
  @scala.inline
  def apply(): SchemaCreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldsListResponse]
  }
  
  @scala.inline
  implicit class SchemaCreativeFieldsListResponseMutableBuilder[Self <: SchemaCreativeFieldsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFields(value: js.Array[SchemaCreativeField]): Self = StObject.set(x, "creativeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldsUndefined: Self = StObject.set(x, "creativeFields", js.undefined)
    
    @scala.inline
    def setCreativeFieldsVarargs(value: SchemaCreativeField*): Self = StObject.set(x, "creativeFields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
