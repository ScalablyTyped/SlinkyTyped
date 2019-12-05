package typingsSlinky.raygun4js.raygun4jsMod

import typingsSlinky.raygun4js.Anon_Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: Anon_Client
  var OccurredOn: js.Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: Anon_Client, OccurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

