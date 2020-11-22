package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequestRootBlockDevice extends js.Object {
  
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the device to mount.
    */
  var deviceName: String = js.native
  
  /**
    * Enable volume encryption. (Default: `false`). Must be configured to perform drift detection.
    */
  var encrypted: Boolean = js.native
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This is only valid for `volumeType` of `"io1/io2"`, and must be specified if
    * using that type
    */
  var iops: Double = js.native
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String = js.native
  
  var volumeId: String = js.native
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double = js.native
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`, `"io2"`, `"sc1"`, or `"st1"`. (Default: `"gp2"`).
    */
  var volumeType: String = js.native
}
object SpotInstanceRequestRootBlockDevice {
  
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): SpotInstanceRequestRootBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestRootBlockDevice]
  }
  
  @scala.inline
  implicit class SpotInstanceRequestRootBlockDeviceOps[Self <: SpotInstanceRequestRootBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
  }
}
