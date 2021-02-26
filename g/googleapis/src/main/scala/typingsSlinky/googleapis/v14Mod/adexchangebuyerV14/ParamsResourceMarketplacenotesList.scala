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
trait ParamsResourceMarketplacenotesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Query string to retrieve specific notes. To search the text contents of
    * notes, please use syntax like "WHERE note.note = "foo" or "WHERE
    * note.note LIKE "%bar%"
    */
  var pqlQuery: js.UndefOr[String] = js.native
  
  /**
    * The proposalId to get notes for. To search across all proposals specify
    * order_id = '-' as part of the URL.
    */
  var proposalId: js.UndefOr[String] = js.native
}
object ParamsResourceMarketplacenotesList {
  
  @scala.inline
  def apply(): ParamsResourceMarketplacenotesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplacenotesList]
  }
  
  @scala.inline
  implicit class ParamsResourceMarketplacenotesListMutableBuilder[Self <: ParamsResourceMarketplacenotesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
  }
}
