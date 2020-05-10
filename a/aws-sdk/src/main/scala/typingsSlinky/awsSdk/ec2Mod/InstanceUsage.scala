package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceUsage extends js.Object {
  /**
    * The ID of the AWS account that is making use of the Capacity Reservation.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The number of instances the AWS account currently has in the Capacity Reservation.
    */
  var UsedInstanceCount: js.UndefOr[Integer] = js.native
}

object InstanceUsage {
  @scala.inline
  def apply(): InstanceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUsage]
  }
  @scala.inline
  implicit class InstanceUsageOps[Self <: InstanceUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedInstanceCount")(js.undefined)
        ret
    }
  }
  
}

