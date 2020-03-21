package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesDatabasesSetiampolicy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetIamPolicyRequest] = js.native
  /**
    * REQUIRED: The Cloud Spanner resource for which the policy is being set.
    * The format is `projects/<project ID>/instances/<instance ID>` for
    * instance resources and `projects/<project ID>/instances/<instance
    * ID>/databases/<database ID>` for databases resources.
    */
  var resource: js.UndefOr[String] = js.native
}

