package typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListServices` method.
  */
@js.native
trait SchemaListServicesResponse extends StObject {
  
  /**
    * Token that can be passed to `ListServices` to resume a paginated query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The available services for the requested project.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleApiServiceusageV1Service]] = js.native
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
    def setServices(value: js.Array[SchemaGoogleApiServiceusageV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaGoogleApiServiceusageV1Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
