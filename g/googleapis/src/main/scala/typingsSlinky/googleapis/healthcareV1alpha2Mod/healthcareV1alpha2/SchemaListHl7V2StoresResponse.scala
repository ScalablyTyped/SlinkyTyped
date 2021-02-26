package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the HL7v2 stores in the given dataset.
  */
@js.native
trait SchemaListHl7V2StoresResponse extends StObject {
  
  /**
    * The returned HL7v2 stores. Won&#39;t be more HL7v2 stores than the value
    * of page_size in the request.
    */
  var hl7V2Stores: js.UndefOr[js.Array[SchemaHl7V2Store]] = js.native
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListHl7V2StoresResponse {
  
  @scala.inline
  def apply(): SchemaListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHl7V2StoresResponse]
  }
  
  @scala.inline
  implicit class SchemaListHl7V2StoresResponseMutableBuilder[Self <: SchemaListHl7V2StoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl7V2Stores(value: js.Array[SchemaHl7V2Store]): Self = StObject.set(x, "hl7V2Stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHl7V2StoresUndefined: Self = StObject.set(x, "hl7V2Stores", js.undefined)
    
    @scala.inline
    def setHl7V2StoresVarargs(value: SchemaHl7V2Store*): Self = StObject.set(x, "hl7V2Stores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
