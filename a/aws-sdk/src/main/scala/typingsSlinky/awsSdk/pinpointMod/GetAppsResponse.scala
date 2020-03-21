package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppsResponse extends js.Object {
  var ApplicationsResponse: typingsSlinky.awsSdk.pinpointMod.ApplicationsResponse = js.native
}

object GetAppsResponse {
  @scala.inline
  def apply(ApplicationsResponse: ApplicationsResponse): GetAppsResponse = {
    val __obj = js.Dynamic.literal(ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAppsResponse]
  }
}

