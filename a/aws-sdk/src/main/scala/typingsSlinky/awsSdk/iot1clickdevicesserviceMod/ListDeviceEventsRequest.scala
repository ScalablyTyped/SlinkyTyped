package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withDeviceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToTimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

