package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiAccessTokenObject extends js.Object {
  var access_token: String
  var expires_at: js.Date
}

object KiiAccessTokenObject {
  @scala.inline
  def apply(access_token: String, expires_at: js.Date): KiiAccessTokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiAccessTokenObject]
  }
}

