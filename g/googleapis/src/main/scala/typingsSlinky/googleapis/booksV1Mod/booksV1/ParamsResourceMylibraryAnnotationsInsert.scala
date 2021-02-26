package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMylibraryAnnotationsInsert extends StandardParameters {
  
  /**
    * The ID for the annotation to insert.
    */
  var annotationId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotation] = js.native
  
  /**
    * Requests that only the summary of the specified layer be provided in the
    * response.
    */
  var showOnlySummaryInResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
}
object ParamsResourceMylibraryAnnotationsInsert {
  
  @scala.inline
  def apply(): ParamsResourceMylibraryAnnotationsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryAnnotationsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceMylibraryAnnotationsInsertMutableBuilder[Self <: ParamsResourceMylibraryAnnotationsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationId(value: String): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAnnotation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setShowOnlySummaryInResponse(value: Boolean): Self = StObject.set(x, "showOnlySummaryInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlySummaryInResponseUndefined: Self = StObject.set(x, "showOnlySummaryInResponse", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
