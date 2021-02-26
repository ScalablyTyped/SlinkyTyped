package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceEventsRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  
  /**
    * The start date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var FromTimeStamp: js.Date = js.native
  
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.MaxResults] = js.native
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The end date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var ToTimeStamp: js.Date = js.native
}
object ListDeviceEventsRequest {
  
  @scala.inline
  def apply(DeviceId: string, FromTimeStamp: js.Date, ToTimeStamp: js.Date): ListDeviceEventsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], FromTimeStamp = FromTimeStamp.asInstanceOf[js.Any], ToTimeStamp = ToTimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceEventsRequest]
  }
  
  @scala.inline
  implicit class ListDeviceEventsRequestMutableBuilder[Self <: ListDeviceEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromTimeStamp(value: js.Date): Self = StObject.set(x, "FromTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setToTimeStamp(value: js.Date): Self = StObject.set(x, "ToTimeStamp", value.asInstanceOf[js.Any])
  }
}
