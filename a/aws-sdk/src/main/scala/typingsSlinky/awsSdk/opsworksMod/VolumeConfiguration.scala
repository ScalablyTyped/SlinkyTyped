package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeConfiguration extends StObject {
  
  /**
    * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * The volume mount point. For example "/dev/sdh".
    */
  var MountPoint: String = js.native
  
  /**
    * The number of disks in the volume.
    */
  var NumberOfDisks: Integer = js.native
  
  /**
    * The volume RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.native
  
  /**
    * The volume size.
    */
  var Size: Integer = js.native
  
  /**
    * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
    */
  var VolumeType: js.UndefOr[String] = js.native
}
object VolumeConfiguration {
  
  @scala.inline
  def apply(MountPoint: String, NumberOfDisks: Integer, Size: Integer): VolumeConfiguration = {
    val __obj = js.Dynamic.literal(MountPoint = MountPoint.asInstanceOf[js.Any], NumberOfDisks = NumberOfDisks.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeConfiguration]
  }
  
  @scala.inline
  implicit class VolumeConfigurationMutableBuilder[Self <: VolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setMountPoint(value: String): Self = StObject.set(x, "MountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDisks(value: Integer): Self = StObject.set(x, "NumberOfDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidLevel(value: Integer): Self = StObject.set(x, "RaidLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidLevelUndefined: Self = StObject.set(x, "RaidLevel", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
