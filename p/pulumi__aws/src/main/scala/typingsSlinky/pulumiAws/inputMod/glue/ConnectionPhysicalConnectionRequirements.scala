package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPhysicalConnectionRequirements extends js.Object {
  /**
    * The availability zone of the connection. This field is redundant and implied by `subnetId`, but is currently an api requirement.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var securityGroupIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
}

object ConnectionPhysicalConnectionRequirements {
  @scala.inline
  def apply(): ConnectionPhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPhysicalConnectionRequirements]
  }
  @scala.inline
  implicit class ConnectionPhysicalConnectionRequirementsOps[Self <: ConnectionPhysicalConnectionRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIdLists(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIdLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIdLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIdLists")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
  }
  
}

