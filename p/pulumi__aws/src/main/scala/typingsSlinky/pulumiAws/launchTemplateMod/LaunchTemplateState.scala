package typingsSlinky.pulumiAws.launchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplatePlacement
import typingsSlinky.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: js.UndefOr[Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]]] = js.native
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecification]] = js.native
  /**
    * The CPU options for the instance. See CPU Options below for more details.
    */
  val cpuOptions: js.UndefOr[Input[LaunchTemplateCpuOptions]] = js.native
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: js.UndefOr[Input[LaunchTemplateCreditSpecification]] = js.native
  /**
    * The default version of the launch template.
    */
  val defaultVersion: js.UndefOr[Input[Double]] = js.native
  /**
    * Description of the launch template.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[String]] = js.native
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]]] = js.native
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: js.UndefOr[Input[LaunchTemplateElasticInferenceAccelerator]] = js.native
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: js.UndefOr[Input[LaunchTemplateIamInstanceProfile]] = js.native
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: js.UndefOr[Input[LaunchTemplateInstanceMarketOptions]] = js.native
  /**
    * The type of the instance.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The kernel ID.
    */
  val kernelId: js.UndefOr[Input[String]] = js.native
  /**
    * The key name to use for the instance.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * The latest version of the launch template.
    */
  val latestVersion: js.UndefOr[Input[Double]] = js.native
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateLicenseSpecification]]]] = js.native
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: js.UndefOr[Input[LaunchTemplateMonitoring]] = js.native
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[LaunchTemplateNetworkInterface]]]] = js.native
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: js.UndefOr[Input[LaunchTemplatePlacement]] = js.native
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: js.UndefOr[Input[js.Array[Input[LaunchTemplateTagSpecification]]]] = js.native
  /**
    * A mapping of tags to assign to the launch template.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LaunchTemplateState {
  @scala.inline
  def apply(): LaunchTemplateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateState]
  }
  @scala.inline
  implicit class LaunchTemplateStateOps[Self <: LaunchTemplateState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockDeviceMappings(value: Input[js.Array[Input[LaunchTemplateBlockDeviceMapping]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDeviceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDeviceMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDeviceMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityReservationSpecification(value: Input[LaunchTemplateCapacityReservationSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityReservationSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuOptions(value: Input[LaunchTemplateCpuOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditSpecification(value: Input[LaunchTemplateCreditSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVersion(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableApiTermination(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApiTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableApiTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApiTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticGpuSpecifications(value: Input[js.Array[Input[LaunchTemplateElasticGpuSpecification]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticGpuSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticGpuSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticGpuSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticInferenceAccelerator(value: Input[LaunchTemplateElasticInferenceAccelerator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticInferenceAccelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticInferenceAccelerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticInferenceAccelerator")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: Input[LaunchTemplateIamInstanceProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInitiatedShutdownBehavior(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInitiatedShutdownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInitiatedShutdownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInitiatedShutdownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceMarketOptions(value: Input[LaunchTemplateInstanceMarketOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMarketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceMarketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceMarketOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyName(value: Input[String]): Self = {
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
    def withLatestVersion(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseSpecifications(value: Input[js.Array[Input[LaunchTemplateLicenseSpecification]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Input[LaunchTemplateMonitoring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
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
    def withNamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: Input[js.Array[Input[LaunchTemplateNetworkInterface]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Input[LaunchTemplatePlacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withRamDiskId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramDiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamDiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramDiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: Input[js.Array[Input[LaunchTemplateTagSpecification]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSpecifications")(js.undefined)
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
    def withUserData(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

