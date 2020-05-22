package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clientpayload extends js.Object {
  var client_payload: Type
  var event_type: Type
  var owner: Required
  var repo: Required
}

object Clientpayload {
  @scala.inline
  def apply(client_payload: Type, event_type: Type, owner: Required, repo: Required): Clientpayload = {
    val __obj = js.Dynamic.literal(client_payload = client_payload.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientpayload]
  }
}

