package typingsSlinky.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kiiCloudSdk.anon.Accesstoken
  - typingsSlinky.kiiCloudSdk.anon.Oauthtoken
*/
trait KiiSocialConnectOptions extends StObject
object KiiSocialConnectOptions {
  
  @scala.inline
  def Accesstoken(access_token: String): typingsSlinky.kiiCloudSdk.anon.Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.kiiCloudSdk.anon.Accesstoken]
  }
  
  @scala.inline
  def Oauthtoken(oauth_token: String, oauth_token_secret: String): typingsSlinky.kiiCloudSdk.anon.Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.kiiCloudSdk.anon.Oauthtoken]
  }
}
