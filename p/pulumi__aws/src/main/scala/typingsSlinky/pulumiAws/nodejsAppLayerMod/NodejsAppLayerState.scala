package typingsSlinky.pulumiAws.nodejsAppLayerMod

import typingsSlinky.pulumiAws.inputMod.opsworks.NodejsAppLayerEbsVolume
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodejsAppLayerState extends js.Object {
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: js.UndefOr[Input[Boolean]] = js.native
  val customConfigureRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customDeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * Custom JSON attributes to apply to the layer.
    */
  val customJson: js.UndefOr[Input[String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customSetupRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customShutdownRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val customUndeployRecipes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: js.UndefOr[Input[Boolean]] = js.native
  /**
    * `ebsVolume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: js.UndefOr[Input[js.Array[Input[NodejsAppLayerEbsVolume]]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The version of NodeJS to use. Defaults to "0.10.38".
    */
  val nodejsVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: js.UndefOr[Input[Boolean]] = js.native
}

object NodejsAppLayerState {
  @scala.inline
  def apply(): NodejsAppLayerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodejsAppLayerState]
  }
  @scala.inline
  implicit class NodejsAppLayerStateOps[Self <: NodejsAppLayerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAssignElasticIps(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignElasticIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssignElasticIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignElasticIps")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAssignPublicIps(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignPublicIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssignPublicIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignPublicIps")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHealing(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHealing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHealing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHealing")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConfigureRecipes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfigureRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomConfigureRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConfigureRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDeployRecipes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDeployRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDeployRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDeployRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInstanceProfileArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomJson(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customJson")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSetupRecipes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSetupRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSetupRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSetupRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomShutdownRecipes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShutdownRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomShutdownRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShutdownRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUndeployRecipes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUndeployRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUndeployRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUndeployRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainElbOnShutdown(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainElbOnShutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainElbOnShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainElbOnShutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsVolumes(value: Input[js.Array[Input[NodejsAppLayerEbsVolume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsVolumes")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticLoadBalancer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticLoadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticLoadBalancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticLoadBalancer")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallUpdatesOnBoot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUpdatesOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallUpdatesOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUpdatesOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceShutdownTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceShutdownTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceShutdownTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceShutdownTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNodejsVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodejsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodejsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodejsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemPackages(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemPackages")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEbsOptimizedInstances(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEbsOptimizedInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEbsOptimizedInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEbsOptimizedInstances")(js.undefined)
        ret
    }
  }
  
}

