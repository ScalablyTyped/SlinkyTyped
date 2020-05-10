package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[String] = js.native
  var additionalSlaveSecurityGroups: js.UndefOr[String] = js.native
  var emrManagedMasterSecurityGroup: String = js.native
  var emrManagedSlaveSecurityGroup: String = js.native
  var instanceProfile: String = js.native
  var keyName: js.UndefOr[String] = js.native
  var serviceAccessSecurityGroup: String = js.native
  var subnetId: js.UndefOr[String] = js.native
}

object ClusterEc2Attributes {
  @scala.inline
  def apply(
    emrManagedMasterSecurityGroup: String,
    emrManagedSlaveSecurityGroup: String,
    instanceProfile: String,
    serviceAccessSecurityGroup: String
  ): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup.asInstanceOf[js.Any], emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup.asInstanceOf[js.Any], instanceProfile = instanceProfile.asInstanceOf[js.Any], serviceAccessSecurityGroup = serviceAccessSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
  @scala.inline
  implicit class ClusterEc2AttributesOps[Self <: ClusterEc2Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmrManagedMasterSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emrManagedMasterSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmrManagedSlaveSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emrManagedSlaveSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccessSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccessSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalMasterSecurityGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMasterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalMasterSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMasterSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalSlaveSecurityGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSlaveSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSlaveSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSlaveSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
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

