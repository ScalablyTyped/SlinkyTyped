package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRequireCheckIn extends js.Object {
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: Boolean = js.native
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
    */
  var ReleaseAfterMinutes: Minutes = js.native
}

object CreateRequireCheckIn {
  @scala.inline
  def apply(Enabled: Boolean, ReleaseAfterMinutes: Minutes): CreateRequireCheckIn = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReleaseAfterMinutes = ReleaseAfterMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequireCheckIn]
  }
  @scala.inline
  implicit class CreateRequireCheckInOps[Self <: CreateRequireCheckIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseAfterMinutes(value: Minutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseAfterMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

