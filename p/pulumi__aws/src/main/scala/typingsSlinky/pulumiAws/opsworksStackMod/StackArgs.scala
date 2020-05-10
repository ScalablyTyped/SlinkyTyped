package typingsSlinky.pulumiAws.opsworksStackMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.opsworks.StackCustomCookbooksSource
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackArgs extends js.Object {
  /**
    * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * If `manageBerkshelf` is enabled, the version of Berkshelf to use.
    */
  val berkshelfVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Color to paint next to the stack's resources in the OpsWorks console.
    */
  val color: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the configuration manager to use. Defaults to "Chef".
    */
  val configurationManagerName: js.UndefOr[Input[String]] = js.native
  /**
    * Version of the configuration manager to use. Defaults to "11.4".
    */
  val configurationManagerVersion: js.UndefOr[Input[String]] = js.native
  /**
    * When `useCustomCookbooks` is set, provide this sub-object as
    * described below.
    */
  val customCookbooksSources: js.UndefOr[Input[js.Array[Input[StackCustomCookbooksSource]]]] = js.native
  /**
    * Custom JSON attributes to apply to the entire stack.
    */
  val customJson: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default. This is required unless you set `vpcId`.
    */
  val defaultAvailabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM Instance Profile that created instances
    * will have by default.
    */
  val defaultInstanceProfileArn: Input[String] = js.native
  /**
    * Name of OS that will be installed on instances by default.
    */
  val defaultOs: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the type of root device instances will have by default.
    */
  val defaultRootDeviceType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val defaultSshKeyName: js.UndefOr[Input[String]] = js.native
  /**
    * Id of the subnet in which instances will be created by default. Mandatory
    * if `vpcId` is set, and forbidden if it isn't.
    */
  val defaultSubnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword representing the naming scheme that will be used for instance hostnames
    * within this stack.
    */
  val hostnameTheme: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
    */
  val manageBerkshelf: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the stack.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the region where the stack will exist.
    */
  val region: Input[String] = js.native
  /**
    * The ARN of an IAM role that the OpsWorks service will act as.
    */
  val serviceRoleArn: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Boolean value controlling whether the custom cookbook settings are
    * enabled.
    */
  val useCustomCookbooks: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean value controlling whether the standard OpsWorks
    * security groups apply to created instances.
    */
  val useOpsworksSecurityGroups: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The id of the VPC that this stack belongs to.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object StackArgs {
  @scala.inline
  def apply(defaultInstanceProfileArn: Input[String], region: Input[String], serviceRoleArn: Input[String]): StackArgs = {
    val __obj = js.Dynamic.literal(defaultInstanceProfileArn = defaultInstanceProfileArn.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackArgs]
  }
  @scala.inline
  implicit class StackArgsOps[Self <: StackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultInstanceProfileArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBerkshelfVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("berkshelfVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBerkshelfVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("berkshelfVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationManagerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManagerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationManagerVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManagerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationManagerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCookbooksSources(value: Input[js.Array[Input[StackCustomCookbooksSource]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCookbooksSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCookbooksSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCookbooksSources")(js.undefined)
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
    def withDefaultAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOs(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOs")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootDeviceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSshKeyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSshKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSshKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSshKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostnameTheme(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnameTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostnameTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnameTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withManageBerkshelf(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageBerkshelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageBerkshelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageBerkshelf")(js.undefined)
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomCookbooks(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomCookbooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomCookbooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomCookbooks")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOpsworksSecurityGroups(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOpsworksSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOpsworksSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOpsworksSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

