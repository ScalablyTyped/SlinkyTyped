package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequestEphemeralBlockDevice extends js.Object {
  
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: String = js.native
  
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Boolean] = js.native
  
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[String] = js.native
}
object SpotInstanceRequestEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String): SpotInstanceRequestEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class SpotInstanceRequestEphemeralBlockDeviceOps[Self <: SpotInstanceRequestEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
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
    def setNoDevice(value: Boolean): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDevice: Self = this.set("noDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualName: Self = this.set("virtualName", js.undefined)
  }
}
