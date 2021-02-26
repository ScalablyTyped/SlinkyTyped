package typingsSlinky.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the refresh token and associated data.
  */
@js.native
trait RefreshToken
  extends /* key */ StringDictionary[js.Any] {
  
  var client: Client = js.native
  
  var refreshToken: String = js.native
  
  var refreshTokenExpiresAt: js.UndefOr[js.Date] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var user: User = js.native
}
object RefreshToken {
  
  @scala.inline
  def apply(client: Client, refreshToken: String, user: User): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  
  @scala.inline
  implicit class RefreshTokenMutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAt(value: js.Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
