package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsProductsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The information to be included in the response. Only sections listed here
    * will be returned.
    */
  var include: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    * `target_country`   - The target country of the product as a CLDR
    * territory                      code (for example, US). `content_language`
    * - The content language of the product as a two-letter ISO 639-1 language
    * code (for example, en).  `product_id`     -   The ID of the product. For
    * more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent ID in the format `accounts/{account_id}`.  `account_id` - The ID
    * of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsProductsGet {
  
  @scala.inline
  def apply(): ParamsResourceAccountsProductsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProductsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsProductsGetMutableBuilder[Self <: ParamsResourceAccountsProductsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
