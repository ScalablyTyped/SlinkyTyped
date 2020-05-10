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
  @scala.inline
  implicit class GetAppsResponseOps[Self <: GetAppsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationsResponse(value: ApplicationsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

