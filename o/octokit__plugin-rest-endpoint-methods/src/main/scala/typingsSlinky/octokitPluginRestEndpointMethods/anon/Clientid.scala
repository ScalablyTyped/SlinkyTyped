package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clientid extends js.Object {
  var access_token: Type
  var client_id: Required
}

object Clientid {
  @scala.inline
  def apply(access_token: Type, client_id: Required): Clientid = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
}

