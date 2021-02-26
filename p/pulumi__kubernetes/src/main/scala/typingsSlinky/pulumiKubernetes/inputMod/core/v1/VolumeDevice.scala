package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * volumeDevice describes a mapping of a raw block device within a container.
  */
@js.native
trait VolumeDevice extends StObject {
  
  /**
    * devicePath is the path inside of the container that the device will be mapped to.
    */
  var devicePath: Input[String] = js.native
  
  /**
    * name must match the name of a persistentVolumeClaim in the pod
    */
  var name: Input[String] = js.native
}
object VolumeDevice {
  
  @scala.inline
  def apply(devicePath: Input[String], name: Input[String]): VolumeDevice = {
    val __obj = js.Dynamic.literal(devicePath = devicePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeDevice]
  }
  
  @scala.inline
  implicit class VolumeDeviceMutableBuilder[Self <: VolumeDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePath(value: Input[String]): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
