package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.achromatopsia
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blurredVision
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deuteranopia
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.none_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.protanopia
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tritanopia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEmulatedVisionDeficiencyRequest extends StObject {
  
  /**
    * Vision deficiency to emulate. (SetEmulatedVisionDeficiencyRequestType enum)
    */
  var `type`: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia = js.native
}
object SetEmulatedVisionDeficiencyRequest {
  
  @scala.inline
  def apply(`type`: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): SetEmulatedVisionDeficiencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEmulatedVisionDeficiencyRequest]
  }
  
  @scala.inline
  implicit class SetEmulatedVisionDeficiencyRequestMutableBuilder[Self <: SetEmulatedVisionDeficiencyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: none_ | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
