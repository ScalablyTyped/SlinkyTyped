package typingsSlinky.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotInfo extends StObject {
  
  var firmwareVersion: Version = js.native
  
  var flags: Double = js.native
  
  var hardwareVersion: Version = js.native
  
  var manufacturerID: String = js.native
  
  var slotDescription: String = js.native
}
object SlotInfo {
  
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    hardwareVersion: Version,
    manufacturerID: String,
    slotDescription: String
  ): SlotInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], slotDescription = slotDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotInfo]
  }
  
  @scala.inline
  implicit class SlotInfoMutableBuilder[Self <: SlotInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirmwareVersion(value: Version): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareVersion(value: Version): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotDescription(value: String): Self = StObject.set(x, "slotDescription", value.asInstanceOf[js.Any])
  }
}
