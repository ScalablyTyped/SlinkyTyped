package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeInfo extends js.Object {
  /**
    * Indicates whether auto recovery is supported.
    */
  var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.native
  /**
    * Indicates whether the instance is bare metal.
    */
  var BareMetal: js.UndefOr[BareMetalFlag] = js.native
  /**
    * Indicates whether the instance type is a burstable performance instance type.
    */
  var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.native
  /**
    * Indicates whether the instance type is a current generation.
    */
  var CurrentGeneration: js.UndefOr[CurrentGenerationFlag] = js.native
  /**
    * Indicates whether Dedicated Hosts are supported on the instance type.
    */
  var DedicatedHostsSupported: js.UndefOr[DedicatedHostFlag] = js.native
  /**
    * Describes the Amazon EBS settings for the instance type.
    */
  var EbsInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EbsInfo] = js.native
  /**
    * Describes the FPGA accelerator settings for the instance type.
    */
  var FpgaInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FpgaInfo] = js.native
  /**
    * Indicates whether the instance type is eligible for the free tier.
    */
  var FreeTierEligible: js.UndefOr[FreeTierEligibleFlag] = js.native
  /**
    * Describes the GPU accelerator settings for the instance type.
    */
  var GpuInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.GpuInfo] = js.native
  /**
    * Indicates whether On-Demand hibernation is supported.
    */
  var HibernationSupported: js.UndefOr[HibernationFlag] = js.native
  /**
    * Indicates the hypervisor used for the instance type.
    */
  var Hypervisor: js.UndefOr[InstanceTypeHypervisor] = js.native
  /**
    * Describes the Inference accelerator settings for the instance type.
    */
  var InferenceAcceleratorInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InferenceAcceleratorInfo] = js.native
  /**
    * Describes the disks for the instance type.
    */
  var InstanceStorageInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceStorageInfo] = js.native
  /**
    * Indicates whether instance storage is supported.
    */
  var InstanceStorageSupported: js.UndefOr[InstanceStorageFlag] = js.native
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * Describes the memory for the instance type.
    */
  var MemoryInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.MemoryInfo] = js.native
  /**
    * Describes the network settings for the instance type.
    */
  var NetworkInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkInfo] = js.native
  /**
    * Describes the placement group settings for the instance type.
    */
  var PlacementGroupInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PlacementGroupInfo] = js.native
  /**
    * Describes the processor.
    */
  var ProcessorInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ProcessorInfo] = js.native
  /**
    * Indicates the supported root device types.
    */
  var SupportedRootDeviceTypes: js.UndefOr[RootDeviceTypeList] = js.native
  /**
    * Indicates whether the instance type is offered for spot or On-Demand.
    */
  var SupportedUsageClasses: js.UndefOr[UsageClassTypeList] = js.native
  /**
    * Describes the vCPU configurations for the instance type.
    */
  var VCpuInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VCpuInfo] = js.native
}

object InstanceTypeInfo {
  @scala.inline
  def apply(): InstanceTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeInfo]
  }
  @scala.inline
  implicit class InstanceTypeInfoOps[Self <: InstanceTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRecoverySupported(value: AutoRecoveryFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRecoverySupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRecoverySupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRecoverySupported")(js.undefined)
        ret
    }
    @scala.inline
    def withBareMetal(value: BareMetalFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BareMetal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBareMetal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BareMetal")(js.undefined)
        ret
    }
    @scala.inline
    def withBurstablePerformanceSupported(value: BurstablePerformanceFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurstablePerformanceSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurstablePerformanceSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BurstablePerformanceSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentGeneration(value: CurrentGenerationFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withDedicatedHostsSupported(value: DedicatedHostFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedHostsSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedHostsSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedHostsSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsInfo(value: EbsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFpgaInfo(value: FpgaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpgaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FpgaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeTierEligible(value: FreeTierEligibleFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreeTierEligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeTierEligible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreeTierEligible")(js.undefined)
        ret
    }
    @scala.inline
    def withGpuInfo(value: GpuInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GpuInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GpuInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHibernationSupported(value: HibernationFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HibernationSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHibernationSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HibernationSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withHypervisor(value: InstanceTypeHypervisor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHypervisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hypervisor")(js.undefined)
        ret
    }
    @scala.inline
    def withInferenceAcceleratorInfo(value: InferenceAcceleratorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceAcceleratorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceAcceleratorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InferenceAcceleratorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStorageInfo(value: InstanceStorageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStorageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStorageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStorageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStorageSupported(value: InstanceStorageFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStorageSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStorageSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStorageSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfo(value: MemoryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInfo(value: NetworkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroupInfo(value: PlacementGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroupInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroupInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessorInfo(value: ProcessorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedRootDeviceTypes(value: RootDeviceTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedRootDeviceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedRootDeviceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedRootDeviceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedUsageClasses(value: UsageClassTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedUsageClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedUsageClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedUsageClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withVCpuInfo(value: VCpuInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VCpuInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVCpuInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VCpuInfo")(js.undefined)
        ret
    }
  }
  
}

