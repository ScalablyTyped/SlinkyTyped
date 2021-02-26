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
trait ParamsResourceCreativesList extends StandardParameters {
  
  /**
    * When specified, only creatives for the given account ids are returned.
    */
  var accountId: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * When specified, only creatives for the given buyer creative ids are
    * returned.
    */
  var buyerCreativeId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When specified, only creatives having the given deals status are
    * returned.
    */
  var dealsStatusFilter: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * When specified, only creatives having the given open auction status are
    * returned.
    */
  var openAuctionStatusFilter: js.UndefOr[String] = js.native
  
  /**
    * A continuation token, used to page through ad clients. To retrieve the
    * next page, set this parameter to the value of "nextPageToken" from the
    * previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceCreativesList {
  
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  
  @scala.inline
  implicit class ParamsResourceCreativesListMutableBuilder[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: js.Array[Double]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountIdVarargs(value: Double*): Self = StObject.set(x, "accountId", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuyerCreativeId(value: js.Array[String]): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    @scala.inline
    def setBuyerCreativeIdVarargs(value: String*): Self = StObject.set(x, "buyerCreativeId", js.Array(value :_*))
    
    @scala.inline
    def setDealsStatusFilter(value: String): Self = StObject.set(x, "dealsStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsStatusFilterUndefined: Self = StObject.set(x, "dealsStatusFilter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOpenAuctionStatusFilter(value: String): Self = StObject.set(x, "openAuctionStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAuctionStatusFilterUndefined: Self = StObject.set(x, "openAuctionStatusFilter", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
