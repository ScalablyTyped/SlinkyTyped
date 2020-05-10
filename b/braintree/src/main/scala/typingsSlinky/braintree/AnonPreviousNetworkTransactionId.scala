package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreviousNetworkTransactionId extends js.Object {
  var previousNetworkTransactionId: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object AnonPreviousNetworkTransactionId {
  @scala.inline
  def apply(): AnonPreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPreviousNetworkTransactionId]
  }
  @scala.inline
  implicit class AnonPreviousNetworkTransactionIdOps[Self <: AnonPreviousNetworkTransactionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousNetworkTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNetworkTransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousNetworkTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNetworkTransactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

