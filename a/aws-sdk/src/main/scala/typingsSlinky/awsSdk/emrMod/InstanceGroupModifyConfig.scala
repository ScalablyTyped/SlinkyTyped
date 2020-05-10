package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupModifyConfig extends js.Object {
  /**
    * A list of new or modified configurations to apply for an instance group.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
    */
  var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.native
  /**
    * Target size for the instance group.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * Unique ID of the instance group to expand or shrink.
    */
  var InstanceGroupId: XmlStringMaxLen256 = js.native
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typingsSlinky.awsSdk.emrMod.ShrinkPolicy] = js.native
}

object InstanceGroupModifyConfig {
  @scala.inline
  def apply(InstanceGroupId: XmlStringMaxLen256): InstanceGroupModifyConfig = {
    val __obj = js.Dynamic.literal(InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupModifyConfig]
  }
  @scala.inline
  implicit class InstanceGroupModifyConfigOps[Self <: InstanceGroupModifyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceGroupId(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurations(value: ConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2InstanceIdsToTerminate(value: EC2InstanceIdsToTerminateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceIdsToTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2InstanceIdsToTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceIdsToTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkPolicy(value: ShrinkPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShrinkPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShrinkPolicy")(js.undefined)
        ret
    }
  }
  
}

