package typingsSlinky.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MysqlLayerEbsVolume extends StObject {
  
  var encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var iops: js.UndefOr[Double] = js.native
  
  /**
    * The path to mount the EBS volume on the layer's instances.
    */
  var mountPoint: String = js.native
  
  /**
    * The number of disks to use for the EBS volume.
    */
  var numberOfDisks: Double = js.native
  
  /**
    * The RAID level to use for the volume.
    */
  var raidLevel: js.UndefOr[String] = js.native
  
  /**
    * The size of the volume in gigabytes.
    */
  var size: Double = js.native
  
  /**
    * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MysqlLayerEbsVolume {
  
  @scala.inline
  def apply(mountPoint: String, numberOfDisks: Double, size: Double): MysqlLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlLayerEbsVolume]
  }
  
  @scala.inline
  implicit class MysqlLayerEbsVolumeMutableBuilder[Self <: MysqlLayerEbsVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Double): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDisks(value: Double): Self = StObject.set(x, "numberOfDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidLevel(value: String): Self = StObject.set(x, "raidLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidLevelUndefined: Self = StObject.set(x, "raidLevel", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
