package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceEventsRequest extends js.Object {
  
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
  implicit class ListDeviceEventsRequestOps[Self <: ListDeviceEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceId(value: string): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromTimeStamp(value: js.Date): Self = this.set("FromTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTimeStamp(value: js.Date): Self = this.set("ToTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
