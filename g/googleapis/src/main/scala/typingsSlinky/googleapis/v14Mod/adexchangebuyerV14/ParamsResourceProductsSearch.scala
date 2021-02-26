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
trait ParamsResourceProductsSearch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The pql query used to query for products.
    */
  var pqlQuery: js.UndefOr[String] = js.native
}
object ParamsResourceProductsSearch {
  
  @scala.inline
  def apply(): ParamsResourceProductsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsSearch]
  }
  
  @scala.inline
  implicit class ParamsResourceProductsSearchMutableBuilder[Self <: ParamsResourceProductsSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPqlQuery(value: String): Self = StObject.set(x, "pqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPqlQueryUndefined: Self = StObject.set(x, "pqlQuery", js.undefined)
  }
}
