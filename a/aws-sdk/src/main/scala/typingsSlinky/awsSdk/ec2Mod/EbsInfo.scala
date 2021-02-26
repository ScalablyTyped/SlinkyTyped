package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsInfo extends StObject {
  
  /**
    * Describes the optimized EBS performance for the instance type.
    */
  var EbsOptimizedInfo: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EbsOptimizedInfo] = js.native
  
  /**
    * Indicates whether the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-Optimized Instances in Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimizedSupport: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EbsOptimizedSupport] = js.native
  
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  var EncryptionSupport: js.UndefOr[EbsEncryptionSupport] = js.native
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported.
    */
  var NvmeSupport: js.UndefOr[EbsNvmeSupport] = js.native
}
object EbsInfo {
  
  @scala.inline
  def apply(): EbsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInfo]
  }
  
  @scala.inline
  implicit class EbsInfoMutableBuilder[Self <: EbsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsOptimizedInfo(value: EbsOptimizedInfo): Self = StObject.set(x, "EbsOptimizedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedInfoUndefined: Self = StObject.set(x, "EbsOptimizedInfo", js.undefined)
    
    @scala.inline
    def setEbsOptimizedSupport(value: EbsOptimizedSupport): Self = StObject.set(x, "EbsOptimizedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedSupportUndefined: Self = StObject.set(x, "EbsOptimizedSupport", js.undefined)
    
    @scala.inline
    def setEncryptionSupport(value: EbsEncryptionSupport): Self = StObject.set(x, "EncryptionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionSupportUndefined: Self = StObject.set(x, "EncryptionSupport", js.undefined)
    
    @scala.inline
    def setNvmeSupport(value: EbsNvmeSupport): Self = StObject.set(x, "NvmeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNvmeSupportUndefined: Self = StObject.set(x, "NvmeSupport", js.undefined)
  }
}
