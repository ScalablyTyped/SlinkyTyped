package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiCopyEphemeralBlockDevice extends StObject {
  
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}
object AmiCopyEphemeralBlockDevice {
  
  @scala.inline
  def apply(): AmiCopyEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiCopyEphemeralBlockDevice]
  }
  
  @scala.inline
  implicit class AmiCopyEphemeralBlockDeviceMutableBuilder[Self <: AmiCopyEphemeralBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setVirtualName(value: Input[String]): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
