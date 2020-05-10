package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentResourceDescription extends js.Object {
  /**
    *  The AutoScalingGroups used by this environment. 
    */
  var AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * The name of the environment.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The Amazon EC2 instances used by this environment.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The Auto Scaling launch configurations in use by this environment.
    */
  var LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.native
  /**
    * The Amazon EC2 launch templates in use by this environment.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.native
  /**
    * The LoadBalancers in use by this environment.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerList] = js.native
  /**
    * The queues used by this environment.
    */
  var Queues: js.UndefOr[QueueList] = js.native
  /**
    * The AutoScaling triggers in use by this environment. 
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}

object EnvironmentResourceDescription {
  @scala.inline
  def apply(): EnvironmentResourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescription]
  }
  @scala.inline
  implicit class EnvironmentResourceDescriptionOps[Self <: EnvironmentResourceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroups(value: AutoScalingGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: InstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchConfigurations(value: LaunchConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplates(value: LaunchTemplateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancers(value: LoadBalancerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancers")(js.undefined)
        ret
    }
    @scala.inline
    def withQueues(value: QueueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queues")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers(value: TriggerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(js.undefined)
        ret
    }
  }
  
}

