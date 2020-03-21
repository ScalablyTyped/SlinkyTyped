package typingsSlinky.googleapis.firebaserulesV1Mod.firebaserulesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsReleasesGetexecutable extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The requested runtime executable version. Defaults to
    * FIREBASE_RULES_EXECUTABLE_V1.
    */
  var executableVersion: js.UndefOr[String] = js.native
  /**
    * Resource name of the `Release`.  Format:
    * `projects/{project_id}/releases/{release_id}`
    */
  var name: js.UndefOr[String] = js.native
}

