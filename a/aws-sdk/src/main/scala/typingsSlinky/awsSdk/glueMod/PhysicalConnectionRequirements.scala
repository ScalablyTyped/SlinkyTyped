package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalConnectionRequirements extends js.Object {
  /**
    * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
    */
  var AvailabilityZone: js.UndefOr[NameString] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var SecurityGroupIdList: js.UndefOr[typingsSlinky.awsSdk.glueMod.SecurityGroupIdList] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var SubnetId: js.UndefOr[NameString] = js.native
}

object PhysicalConnectionRequirements {
  @scala.inline
  def apply(): PhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalConnectionRequirements]
  }
  @scala.inline
  implicit class PhysicalConnectionRequirementsOps[Self <: PhysicalConnectionRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIdList(value: SecurityGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIdList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIdList")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
  }
  
}

