package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeInfo extends StObject {
  
  /**
    * Indicates whether auto recovery is supported.
    */
  var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.native
  
  /**
    * Indicates whether the instance is a bare metal instance type.
    */
  var BareMetal: js.UndefOr[BareMetalFlag] = js.native
  
  /**
    * Indicates whether the instance type is a burstable performance instance type.
    */
  var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.native
  
  /**
    * Indicates whether the instance type is current generation.
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
    * The hypervisor for the instance type.
    */
  var Hypervisor: js.UndefOr[InstanceTypeHypervisor] = js.native
  
  /**
    * Describes the Inference accelerator settings for the instance type.
    */
  var InferenceAcceleratorInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InferenceAcceleratorInfo] = js.native
  
  /**
    * Describes the instance storage for the instance type.
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
    * The supported root device types.
    */
  var SupportedRootDeviceTypes: js.UndefOr[RootDeviceTypeList] = js.native
  
  /**
    * Indicates whether the instance type is offered for spot or On-Demand.
    */
  var SupportedUsageClasses: js.UndefOr[UsageClassTypeList] = js.native
  
  /**
    * The supported virtualization types.
    */
  var SupportedVirtualizationTypes: js.UndefOr[VirtualizationTypeList] = js.native
  
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
  implicit class InstanceTypeInfoMutableBuilder[Self <: InstanceTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRecoverySupported(value: AutoRecoveryFlag): Self = StObject.set(x, "AutoRecoverySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRecoverySupportedUndefined: Self = StObject.set(x, "AutoRecoverySupported", js.undefined)
    
    @scala.inline
    def setBareMetal(value: BareMetalFlag): Self = StObject.set(x, "BareMetal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBareMetalUndefined: Self = StObject.set(x, "BareMetal", js.undefined)
    
    @scala.inline
    def setBurstablePerformanceSupported(value: BurstablePerformanceFlag): Self = StObject.set(x, "BurstablePerformanceSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstablePerformanceSupportedUndefined: Self = StObject.set(x, "BurstablePerformanceSupported", js.undefined)
    
    @scala.inline
    def setCurrentGeneration(value: CurrentGenerationFlag): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    @scala.inline
    def setDedicatedHostsSupported(value: DedicatedHostFlag): Self = StObject.set(x, "DedicatedHostsSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedHostsSupportedUndefined: Self = StObject.set(x, "DedicatedHostsSupported", js.undefined)
    
    @scala.inline
    def setEbsInfo(value: EbsInfo): Self = StObject.set(x, "EbsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsInfoUndefined: Self = StObject.set(x, "EbsInfo", js.undefined)
    
    @scala.inline
    def setFpgaInfo(value: FpgaInfo): Self = StObject.set(x, "FpgaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaInfoUndefined: Self = StObject.set(x, "FpgaInfo", js.undefined)
    
    @scala.inline
    def setFreeTierEligible(value: FreeTierEligibleFlag): Self = StObject.set(x, "FreeTierEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeTierEligibleUndefined: Self = StObject.set(x, "FreeTierEligible", js.undefined)
    
    @scala.inline
    def setGpuInfo(value: GpuInfo): Self = StObject.set(x, "GpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpuInfoUndefined: Self = StObject.set(x, "GpuInfo", js.undefined)
    
    @scala.inline
    def setHibernationSupported(value: HibernationFlag): Self = StObject.set(x, "HibernationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernationSupportedUndefined: Self = StObject.set(x, "HibernationSupported", js.undefined)
    
    @scala.inline
    def setHypervisor(value: InstanceTypeHypervisor): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorInfo(value: InferenceAcceleratorInfo): Self = StObject.set(x, "InferenceAcceleratorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceAcceleratorInfoUndefined: Self = StObject.set(x, "InferenceAcceleratorInfo", js.undefined)
    
    @scala.inline
    def setInstanceStorageInfo(value: InstanceStorageInfo): Self = StObject.set(x, "InstanceStorageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStorageInfoUndefined: Self = StObject.set(x, "InstanceStorageInfo", js.undefined)
    
    @scala.inline
    def setInstanceStorageSupported(value: InstanceStorageFlag): Self = StObject.set(x, "InstanceStorageSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStorageSupportedUndefined: Self = StObject.set(x, "InstanceStorageSupported", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    @scala.inline
    def setNetworkInfo(value: NetworkInfo): Self = StObject.set(x, "NetworkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInfoUndefined: Self = StObject.set(x, "NetworkInfo", js.undefined)
    
    @scala.inline
    def setPlacementGroupInfo(value: PlacementGroupInfo): Self = StObject.set(x, "PlacementGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupInfoUndefined: Self = StObject.set(x, "PlacementGroupInfo", js.undefined)
    
    @scala.inline
    def setProcessorInfo(value: ProcessorInfo): Self = StObject.set(x, "ProcessorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorInfoUndefined: Self = StObject.set(x, "ProcessorInfo", js.undefined)
    
    @scala.inline
    def setSupportedRootDeviceTypes(value: RootDeviceTypeList): Self = StObject.set(x, "SupportedRootDeviceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRootDeviceTypesUndefined: Self = StObject.set(x, "SupportedRootDeviceTypes", js.undefined)
    
    @scala.inline
    def setSupportedRootDeviceTypesVarargs(value: RootDeviceType*): Self = StObject.set(x, "SupportedRootDeviceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedUsageClasses(value: UsageClassTypeList): Self = StObject.set(x, "SupportedUsageClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUsageClassesUndefined: Self = StObject.set(x, "SupportedUsageClasses", js.undefined)
    
    @scala.inline
    def setSupportedUsageClassesVarargs(value: UsageClassType*): Self = StObject.set(x, "SupportedUsageClasses", js.Array(value :_*))
    
    @scala.inline
    def setSupportedVirtualizationTypes(value: VirtualizationTypeList): Self = StObject.set(x, "SupportedVirtualizationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedVirtualizationTypesUndefined: Self = StObject.set(x, "SupportedVirtualizationTypes", js.undefined)
    
    @scala.inline
    def setSupportedVirtualizationTypesVarargs(value: VirtualizationType*): Self = StObject.set(x, "SupportedVirtualizationTypes", js.Array(value :_*))
    
    @scala.inline
    def setVCpuInfo(value: VCpuInfo): Self = StObject.set(x, "VCpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVCpuInfoUndefined: Self = StObject.set(x, "VCpuInfo", js.undefined)
  }
}
