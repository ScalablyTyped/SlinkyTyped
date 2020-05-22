package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientId extends js.Object {
  var clientId: String
  var clientSecret: String
}

object ClientId {
  @scala.inline
  def apply(clientId: String, clientSecret: String): ClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientId]
  }
}

