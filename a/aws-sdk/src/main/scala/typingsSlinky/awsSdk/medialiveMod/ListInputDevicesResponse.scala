package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputDevicesResponse extends StObject {
  
  /**
    * The list of input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSummary] = js.native
  
  /**
    * A token to get additional list results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListInputDevicesResponse {
  
  @scala.inline
  def apply(): ListInputDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDevicesResponse]
  }
  
  @scala.inline
  implicit class ListInputDevicesResponseMutableBuilder[Self <: ListInputDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDevices(value: listOfInputDeviceSummary): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    @scala.inline
    def setInputDevicesVarargs(value: InputDeviceSummary*): Self = StObject.set(x, "InputDevices", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
