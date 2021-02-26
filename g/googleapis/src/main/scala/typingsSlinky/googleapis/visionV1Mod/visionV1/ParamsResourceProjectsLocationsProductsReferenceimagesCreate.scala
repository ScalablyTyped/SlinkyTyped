package typingsSlinky.googleapis.visionV1Mod.visionV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsProductsReferenceimagesCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Resource name of the product in which to create the reference image.
    * Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied resource id for the ReferenceImage to be added. If set,
    * the server will attempt to use this value as the resource id. If it is
    * already in use, an error is returned with code ALREADY_EXISTS. Must be at
    * most 128 characters long. It cannot contain the character `/`.
    */
  var referenceImageId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReferenceImage] = js.native
}
object ParamsResourceProjectsLocationsProductsReferenceimagesCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsProductsReferenceimagesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsReferenceimagesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsProductsReferenceimagesCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsProductsReferenceimagesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setReferenceImageId(value: String): Self = StObject.set(x, "referenceImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceImageIdUndefined: Self = StObject.set(x, "referenceImageId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaReferenceImage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
