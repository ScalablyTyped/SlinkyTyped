package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationsRequest extends js.Object {
  /**
    * Configuration ID of an application to be deleted.
    */
  var configurationIds: ApplicationIdsList = js.native
}

object DeleteApplicationsRequest {
  @scala.inline
  def apply(configurationIds: ApplicationIdsList): DeleteApplicationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationsRequest]
  }
  @scala.inline
  implicit class DeleteApplicationsRequestOps[Self <: DeleteApplicationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationIds(value: ApplicationIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

