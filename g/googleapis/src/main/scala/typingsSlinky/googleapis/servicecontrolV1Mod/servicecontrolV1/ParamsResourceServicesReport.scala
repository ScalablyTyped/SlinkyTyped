package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesReport extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReportRequest] = js.native
  /**
    * The service name as specified in its service configuration. For example,
    * `"pubsub.googleapis.com"`.  See
    * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
    * for the definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.native
}

