package typingsSlinky.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAdmChannelRequest extends js.Object {
  var ADMChannelRequest: typingsSlinky.awsDashSdk.clientsPinpointMod.ADMChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
}

object UpdateAdmChannelRequest {
  @scala.inline
  def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: __string): UpdateAdmChannelRequest = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAdmChannelRequest]
  }
}

