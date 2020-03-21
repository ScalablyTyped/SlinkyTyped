package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGetmetrics extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional field indicating a specific deployment to retrieve metrics from.
    */
  @JSName("metricsFilter.deploymentId")
  var metricsFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Required field indicating what granularity of metrics are returned.
    */
  var metricsGranularity: js.UndefOr[String] = js.native
  /**
    * Required field indicating the script to get metrics for.
    */
  var scriptId: js.UndefOr[String] = js.native
}

