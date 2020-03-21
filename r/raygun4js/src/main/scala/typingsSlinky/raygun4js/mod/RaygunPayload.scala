package typingsSlinky.raygun4js.mod

import typingsSlinky.raygun4js.AnonClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: AnonClient
  var OccurredOn: js.Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: AnonClient, OccurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

