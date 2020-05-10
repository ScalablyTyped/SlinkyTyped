package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrokerPropertiesResponse extends js.Object {
  val DeliveryCount: Double = js.native
  val LockToken: String = js.native
  val LockedUntil: DateString = js.native
  val SequenceNumber: Double = js.native
}

object IBrokerPropertiesResponse {
  @scala.inline
  def apply(DeliveryCount: Double, LockToken: String, LockedUntil: DateString, SequenceNumber: Double): IBrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], LockedUntil = LockedUntil.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerPropertiesResponse]
  }
  @scala.inline
  implicit class IBrokerPropertiesResponseOps[Self <: IBrokerPropertiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockedUntil(value: DateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockedUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

