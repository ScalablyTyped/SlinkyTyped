package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListServices`.
  */
@js.native
trait SchemaListServicesResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListServices` again with the `page_token` field set to this value.
    * This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A list of services.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}
object SchemaListServicesResponse {
  
  @scala.inline
  def apply(): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
  
  @scala.inline
  implicit class SchemaListServicesResponseMutableBuilder[Self <: SchemaListServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[SchemaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
