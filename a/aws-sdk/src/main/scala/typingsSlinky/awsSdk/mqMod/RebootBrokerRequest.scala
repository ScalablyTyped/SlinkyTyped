package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootBrokerRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string = js.native
}

object RebootBrokerRequest {
  @scala.inline
  def apply(BrokerId: string): RebootBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootBrokerRequest]
  }
  @scala.inline
  implicit class RebootBrokerRequestOps[Self <: RebootBrokerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

