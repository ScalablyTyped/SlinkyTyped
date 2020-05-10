package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentsListResponse extends js.Object {
  /** Output only. The deployments contained in this response. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.native
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object DeploymentsListResponse {
  @scala.inline
  def apply(): DeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentsListResponse]
  }
  @scala.inline
  implicit class DeploymentsListResponseOps[Self <: DeploymentsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployments(value: js.Array[Deployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

