package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireCheckIn extends js.Object {
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into. 
    */
  var ReleaseAfterMinutes: js.UndefOr[Minutes] = js.native
}

object RequireCheckIn {
  @scala.inline
  def apply(): RequireCheckIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireCheckIn]
  }
  @scala.inline
  implicit class RequireCheckInOps[Self <: RequireCheckIn] (val x: Self) extends AnyVal {
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
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseAfterMinutes(value: Minutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseAfterMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseAfterMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseAfterMinutes")(js.undefined)
        ret
    }
  }
  
}

