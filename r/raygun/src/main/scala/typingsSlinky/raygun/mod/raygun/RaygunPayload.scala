package typingsSlinky.raygun.mod.raygun

import typingsSlinky.raygun.AnonClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunPayload extends js.Object {
  var details: AnonClient = js.native
  var occurredOn: js.Date = js.native
}

object RaygunPayload {
  @scala.inline
  def apply(details: AnonClient, occurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
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
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurredOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurredOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

