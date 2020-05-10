package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceResellernotifyUnregister extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The service account which owns the Cloud-PubSub topic.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
}

object ParamsResourceResellernotifyUnregister {
  @scala.inline
  def apply(): ParamsResourceResellernotifyUnregister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResellernotifyUnregister]
  }
  @scala.inline
  implicit class ParamsResourceResellernotifyUnregisterOps[Self <: ParamsResourceResellernotifyUnregister] (val x: Self) extends AnyVal {
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
    def withServiceAccountEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddress")(js.undefined)
        ret
    }
  }
  
}

