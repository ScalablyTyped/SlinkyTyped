package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeviceResponse extends StObject {
  
  /**
    * Device details.
    */
  var DeviceDescription: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.DeviceDescription] = js.native
}
object DescribeDeviceResponse {
  
  @scala.inline
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  @scala.inline
  implicit class DescribeDeviceResponseMutableBuilder[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceDescription(value: DeviceDescription): Self = StObject.set(x, "DeviceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescriptionUndefined: Self = StObject.set(x, "DeviceDescription", js.undefined)
  }
}
