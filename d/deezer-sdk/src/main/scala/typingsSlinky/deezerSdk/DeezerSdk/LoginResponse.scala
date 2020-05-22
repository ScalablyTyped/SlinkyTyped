package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.anon.AccessToken_
import typingsSlinky.deezerSdk.deezerSdkStrings.connected
import typingsSlinky.deezerSdk.deezerSdkStrings.not_authorized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
trait LoginResponse extends js.Object {
  var authResponse: AccessToken_
  var status: connected | not_authorized
  var userID: String
}

object LoginResponse {
  @scala.inline
  def apply(authResponse: AccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
}

