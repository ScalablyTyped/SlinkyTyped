package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintent extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest] = js.native
  /**
    * Required. The name of the session this query is sent to. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>`, or
    * `projects/<Project ID>/agent/environments/<Environment ID>/users/<User
    * ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we
    * assume default 'draft' environment. If `User ID` is not specified, we are
    * using "-". It’s up to the API caller to choose an appropriate `Session
    * ID` and `User Id`. They can be a random numbers or some type of user and
    * session identifiers (preferably hashed). The length of the `Session ID`
    * and `User ID` must not exceed 36 characters.
    */
  var session: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintent {
  @scala.inline
  def apply(): ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintent]
  }
  @scala.inline
  implicit class ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintentOps[Self <: ParamsResourceProjectsAgentEnvironmentsUsersSessionsDetectintent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

