package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneMessage extends js.Object {
  /**
    * The message about the Availability Zone or Local Zone.
    */
  var Message: js.UndefOr[String] = js.native
}

object AvailabilityZoneMessage {
  @scala.inline
  def apply(): AvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneMessage]
  }
  @scala.inline
  implicit class AvailabilityZoneMessageOps[Self <: AvailabilityZoneMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

