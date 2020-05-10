package typingsSlinky.nodeZendesk.mod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePayload extends js.Object {
  val ticket_metric: ResponseModel = js.native
}

object ResponsePayload {
  @scala.inline
  def apply(ticket_metric: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(ticket_metric = ticket_metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  @scala.inline
  implicit class ResponsePayloadOps[Self <: ResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTicket_metric(value: ResponseModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket_metric")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

