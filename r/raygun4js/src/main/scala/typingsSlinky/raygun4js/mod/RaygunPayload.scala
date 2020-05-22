package typingsSlinky.raygun4js.mod

import typingsSlinky.raygun4js.anon.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var Details: Client
  var OccurredOn: js.Date
}

object RaygunPayload {
  @scala.inline
  def apply(Details: Client, OccurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunPayload]
  }
}

