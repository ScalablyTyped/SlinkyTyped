package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiEphemeralBlockDevice extends StObject {
  
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String = js.native
  
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: String = js.native
}
object AmiEphemeralBlockDevice {
  
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class AmiEphemeralBlockDeviceMutableBuilder[Self <: AmiEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
  }
}
