package typingsSlinky.meteorPrime8consultingOauth2.OAuth2Server

import typingsSlinky.meteor.Mongo.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collections extends js.Object {
  
  /**
    * (server only) Collection of the access tokens.
    */
  var accessToken: Collection[AccessToken] = js.native
  
  /**
    * Collection of the authorization codes.
    */
  var authCode: Collection[AuthCode] = js.native
  
  /**
    * (server only) Collection of the clients authorized to use the oauth2 service.
    */
  var client: Collection[Client] = js.native
  
  /**
    * Collection of the refresh tokens.
    */
  var refreshToken: Collection[RefreshToken] = js.native
}
object Collections {
  
  @scala.inline
  def apply(
    accessToken: Collection[AccessToken],
    authCode: Collection[AuthCode],
    client: Collection[Client],
    refreshToken: Collection[RefreshToken]
  ): Collections = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authCode = authCode.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: Collection[AccessToken]): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCode(value: Collection[AuthCode]): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: Collection[Client]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: Collection[RefreshToken]): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
  }
}
