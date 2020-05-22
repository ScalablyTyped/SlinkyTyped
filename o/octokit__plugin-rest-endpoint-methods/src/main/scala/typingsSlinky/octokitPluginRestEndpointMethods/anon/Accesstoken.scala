package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  var access_token: Required
  var client_id: Required
}

object Accesstoken {
  @scala.inline
  def apply(access_token: Required, client_id: Required): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

