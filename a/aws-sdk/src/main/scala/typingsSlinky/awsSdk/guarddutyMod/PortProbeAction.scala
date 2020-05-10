package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeAction extends js.Object {
  /**
    * Port probe blocked information.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * A list of port probe details objects.
    */
  var PortProbeDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.PortProbeDetails] = js.native
}

object PortProbeAction {
  @scala.inline
  def apply(): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeAction]
  }
  @scala.inline
  implicit class PortProbeActionOps[Self <: PortProbeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withPortProbeDetails(value: PortProbeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortProbeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortProbeDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortProbeDetails")(js.undefined)
        ret
    }
  }
  
}

