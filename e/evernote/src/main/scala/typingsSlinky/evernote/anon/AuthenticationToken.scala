package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.User
import typingsSlinky.evernote.mod.UserStore.PublicUserInfo
import typingsSlinky.evernote.mod.UserStore.UserUrls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationToken extends StObject {
  
  var authenticationToken: js.UndefOr[String] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var expiration: js.UndefOr[Timestamp] = js.native
  
  var noteStoreUrl: js.UndefOr[String] = js.native
  
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
  
  var secondFactorDeliveryHint: js.UndefOr[String] = js.native
  
  var secondFactorRequired: js.UndefOr[Boolean] = js.native
  
  var urls: js.UndefOr[UserUrls] = js.native
  
  var user: js.UndefOr[User] = js.native
  
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}
object AuthenticationToken {
  
  @scala.inline
  def apply(): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationToken]
  }
  
  @scala.inline
  implicit class AuthenticationTokenMutableBuilder[Self <: AuthenticationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: String): Self = StObject.set(x, "authenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "authenticationToken", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setExpiration(value: Timestamp): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    @scala.inline
    def setPublicUserInfo(value: PublicUserInfo): Self = StObject.set(x, "publicUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUserInfoUndefined: Self = StObject.set(x, "publicUserInfo", js.undefined)
    
    @scala.inline
    def setSecondFactorDeliveryHint(value: String): Self = StObject.set(x, "secondFactorDeliveryHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondFactorDeliveryHintUndefined: Self = StObject.set(x, "secondFactorDeliveryHint", js.undefined)
    
    @scala.inline
    def setSecondFactorRequired(value: Boolean): Self = StObject.set(x, "secondFactorRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondFactorRequiredUndefined: Self = StObject.set(x, "secondFactorRequired", js.undefined)
    
    @scala.inline
    def setUrls(value: UserUrls): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
