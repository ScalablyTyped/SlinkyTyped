package typingsSlinky.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object. */
@js.native
trait DeviceCommand extends StObject {
  
  /** Returns the commandID for this Command */
  val CommandID: String = js.native
  
  /** Returns the command Description */
  val Description: String = js.native
  
  /** Returns the command Name */
  val Name: String = js.native
  
  @JSName("WIA.DeviceCommand_typekey")
  var WIADotDeviceCommand_typekey: DeviceCommand = js.native
}
object DeviceCommand {
  
  @scala.inline
  def apply(CommandID: String, Description: String, Name: String, WIADotDeviceCommand_typekey: DeviceCommand): DeviceCommand = {
    val __obj = js.Dynamic.literal(CommandID = CommandID.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceCommand_typekey")(WIADotDeviceCommand_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCommand]
  }
  
  @scala.inline
  implicit class DeviceCommandMutableBuilder[Self <: DeviceCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandID(value: String): Self = StObject.set(x, "CommandID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIADotDeviceCommand_typekey(value: DeviceCommand): Self = StObject.set(x, "WIA.DeviceCommand_typekey", value.asInstanceOf[js.Any])
  }
}
