package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInfotypesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional filter to only return infoTypes supported by certain parts of
    * the API. Defaults to supported_by=INSPECT.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional BCP-47 language code for localized infoType friendly names. If
    * omitted, or if localized strings are not available, en-US strings will be
    * returned.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object ParamsResourceInfotypesList {
  
  @scala.inline
  def apply(): ParamsResourceInfotypesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInfotypesList]
  }
  
  @scala.inline
  implicit class ParamsResourceInfotypesListMutableBuilder[Self <: ParamsResourceInfotypesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
