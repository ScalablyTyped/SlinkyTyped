package typingsSlinky.raygun4js.mod

import typingsSlinky.raygun4js.AnonClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunPayload extends js.Object {
  var Details: AnonClient = js.native
  var OccurredOn: js.Date = js.native
}

object RaygunPayload {
  @scala.inline
  def apply(Details: AnonClient, OccurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunPayload]
  }
  @scala.inline
  implicit class RaygunPayloadOps[Self <: RaygunPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: AnonClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurredOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OccurredOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

