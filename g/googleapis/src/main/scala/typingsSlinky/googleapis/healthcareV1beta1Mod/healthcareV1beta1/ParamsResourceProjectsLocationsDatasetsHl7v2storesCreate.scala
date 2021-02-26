package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the HL7v2 store that is being created. The string must match
    * the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    */
  var hl7V2StoreId: js.UndefOr[String] = js.native
  
  /**
    * The name of the dataset this HL7v2 store belongs to.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHl7V2Store] = js.native
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsHl7v2storesCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHl7V2StoreId(value: String): Self = StObject.set(x, "hl7V2StoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHl7V2StoreIdUndefined: Self = StObject.set(x, "hl7V2StoreId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaHl7V2Store): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
