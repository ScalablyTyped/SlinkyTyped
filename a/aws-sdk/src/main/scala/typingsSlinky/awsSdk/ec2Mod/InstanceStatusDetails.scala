package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatusDetails extends js.Object {
  /**
    * The time when a status check failed. For an instance that was launched and impaired, this is the time when the instance was launched.
    */
  var ImpairedSince: js.UndefOr[js.Date] = js.native
  /**
    * The type of instance status.
    */
  var Name: js.UndefOr[StatusName] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[StatusType] = js.native
}

object InstanceStatusDetails {
  @scala.inline
  def apply(): InstanceStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusDetails]
  }
  @scala.inline
  implicit class InstanceStatusDetailsOps[Self <: InstanceStatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpairedSince(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImpairedSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpairedSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImpairedSince")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: StatusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

