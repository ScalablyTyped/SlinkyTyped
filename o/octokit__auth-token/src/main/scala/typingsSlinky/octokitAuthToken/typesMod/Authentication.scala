package typingsSlinky.octokitAuthToken.typesMod

import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.app
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.installation
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.oauth
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.octokitAuthToken.typesMod.OAuthTokenAuthentication
  - typingsSlinky.octokitAuthToken.typesMod.InstallationTokenAuthentication
  - typingsSlinky.octokitAuthToken.typesMod.AppAuthentication
*/
trait Authentication extends js.Object

object Authentication {
  @scala.inline
  def OAuthTokenAuthentication(token: Token, tokenType: oauth, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  @scala.inline
  def InstallationTokenAuthentication(token: Token, tokenType: installation, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  @scala.inline
  def AppAuthentication(token: Token, tokenType: app, `type`: token): Authentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
}

