package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationRootBlockDevice extends js.Object {
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean = js.native
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double = js.native
  /**
    * The Size of the volume.
    */
  var volumeSize: Double = js.native
  /**
    * The Type of the volume.
    */
  var volumeType: String = js.native
}

object GetLaunchConfigurationRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationRootBlockDevice]
  }
  @scala.inline
  implicit class GetLaunchConfigurationRootBlockDeviceOps[Self <: GetLaunchConfigurationRootBlockDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteOnTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

