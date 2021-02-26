package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMarketplacenotesInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The proposalId to add notes for.
    */
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddOrderNotesRequest] = js.native
}
object ParamsResourceMarketplacenotesInsert {
  
  @scala.inline
  def apply(): ParamsResourceMarketplacenotesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceMarketplacenotesInsertMutableBuilder[Self <: ParamsResourceMarketplacenotesInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAddOrderNotesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
