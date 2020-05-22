package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenResponse extends js.Object {
  var res: GaxiosResponse[_] | Null
  var tokens: Credentials
}

object GetTokenResponse {
  @scala.inline
  def apply(tokens: Credentials, res: GaxiosResponse[_] = null): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenResponse]
  }
}

