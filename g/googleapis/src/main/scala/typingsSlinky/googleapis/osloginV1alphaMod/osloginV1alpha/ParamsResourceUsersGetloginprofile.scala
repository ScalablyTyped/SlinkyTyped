package typingsSlinky.googleapis.osloginV1alphaMod.osloginV1alpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersGetloginprofile extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID for the user in format `users/{user}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of operating system associated with the account.
    */
  var operatingSystemType: js.UndefOr[String] = js.native
  /**
    * The project ID of the Google Cloud Platform project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A system ID for filtering the results of the request.
    */
  var systemId: js.UndefOr[String] = js.native
}

