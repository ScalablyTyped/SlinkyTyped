package typingsSlinky.googleapis.osloginV1Mod.osloginV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersProjectsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A reference to the POSIX account to update. POSIX accounts are identified
    * by the project ID they are associated with. A reference to the POSIX
    * account is in format `users/{user}/projects/{project}`.
    */
  var name: js.UndefOr[String] = js.native
}

