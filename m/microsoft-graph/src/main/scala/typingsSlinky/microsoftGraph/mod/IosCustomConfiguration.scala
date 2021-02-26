package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosCustomConfiguration extends DeviceConfiguration {
  
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[Double] = js.native
  
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[NullableOption[String]] = js.native
  
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.native
}
object IosCustomConfiguration {
  
  @scala.inline
  def apply(): IosCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCustomConfiguration]
  }
  
  @scala.inline
  implicit class IosCustomConfigurationMutableBuilder[Self <: IosCustomConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFileName(value: NullableOption[String]): Self = StObject.set(x, "payloadFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFileNameNull: Self = StObject.set(x, "payloadFileName", null)
    
    @scala.inline
    def setPayloadFileNameUndefined: Self = StObject.set(x, "payloadFileName", js.undefined)
    
    @scala.inline
    def setPayloadName(value: String): Self = StObject.set(x, "payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNameUndefined: Self = StObject.set(x, "payloadName", js.undefined)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
