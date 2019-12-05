package typingsSlinky.raygun.raygunMod.raygun

import typingsSlinky.raygun.Anon_Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: Anon_Client
  var occurredOn: js.Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: Anon_Client, occurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

