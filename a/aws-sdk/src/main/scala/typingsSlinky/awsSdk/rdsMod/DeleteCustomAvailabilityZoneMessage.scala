package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomAvailabilityZoneMessage extends js.Object {
  /**
    * The custom AZ identifier.
    */
  var CustomAvailabilityZoneId: String = js.native
}

object DeleteCustomAvailabilityZoneMessage {
  @scala.inline
  def apply(CustomAvailabilityZoneId: String): DeleteCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneId = CustomAvailabilityZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneMessage]
  }
  @scala.inline
  implicit class DeleteCustomAvailabilityZoneMessageOps[Self <: DeleteCustomAvailabilityZoneMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

