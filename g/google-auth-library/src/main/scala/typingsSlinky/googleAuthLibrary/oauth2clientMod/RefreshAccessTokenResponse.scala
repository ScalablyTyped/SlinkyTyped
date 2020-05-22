package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenResponse extends js.Object {
  var credentials: Credentials
  var res: GaxiosResponse[_] | Null
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(credentials: Credentials, res: GaxiosResponse[_] = null): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

