package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1GetConfigResponse extends js.Object {
  /** The service account Cloud ML uses to access resources in the project. */
  var serviceAccount: js.UndefOr[String] = js.native
  /** The project number for `service_account`. */
  var serviceAccountProject: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1GetConfigResponse {
  @scala.inline
  def apply(): GoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1GetConfigResponse]
  }
  @scala.inline
  implicit class GoogleCloudMlV1GetConfigResponseOps[Self <: GoogleCloudMlV1GetConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountProject")(js.undefined)
        ret
    }
  }
  
}

