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
trait ParamsResourceMyconfigReleasedownloadaccess extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The device/version ID from which to release the restriction.
    */
  var cpksver: js.UndefOr[String] = js.native
  
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The volume(s) to release restrictions for.
    */
  var volumeIds: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceMyconfigReleasedownloadaccess {
  
  @scala.inline
  def apply(): ParamsResourceMyconfigReleasedownloadaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigReleasedownloadaccess]
  }
  
  @scala.inline
  implicit class ParamsResourceMyconfigReleasedownloadaccessMutableBuilder[Self <: ParamsResourceMyconfigReleasedownloadaccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCpksver(value: String): Self = StObject.set(x, "cpksver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpksverUndefined: Self = StObject.set(x, "cpksver", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVolumeIds(value: js.Array[String]): Self = StObject.set(x, "volumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdsUndefined: Self = StObject.set(x, "volumeIds", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: String*): Self = StObject.set(x, "volumeIds", js.Array(value :_*))
  }
}
