package typingsSlinky.googleapis.mlV1Mod.mlV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsJobsTestiampermissions extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIamV1TestIamPermissionsRequest] = js.native
  /**
    * REQUIRED: The resource for which the policy detail is being requested.
    * See the operation documentation for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.native
}

