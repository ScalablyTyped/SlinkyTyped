package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateBlockDeviceMapping extends StObject {
  
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configure EBS volume properties.
    */
  var ebs: js.UndefOr[Input[LaunchTemplateBlockDeviceMappingEbs]] = js.native
  
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}
object LaunchTemplateBlockDeviceMapping {
  
  @scala.inline
  def apply(): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class LaunchTemplateBlockDeviceMappingMutableBuilder[Self <: LaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: Input[LaunchTemplateBlockDeviceMappingEbs]): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: Input[String]): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
